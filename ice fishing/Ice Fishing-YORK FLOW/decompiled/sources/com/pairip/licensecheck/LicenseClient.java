package com.pairip.licensecheck;

/* loaded from: classes.dex */
public class LicenseClient implements android.content.ServiceConnection {
    private static final java.lang.String BACKGROUND_SERVICE_INTERFACE_CLASS_NAME = "com.android.vending.licensing.IBackgroundLicensingService";
    private static final int ERROR_INVALID_PACKAGE_NAME = 3;
    private static final int EVENTUAL_SHUTDOWN_DELAY_MILLIS = 30000;
    private static final int FIRST_ISOLATED_UID = 99000;
    private static final int FLAG_RPC_CALL = 0;
    private static final int LAST_ISOLATED_UID = 99999;
    private static final int LICENSED = 0;
    private static final int MAX_RETRIES = 3;
    private static final int MILLIS_PER_SEC = 1000;
    private static final int NOT_LICENSED = 2;
    private static final java.lang.String PAYLOAD_PAYWALL = "PAYWALL_INTENT";
    private static final int PER_USER_RANGE = 100000;
    private static final int REPEATED_CHECK_RETRY_DELAY_MILLIS = 300000;
    private static final int RETRY_DELAY_MILLIS = 1000;
    private static final java.lang.String SERVICE_INTERFACE_CLASS_NAME = "com.android.vending.licensing.ILicensingService";
    private static final java.lang.String SERVICE_PACKAGE = "com.android.vending";
    private static final java.lang.String TAG = "LicenseClient";
    private static final int TRANSACTION_CHECK_LICENSE_V2 = 2;
    private static final int TRANSACTION_REPORT_SUCCESSFUL_LICENSE_CHECK = 3;
    protected static boolean backgroundLicensingServiceEnabled = false;
    protected static boolean eventualShutdownEnabled = true;
    public static boolean gracefulShutdownEnabled = true;
    private static final android.os.Handler handler;
    protected static java.lang.String licensePubKey = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAsdOXClMossFQDYlz3/ajVg2ZuPlgxSU7EoRELsOQ0IUH6FO1K1/hEDQE56ys6R4BbVLnZIlI9X9f81x4xrPi1J0lF+UM1YYNIOcjZMM+YuQ5j8ck3f9HvKImgcZf5LZeomwJ9nAFHePzC8YivmOiimiDF17eGFOyP3PAG5iw32NQIuq+C6S82T98K0TJj6hYb6k3yGQ1MfFy1Lh13bCuAEURUwNgPaVApzzXe/BVLsf6GJHfx6ieoVxSRaKD+lGTjUJFBXqjJV6pYQQsb9+Tg1AHZ47XruRgqwq3F8QxJfBK0lv26NscZTkfbb2plixabiRW3cJUxOl9DaAageREJQIDAQAB";
    protected static boolean localCheckEnabled = true;
    protected static com.pairip.licensecheck.LicenseClient.ImmediateTaskExecutor mainThreadRunner = null;
    protected static java.lang.String packageName = "com.ice.fishing.wolberta";
    protected static boolean repeatedCheckEnabled = true;
    protected static android.os.Bundle responsePayload;
    private final android.content.Context context;
    protected static java.lang.Runnable exitAction = new java.lang.Runnable() { // from class: com.pairip.licensecheck.LicenseClient.1
        @Override // java.lang.Runnable
        public void run() {
            java.lang.System.exit(0);
        }
    };
    protected static com.pairip.licensecheck.LicenseClient.LicenseCheckState licenseCheckState = com.pairip.licensecheck.LicenseClient.LicenseCheckState.CHECK_REQUIRED;
    protected static com.pairip.licensecheck.LicenseClient.ImmediateTaskExecutor backgroundRunner = new com.pairip.licensecheck.LicenseClient.ImmediateTaskExecutor() { // from class: com.pairip.licensecheck.LicenseClient$$ExternalSyntheticLambda2
        @Override // com.pairip.licensecheck.LicenseClient.ImmediateTaskExecutor
        public final void run(java.lang.Runnable runnable) {
            new java.lang.Thread(runnable).start();
        }
    };
    protected com.pairip.licensecheck.LicenseClient.DelayedTaskExecutor delayedTaskExecutor = new com.pairip.licensecheck.LicenseClient.DelayedTaskExecutorImpl();
    private int retryNum = 0;
    protected boolean waitingForRepeatedCheck = false;
    private long repeatedCheckStartElapsedRealtime = 0;

    public interface DelayedTaskExecutor {
        void schedule(java.lang.Runnable task, long delayMillis);
    }

    public interface ImmediateTaskExecutor {
        void run(java.lang.Runnable task);
    }

    public enum LicenseCheckState {
        CHECK_REQUIRED,
        FULL_CHECK_OK,
        LOCAL_CHECK_OK,
        LOCAL_CHECK_REPORTED,
        REPEATED_CHECK_REQUIRED
    }

    static {
        final android.os.Handler handler2 = new android.os.Handler(android.os.Looper.getMainLooper());
        handler = handler2;
        java.util.Objects.requireNonNull(handler2);
        mainThreadRunner = new com.pairip.licensecheck.LicenseClient.ImmediateTaskExecutor() { // from class: com.pairip.licensecheck.LicenseClient$$ExternalSyntheticLambda3
            @Override // com.pairip.licensecheck.LicenseClient.ImmediateTaskExecutor
            public final void run(java.lang.Runnable runnable) {
                handler2.post(runnable);
            }
        };
    }

    public static void checkLicense(android.content.Context context) {
        if (isIsolatedProcess()) {
            android.util.Log.i(TAG, "Skipping license check in isolated process.");
        } else {
            new com.pairip.licensecheck.LicenseClient(context).initializeLicenseCheck();
        }
    }

    private static boolean isIsolatedProcess() {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return android.os.Process.isIsolated();
        }
        int myUid = android.os.Process.myUid() % PER_USER_RANGE;
        return myUid >= FIRST_ISOLATED_UID && myUid <= LAST_ISOLATED_UID;
    }

    public static java.lang.String getLicensePubKey() {
        return licensePubKey;
    }

    public LicenseClient(android.content.Context context) {
        this.context = context;
    }

    public void initializeLicenseCheck() {
        int ordinal = licenseCheckState.ordinal();
        if (ordinal == 0) {
            if (localCheckEnabled) {
                backgroundRunner.run(new java.lang.Runnable() { // from class: com.pairip.licensecheck.LicenseClient$$ExternalSyntheticLambda4
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.pairip.licensecheck.LicenseClient.this.lambda$initializeLicenseCheck$0();
                    }
                });
                return;
            } else {
                lambda$retryOrThrow$0(false);
                return;
            }
        }
        if (ordinal != 1) {
            if (ordinal != 4) {
                return;
            }
            lambda$retryOrThrow$0(false);
        } else {
            try {
                com.pairip.licensecheck.LicenseResponseHelper.validateResponse(responsePayload, packageName);
            } catch (com.pairip.licensecheck.LicenseCheckException e) {
                handleError(e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initializeLicenseCheck$0() {
        final boolean performLocalInstallerCheck = performLocalInstallerCheck();
        mainThreadRunner.run(new java.lang.Runnable() { // from class: com.pairip.licensecheck.LicenseClient$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.pairip.licensecheck.LicenseClient.this.lambda$initializeLicenseCheck$1(performLocalInstallerCheck);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initializeLicenseCheck$1(boolean z) {
        if (z) {
            licenseCheckState = com.pairip.licensecheck.LicenseClient.LicenseCheckState.LOCAL_CHECK_OK;
        }
        lambda$retryOrThrow$0(z && backgroundLicensingServiceEnabled);
    }

    private boolean performLocalInstallerCheck() {
        try {
            if (android.os.Build.VERSION.SDK_INT < 30) {
                android.util.Log.i(TAG, "Local install check bypassed due to old SDK version.");
                return false;
            }
            android.content.pm.PackageManager packageManager = this.context.getPackageManager();
            if (packageManager == null) {
                android.util.Log.i(TAG, "Local install check bypassed due to package manager not found.");
                return false;
            }
            android.content.pm.PackageInfo packageInfo = packageManager.getPackageInfo(packageName, 0);
            if (packageInfo != null && packageInfo.applicationInfo != null) {
                int i = packageInfo.applicationInfo.flags;
                if ((i & 1) == 0 && (i & 128) == 0) {
                    android.content.pm.InstallSourceInfo installSourceInfo = packageManager.getInstallSourceInfo(packageName);
                    if (installSourceInfo == null) {
                        android.util.Log.i(TAG, "Local install check bypassed due to install source info not found.");
                        return false;
                    }
                    java.lang.String installingPackageName = installSourceInfo.getInstallingPackageName();
                    if (installingPackageName != null && installingPackageName.equals(SERVICE_PACKAGE)) {
                        return true;
                    }
                    android.util.Log.i(TAG, "Local install check failed due to wrong installer.");
                    return false;
                }
                android.util.Log.i(TAG, "Local install check passed due to system app.");
                return true;
            }
            android.util.Log.i(TAG, "Local install check bypassed due to app package info not found.");
            return false;
        } catch (java.lang.Exception e) {
            android.util.Log.w(TAG, "Could not obtain package info for local installer check.", e);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: connectToLicensingService, reason: merged with bridge method [inline-methods] */
    public void lambda$retryOrThrow$0(boolean useBackgroundService) {
        java.lang.String str;
        java.lang.String str2;
        if (useBackgroundService) {
            str = "Connecting to the background licensing service...";
        } else {
            str = "Connecting to the main licensing service...";
        }
        android.util.Log.d(TAG, str);
        if (useBackgroundService) {
            str2 = BACKGROUND_SERVICE_INTERFACE_CLASS_NAME;
        } else {
            str2 = SERVICE_INTERFACE_CLASS_NAME;
        }
        try {
            if (this.context.bindService(new android.content.Intent(str2).setPackage(SERVICE_PACKAGE).setAction(str2), this, 1)) {
                return;
            }
            retryOrThrow(new com.pairip.licensecheck.LicenseCheckException("Could not bind with the licensing service: ".concat(str2)), useBackgroundService, useBackgroundService);
        } catch (java.lang.SecurityException e) {
            retryOrThrow(new com.pairip.licensecheck.LicenseCheckException("Not allowed to bind with the licensing service: ".concat(str2), e), useBackgroundService, useBackgroundService);
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(android.content.ComponentName componentName, final android.os.IBinder licensingServiceBinder) {
        android.util.Log.d(TAG, "Connected to the licensing service.");
        int ordinal = licenseCheckState.ordinal();
        if (ordinal != 0) {
            if (ordinal == 2) {
                backgroundRunner.run(new java.lang.Runnable() { // from class: com.pairip.licensecheck.LicenseClient$$ExternalSyntheticLambda6
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.pairip.licensecheck.LicenseClient.this.lambda$onServiceConnected$1(licensingServiceBinder);
                    }
                });
                return;
            } else if (ordinal != 4) {
                return;
            }
        }
        backgroundRunner.run(new java.lang.Runnable() { // from class: com.pairip.licensecheck.LicenseClient$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                com.pairip.licensecheck.LicenseClient.this.lambda$onServiceConnected$0(licensingServiceBinder);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onServiceConnected$0(android.os.IBinder iBinder) {
        try {
            checkLicenseInternal(iBinder);
        } catch (android.os.RemoteException e) {
            handleError(new com.pairip.licensecheck.LicenseCheckException("Error when getting interface descriptor.", e));
        } catch (com.pairip.licensecheck.LicenseCheckException e2) {
            handleError(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onServiceConnected$1(android.os.IBinder iBinder) {
        try {
            reportSuccessfulLicenseCheck(iBinder);
        } catch (java.lang.Exception e) {
            android.util.Log.e(TAG, "Error while reporting license check: " + android.util.Log.getStackTraceString(e));
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(android.content.ComponentName componentName) {
        if (licenseCheckState.equals(com.pairip.licensecheck.LicenseClient.LicenseCheckState.REPEATED_CHECK_REQUIRED) && this.waitingForRepeatedCheck) {
            android.util.Log.d(TAG, "Ignoring service disconnection in REPEATED_CHECK_REQUIRED state.");
        } else {
            android.util.Log.w(TAG, "Unexpectedly disconnected from the licensing service.");
            retryOrThrow(new com.pairip.licensecheck.LicenseCheckException("Licensing service unexpectedly disconnected."));
        }
    }

    private void checkLicenseInternal(android.os.IBinder licensingServiceBinder) throws com.pairip.licensecheck.LicenseCheckException, android.os.RemoteException {
        if (licensingServiceBinder == null) {
            retryOrThrow(new com.pairip.licensecheck.LicenseCheckException("Received a null binder."));
            return;
        }
        if (licensingServiceBinder.getInterfaceDescriptor().equals(BACKGROUND_SERVICE_INTERFACE_CLASS_NAME)) {
            throw new com.pairip.licensecheck.LicenseCheckException("Background licensing service does not support full license check.");
        }
        android.util.Log.d(TAG, "Sending request to licensing service...");
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            try {
                populateInputDataForLicenseCheckV2(obtain, licensingServiceBinder);
                if (!licensingServiceBinder.transact(2, obtain, obtain2, 0)) {
                    handleError(new com.pairip.licensecheck.LicenseCheckException("Licensing service could not process request."));
                }
            } catch (android.os.DeadObjectException e) {
                retryOrThrow(new com.pairip.licensecheck.LicenseCheckException("Licensing service process died.", e));
            } catch (android.os.RemoteException e2) {
                handleError(new com.pairip.licensecheck.LicenseCheckException("Error when calling licensing service.", e2));
            }
        } finally {
            obtain.recycle();
            obtain2.recycle();
            android.util.Log.d(TAG, "Request to licensing service sent.");
        }
    }

    public void reportSuccessfulLicenseCheck(android.os.IBinder licensingServiceBinder) throws com.pairip.licensecheck.LicenseCheckException {
        if (licensingServiceBinder == null) {
            retryOrThrow(new com.pairip.licensecheck.LicenseCheckException("Received a null binder."), true, backgroundLicensingServiceEnabled);
            return;
        }
        android.util.Log.d(TAG, "Sending request to license reporting service...");
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            try {
                try {
                    populateInputDataForReportAutoVerifiedLicense(obtain, licensingServiceBinder);
                    boolean transact = licensingServiceBinder.transact(3, obtain, obtain2, 0);
                    if (!transact) {
                        android.util.Log.e(TAG, "Error sending request to license reporting service.");
                    }
                    if (transact) {
                        mainThreadRunner.run(new java.lang.Runnable() { // from class: com.pairip.licensecheck.LicenseClient$$ExternalSyntheticLambda8
                            @Override // java.lang.Runnable
                            public final void run() {
                                com.pairip.licensecheck.LicenseClient.licenseCheckState = com.pairip.licensecheck.LicenseClient.LicenseCheckState.LOCAL_CHECK_REPORTED;
                            }
                        });
                    }
                } catch (android.os.RemoteException e) {
                    android.util.Log.e(TAG, "Error when calling licensing service." + java.lang.String.valueOf(e));
                }
            } catch (android.os.DeadObjectException e2) {
                retryOrThrow(new com.pairip.licensecheck.LicenseCheckException("Licensing service process died.", e2), true, backgroundLicensingServiceEnabled);
            }
        } finally {
            obtain.recycle();
            obtain2.recycle();
            android.util.Log.d(TAG, "Request to licensing reporting service sent.");
        }
    }

    private void populateInputDataForLicenseCheckV2(android.os.Parcel inputData, android.os.IBinder licensingService) throws android.os.RemoteException {
        inputData.writeInterfaceToken(licensingService.getInterfaceDescriptor());
        inputData.writeString(packageName);
        inputData.writeStrongBinder(createResultListener(this).asBinder());
        inputData.writeInt(0);
    }

    private void populateInputDataForReportAutoVerifiedLicense(android.os.Parcel inputData, android.os.IBinder licensingService) throws android.os.RemoteException {
        inputData.writeInterfaceToken(licensingService.getInterfaceDescriptor());
        inputData.writeString(packageName);
        inputData.writeInt(0);
    }

    private static com.pairip.licensecheck.ILicenseV2ResultListener createResultListener(com.pairip.licensecheck.LicenseClient client) {
        return new com.pairip.licensecheck.ILicenseV2ResultListener.Stub() { // from class: com.pairip.licensecheck.LicenseClient.2
            @Override // com.pairip.licensecheck.ILicenseV2ResultListener
            public void verifyLicense(int responseCode, android.os.Bundle responsePayload2) {
                com.pairip.licensecheck.LicenseClient.this.processResponse(responseCode, responsePayload2);
            }
        };
    }

    private void retryOrThrow(com.pairip.licensecheck.LicenseCheckException error) {
        retryOrThrow(error, false, false);
    }

    private void retryOrThrow(com.pairip.licensecheck.LicenseCheckException error, boolean ignoreErrorOnFinalFailure, final boolean useBackgroundService) {
        int i = this.retryNum;
        if (i < 3) {
            this.retryNum = i + 1;
            this.delayedTaskExecutor.schedule(new java.lang.Runnable() { // from class: com.pairip.licensecheck.LicenseClient$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    com.pairip.licensecheck.LicenseClient.this.lambda$retryOrThrow$0(useBackgroundService);
                }
            }, 1000L);
            android.util.Log.d(TAG, java.lang.String.format("Retry #%d. License check failed with error '%s'. Next try in %ds...", java.lang.Integer.valueOf(this.retryNum), error == null ? "null" : error.getMessage(), 1L));
        } else {
            if (ignoreErrorOnFinalFailure) {
                android.util.Log.e(TAG, "Retry limit reached for: " + java.lang.String.valueOf(error));
                return;
            }
            handleError(error);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processResponse(int responseCode, final android.os.Bundle responsePayload2) {
        try {
            if (responseCode == 3) {
                throw new com.pairip.licensecheck.LicenseCheckException("Request package name invalid.");
            }
            if (responseCode != 0) {
                if (responseCode == 2) {
                    startPaywallActivity((android.app.PendingIntent) responsePayload2.getParcelable(PAYLOAD_PAYWALL));
                    return;
                }
                throw new com.pairip.licensecheck.LicenseCheckException(java.lang.String.format("Unexpected response code %d received.", java.lang.Integer.valueOf(responseCode)));
            }
            com.pairip.licensecheck.LicenseResponseHelper.validateResponse(responsePayload2, packageName);
            android.util.Log.i(TAG, "License check succeeded.");
            final com.pairip.licensecheck.RepeatedCheckMetadata repeatedCheckMetadata = repeatedCheckEnabled ? com.pairip.licensecheck.LicenseResponseHelper.getRepeatedCheckMetadata(responsePayload2) : null;
            mainThreadRunner.run(new java.lang.Runnable() { // from class: com.pairip.licensecheck.LicenseClient$$ExternalSyntheticLambda7
                @Override // java.lang.Runnable
                public final void run() {
                    com.pairip.licensecheck.LicenseClient.this.lambda$processResponse$0(repeatedCheckMetadata, responsePayload2);
                }
            });
        } catch (com.pairip.licensecheck.LicenseCheckException e) {
            handleError(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processResponse$0(com.pairip.licensecheck.RepeatedCheckMetadata repeatedCheckMetadata, android.os.Bundle bundle) {
        if (repeatedCheckMetadata != null) {
            licenseCheckState = com.pairip.licensecheck.LicenseClient.LicenseCheckState.REPEATED_CHECK_REQUIRED;
            this.repeatedCheckStartElapsedRealtime = getElapsedRealtimeMillis();
            scheduleRepeatedLicenseCheck(repeatedCheckMetadata);
        } else {
            licenseCheckState = com.pairip.licensecheck.LicenseClient.LicenseCheckState.FULL_CHECK_OK;
        }
        responsePayload = bundle;
    }

    private void scheduleRepeatedLicenseCheck(final com.pairip.licensecheck.RepeatedCheckMetadata repeatedCheckMetadata) {
        long min = java.lang.Math.min(java.lang.Math.min(repeatedCheckMetadata.getDurationToRetryMillis(), java.lang.Math.max(0L, repeatedCheckMetadata.getTimeToRetryMillis() - getCurrentTimeMillis())), 300000L);
        if (!this.waitingForRepeatedCheck) {
            this.waitingForRepeatedCheck = true;
            try {
                this.context.unbindService(this);
            } catch (java.lang.RuntimeException e) {
                android.util.Log.e(TAG, "Failed to unbind service for repeated license check.", e);
            }
        }
        this.delayedTaskExecutor.schedule(new java.lang.Runnable() { // from class: com.pairip.licensecheck.LicenseClient$$ExternalSyntheticLambda9
            @Override // java.lang.Runnable
            public final void run() {
                com.pairip.licensecheck.LicenseClient.this.lambda$scheduleRepeatedLicenseCheck$0(repeatedCheckMetadata);
            }
        }, min);
        android.util.Log.d(TAG, java.lang.String.format("Repeated license check is scheduled in %d ms...", java.lang.Long.valueOf(min)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$scheduleRepeatedLicenseCheck$0(com.pairip.licensecheck.RepeatedCheckMetadata repeatedCheckMetadata) {
        long elapsedRealtimeMillis = getElapsedRealtimeMillis() - this.repeatedCheckStartElapsedRealtime;
        if (getCurrentTimeMillis() >= repeatedCheckMetadata.getTimeToRetryMillis() || elapsedRealtimeMillis >= repeatedCheckMetadata.getDurationToRetryMillis()) {
            this.waitingForRepeatedCheck = false;
            lambda$retryOrThrow$0(false);
        } else {
            android.util.Log.d(TAG, "Repeated license check is rescheduled.");
            scheduleRepeatedLicenseCheck(repeatedCheckMetadata);
        }
    }

    private void handleError(com.pairip.licensecheck.LicenseCheckException ex) {
        android.util.Log.e(TAG, "Error while checking license: " + android.util.Log.getStackTraceString(ex));
        if (licenseCheckState.equals(com.pairip.licensecheck.LicenseClient.LicenseCheckState.FULL_CHECK_OK)) {
            return;
        }
        startErrorDialogActivity();
    }

    private void startPaywallActivity(android.app.PendingIntent paywallIntent) {
        android.content.Intent createCloseAppIntentOrExitIfAppInBackground = createCloseAppIntentOrExitIfAppInBackground();
        createCloseAppIntentOrExitIfAppInBackground.putExtra(com.pairip.licensecheck.LicenseActivity.PAYWALL_INTENT_ARG_NAME, paywallIntent);
        createCloseAppIntentOrExitIfAppInBackground.putExtra(com.pairip.licensecheck.LicenseActivity.ACTIVITY_TYPE_ARG_NAME, com.pairip.licensecheck.LicenseActivity.ActivityType.PAYWALL);
        scheduleAppShutdown();
        this.context.startActivity(createCloseAppIntentOrExitIfAppInBackground);
    }

    private void startErrorDialogActivity() {
        android.content.Intent createCloseAppIntentOrExitIfAppInBackground = createCloseAppIntentOrExitIfAppInBackground();
        createCloseAppIntentOrExitIfAppInBackground.putExtra(com.pairip.licensecheck.LicenseActivity.ACTIVITY_TYPE_ARG_NAME, com.pairip.licensecheck.LicenseActivity.ActivityType.ERROR_DIALOG);
        scheduleAppShutdown();
        this.context.startActivity(createCloseAppIntentOrExitIfAppInBackground);
    }

    private android.content.Intent createCloseAppIntentOrExitIfAppInBackground() {
        if (!isForeground()) {
            exitAction.run();
        }
        android.content.Intent intent = new android.content.Intent(this.context, (java.lang.Class<?>) com.pairip.licensecheck.LicenseActivity.class);
        if (gracefulShutdownEnabled) {
            intent.addFlags(65536);
        } else {
            intent.addFlags(67108864);
            intent.addFlags(32768);
        }
        intent.addFlags(268435456);
        return intent;
    }

    private boolean isForeground() {
        android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new android.app.ActivityManager.RunningAppProcessInfo();
        android.app.ActivityManager.getMyMemoryState(runningAppProcessInfo);
        return runningAppProcessInfo.importance <= 100;
    }

    protected long getCurrentTimeMillis() {
        return java.lang.System.currentTimeMillis();
    }

    protected long getElapsedRealtimeMillis() {
        return android.os.SystemClock.elapsedRealtime();
    }

    private void scheduleAppShutdown() {
        if (eventualShutdownEnabled) {
            this.delayedTaskExecutor.schedule(exitAction, 30000L);
        }
    }

    private static class DelayedTaskExecutorImpl implements com.pairip.licensecheck.LicenseClient.DelayedTaskExecutor {
        private final android.os.Handler handler;

        private DelayedTaskExecutorImpl() {
            this.handler = new android.os.Handler(android.os.Looper.getMainLooper());
        }

        @Override // com.pairip.licensecheck.LicenseClient.DelayedTaskExecutor
        public void schedule(java.lang.Runnable task, long delayMillis) {
            this.handler.postDelayed(task, delayMillis);
        }
    }
}
