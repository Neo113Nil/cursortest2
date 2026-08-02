package androidx.activity;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.contextaware.ContextAwareHelper;
import androidx.activity.contextaware.OnContextAvailableListener;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultCaller;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.ActivityResultRegistryOwner;
import androidx.activity.result.IntentSenderRequest;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.core.app.ActivityCompat;
import androidx.core.app.MultiWindowModeChangedInfo;
import androidx.core.app.OnMultiWindowModeChangedProvider;
import androidx.core.app.OnPictureInPictureModeChangedProvider;
import androidx.core.app.PictureInPictureModeChangedInfo;
import androidx.core.content.OnConfigurationChangedProvider;
import androidx.core.content.OnTrimMemoryProvider;
import androidx.core.util.Consumer;
import androidx.core.view.MenuHost;
import androidx.core.view.MenuHostHelper;
import androidx.core.view.MenuHostHelper$$ExternalSyntheticLambda0;
import androidx.core.view.MenuHostHelper$$ExternalSyntheticLambda1;
import androidx.core.view.MenuProvider;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ReportFragment;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModelProvider$AndroidViewModelFactory;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.MutableCreationExtras;
import androidx.media3.common.util.ListenerSet$$ExternalSyntheticLambda1;
import androidx.navigationevent.DirectNavigationEventInput;
import androidx.navigationevent.NavigationEventDispatcher;
import androidx.navigationevent.NavigationEventDispatcherOwner;
import androidx.savedstate.Recreator;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryController;
import androidx.savedstate.SavedStateRegistryOwner;
import androidx.savedstate.internal.SavedStateRegistryImpl;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.ImageLoader$Builder$$ExternalSyntheticLambda1;
import com.appsflyer.AFLogger$$ExternalSyntheticLambda0;
import com.squareup.cash.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

/* loaded from: classes.dex */
public class ComponentActivity extends androidx.core.app.ComponentActivity implements LifecycleOwner, ViewModelStoreOwner, HasDefaultViewModelProviderFactory, SavedStateRegistryOwner, OnBackPressedDispatcherOwner, NavigationEventDispatcherOwner, ActivityResultRegistryOwner, ActivityResultCaller, OnConfigurationChangedProvider, OnTrimMemoryProvider, OnMultiWindowModeChangedProvider, OnPictureInPictureModeChangedProvider, MenuHost, FullyDrawnReporterOwner {
    public static final /* synthetic */ int $r8$clinit = 0;
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private static final Companion Companion = new Companion();
    private ViewModelStore _viewModelStore;
    private final ActivityResultRegistry activityResultRegistry;
    private int contentLayoutId;
    private final ContextAwareHelper contextAwareHelper;
    private final Lazy defaultViewModelProviderFactory$delegate;
    private boolean dispatchingOnMultiWindowModeChanged;
    private boolean dispatchingOnPictureInPictureModeChanged;
    private final Lazy fullyDrawnReporter$delegate;
    private final MenuHostHelper menuHostHelper;
    private final AtomicInteger nextLocalRequestCode;
    private final Lazy onBackPressedDispatcher$delegate;
    private final Lazy onBackPressedInput$delegate;
    private final CopyOnWriteArrayList<Consumer<Configuration>> onConfigurationChangedListeners;
    private final CopyOnWriteArrayList<Consumer<MultiWindowModeChangedInfo>> onMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList<Consumer<Intent>> onNewIntentListeners;
    private final CopyOnWriteArrayList<Consumer<PictureInPictureModeChangedInfo>> onPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList<Consumer<Integer>> onTrimMemoryListeners;
    private final CopyOnWriteArrayList<Runnable> onUserLeaveHintListeners;
    private final ReportFullyDrawnExecutor reportFullyDrawnExecutor;
    private final SavedStateRegistryController savedStateRegistryController;

    public final class Companion {
    }

    public final class NonConfigurationInstances {
        public Object custom;
        public ViewModelStore viewModelStore;
    }

    public interface ReportFullyDrawnExecutor extends Executor {
    }

    public final class ReportFullyDrawnExecutorImpl implements ReportFullyDrawnExecutor, ViewTreeObserver.OnDrawListener, Runnable {
        public Runnable currentRunnable;
        public final long endWatchTimeMillis = SystemClock.uptimeMillis() + 10000;
        public boolean onDrawScheduled;

        public ReportFullyDrawnExecutorImpl() {
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            runnable.getClass();
            this.currentRunnable = runnable;
            View decorView = ComponentActivity.this.getWindow().getDecorView();
            decorView.getClass();
            if (!this.onDrawScheduled) {
                decorView.postOnAnimation(new AFLogger$$ExternalSyntheticLambda0(this, 1));
            } else if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                decorView.invalidate();
            } else {
                decorView.postInvalidate();
            }
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public final void onDraw() {
            boolean z;
            ComponentActivity componentActivity = ComponentActivity.this;
            Runnable runnable = this.currentRunnable;
            if (runnable == null) {
                if (SystemClock.uptimeMillis() > this.endWatchTimeMillis) {
                    this.onDrawScheduled = false;
                    componentActivity.getWindow().getDecorView().post(this);
                    return;
                }
                return;
            }
            runnable.run();
            this.currentRunnable = null;
            FullyDrawnReporter fullyDrawnReporter = componentActivity.getFullyDrawnReporter();
            synchronized (fullyDrawnReporter.lock) {
                z = fullyDrawnReporter.reportedFullyDrawn;
            }
            if (z) {
                this.onDrawScheduled = false;
                componentActivity.getWindow().getDecorView().post(this);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            ComponentActivity.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }

        public final void viewCreated(View view) {
            view.getClass();
            if (this.onDrawScheduled) {
                return;
            }
            this.onDrawScheduled = true;
            view.getViewTreeObserver().addOnDrawListener(this);
        }
    }

    public static Bundle $r8$lambda$QUUwrpYSdd6n6dD7wrAaa0S4oXg(ComponentActivity componentActivity) {
        Bundle bundle = new Bundle();
        ActivityResultRegistry activityResultRegistry = componentActivity.activityResultRegistry;
        activityResultRegistry.getClass();
        LinkedHashMap linkedHashMap = activityResultRegistry.keyToRc;
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(activityResultRegistry.launchedKeys));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(activityResultRegistry.pendingResults));
        return bundle;
    }

    public static void $r8$lambda$XCwb6u5X87zpWrZW4Zmu6tsKQC8(OnBackPressedDispatcher onBackPressedDispatcher, ComponentActivity componentActivity, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_CREATE) {
            OnBackInvokedDispatcher onBackInvokedDispatcher = componentActivity.getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.getClass();
            onBackPressedDispatcher.setOnBackInvokedDispatcher(onBackInvokedDispatcher);
        }
    }

    public static FullyDrawnReporter $r8$lambda$Xj9c8VIP9DfEvaTmZt0ejAuC4a4(ComponentActivity componentActivity) {
        return new FullyDrawnReporter(componentActivity.reportFullyDrawnExecutor, new ComponentActivity$$ExternalSyntheticLambda1(componentActivity, 1));
    }

    /* renamed from: $r8$lambda$h6vvr6zUWA2U1fE-0KsKpOgpr28, reason: not valid java name */
    public static void m5$r8$lambda$h6vvr6zUWA2U1fE0KsKpOgpr28(ComponentActivity componentActivity, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            componentActivity.contextAwareHelper.context = null;
            if (!componentActivity.isChangingConfigurations()) {
                componentActivity.getViewModelStore().clear();
            }
            ReportFullyDrawnExecutorImpl reportFullyDrawnExecutorImpl = (ReportFullyDrawnExecutorImpl) componentActivity.reportFullyDrawnExecutor;
            ComponentActivity componentActivity2 = ComponentActivity.this;
            componentActivity2.getWindow().getDecorView().removeCallbacks(reportFullyDrawnExecutorImpl);
            componentActivity2.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(reportFullyDrawnExecutorImpl);
        }
    }

    public static void $r8$lambda$vCwjfXDiSGcirCy4I008VOiJ_lw(ComponentActivity componentActivity) {
        try {
            super.onBackPressed();
        } catch (IllegalStateException e) {
            if (!Intrinsics.areEqual(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                throw e;
            }
        } catch (NullPointerException e2) {
            if (!Intrinsics.areEqual(e2.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                throw e2;
            }
        }
    }

    /* renamed from: $r8$lambda$yPQlaAoRiY-RJ3IY_TqzUUTrVH0, reason: not valid java name */
    public static void m6$r8$lambda$yPQlaAoRiYRJ3IY_TqzUUTrVH0(ComponentActivity componentActivity, Context context) {
        context.getClass();
        Bundle consumeRestoredStateForKey = componentActivity.getSavedStateRegistry().consumeRestoredStateForKey(ACTIVITY_RESULT_TAG);
        if (consumeRestoredStateForKey != null) {
            ActivityResultRegistry activityResultRegistry = componentActivity.activityResultRegistry;
            LinkedHashMap linkedHashMap = activityResultRegistry.keyToRc;
            LinkedHashMap linkedHashMap2 = activityResultRegistry.rcToKey;
            Bundle bundle = activityResultRegistry.pendingResults;
            ArrayList<Integer> integerArrayList = consumeRestoredStateForKey.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = consumeRestoredStateForKey.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList == null || integerArrayList == null) {
                return;
            }
            ArrayList<String> stringArrayList2 = consumeRestoredStateForKey.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
            if (stringArrayList2 != null) {
                activityResultRegistry.launchedKeys.addAll(stringArrayList2);
            }
            Bundle bundle2 = consumeRestoredStateForKey.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            int size = stringArrayList.size();
            for (int i = 0; i < size; i++) {
                String str = stringArrayList.get(i);
                if (linkedHashMap.containsKey(str)) {
                    Integer num = (Integer) linkedHashMap.remove(str);
                    if (!bundle.containsKey(str)) {
                        TypeIntrinsics.asMutableMap(linkedHashMap2).remove(num);
                    }
                }
                Integer num2 = integerArrayList.get(i);
                num2.getClass();
                int intValue = num2.intValue();
                String str2 = stringArrayList.get(i);
                str2.getClass();
                String str3 = str2;
                linkedHashMap2.put(Integer.valueOf(intValue), str3);
                activityResultRegistry.keyToRc.put(str3, Integer.valueOf(intValue));
            }
        }
    }

    public ComponentActivity() {
        this.contextAwareHelper = new ContextAwareHelper();
        this.menuHostHelper = new MenuHostHelper(new ComponentActivity$$ExternalSyntheticLambda0(this, 0));
        SavedStateRegistryImpl savedStateRegistryImpl = new SavedStateRegistryImpl(this, new ImageLoader$Builder$$ExternalSyntheticLambda1(this, 18));
        this.savedStateRegistryController = new SavedStateRegistryController(savedStateRegistryImpl);
        this.reportFullyDrawnExecutor = new ReportFullyDrawnExecutorImpl();
        this.fullyDrawnReporter$delegate = LazyKt.lazy(new ComponentActivity$$ExternalSyntheticLambda1(this, 0));
        this.nextLocalRequestCode = new AtomicInteger();
        this.activityResultRegistry = new ActivityResultRegistry() { // from class: androidx.activity.ComponentActivity$activityResultRegistry$1
            @Override // androidx.activity.result.ActivityResultRegistry
            public final void onLaunch(int i, ActivityResultContract activityResultContract, Object obj) {
                Bundle bundle;
                int i2;
                activityResultContract.getClass();
                ComponentActivity componentActivity = ComponentActivity.this;
                ActivityResultContract.SynchronousResult synchronousResult = activityResultContract.getSynchronousResult(componentActivity, obj);
                if (synchronousResult != null) {
                    new Handler(Looper.getMainLooper()).post(new ListenerSet$$ExternalSyntheticLambda1(this, i, synchronousResult, 1));
                    return;
                }
                Intent createIntent = activityResultContract.createIntent(componentActivity, obj);
                if (createIntent.getExtras() != null) {
                    Bundle extras = createIntent.getExtras();
                    extras.getClass();
                    if (extras.getClassLoader() == null) {
                        createIntent.setExtrasClassLoader(componentActivity.getClassLoader());
                    }
                }
                if (createIntent.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                    bundle = createIntent.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    createIntent.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                } else {
                    bundle = null;
                }
                Bundle bundle2 = bundle;
                if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(createIntent.getAction())) {
                    String[] stringArrayExtra = createIntent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                    if (stringArrayExtra == null) {
                        stringArrayExtra = new String[0];
                    }
                    ActivityCompat.requestPermissions(componentActivity, stringArrayExtra, i);
                    return;
                }
                if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(createIntent.getAction())) {
                    ActivityCompat.startActivityForResult(componentActivity, createIntent, i, bundle2);
                    return;
                }
                IntentSenderRequest intentSenderRequest = (IntentSenderRequest) createIntent.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
                try {
                    intentSenderRequest.getClass();
                    i2 = i;
                    try {
                        ActivityCompat.startIntentSenderForResult(componentActivity, intentSenderRequest.getIntentSender(), i2, intentSenderRequest.getFillInIntent(), intentSenderRequest.getFlagsMask(), intentSenderRequest.getFlagsValues(), 0, bundle2);
                    } catch (IntentSender.SendIntentException e) {
                        e = e;
                        new Handler(Looper.getMainLooper()).post(new ListenerSet$$ExternalSyntheticLambda1(this, i2, e, 2));
                    }
                } catch (IntentSender.SendIntentException e2) {
                    e = e2;
                    i2 = i;
                }
            }
        };
        this.onConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.onTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.onNewIntentListeners = new CopyOnWriteArrayList<>();
        this.onMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onUserLeaveHintListeners = new CopyOnWriteArrayList<>();
        this.onBackPressedInput$delegate = LazyKt.lazy(new ComponentActivity$$ExternalSyntheticLambda1(this, 2));
        if (getLifecycle() == null) {
            a$$ExternalSyntheticBUOutline0.m$1("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
            throw null;
        }
        final int i = 0;
        getLifecycle().addObserver(new LifecycleEventObserver(this) { // from class: androidx.activity.ComponentActivity$$ExternalSyntheticLambda3
            public final /* synthetic */ ComponentActivity f$0;

            {
                this.f$0 = this;
            }

            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                Window window;
                View peekDecorView;
                int i2 = i;
                ComponentActivity componentActivity = this.f$0;
                switch (i2) {
                    case 0:
                        int i3 = ComponentActivity.$r8$clinit;
                        if (event == Lifecycle.Event.ON_STOP && (window = componentActivity.getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
                            peekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        ComponentActivity.m5$r8$lambda$h6vvr6zUWA2U1fE0KsKpOgpr28(componentActivity, lifecycleOwner, event);
                        break;
                }
            }
        });
        final int i2 = 1;
        getLifecycle().addObserver(new LifecycleEventObserver(this) { // from class: androidx.activity.ComponentActivity$$ExternalSyntheticLambda3
            public final /* synthetic */ ComponentActivity f$0;

            {
                this.f$0 = this;
            }

            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                Window window;
                View peekDecorView;
                int i22 = i2;
                ComponentActivity componentActivity = this.f$0;
                switch (i22) {
                    case 0:
                        int i3 = ComponentActivity.$r8$clinit;
                        if (event == Lifecycle.Event.ON_STOP && (window = componentActivity.getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
                            peekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        ComponentActivity.m5$r8$lambda$h6vvr6zUWA2U1fE0KsKpOgpr28(componentActivity, lifecycleOwner, event);
                        break;
                }
            }
        });
        getLifecycle().addObserver(new Recreator(this, i2));
        savedStateRegistryImpl.performAttach();
        SavedStateHandleSupport.enableSavedStateHandles(this);
        getSavedStateRegistry().registerSavedStateProvider(ACTIVITY_RESULT_TAG, new ComponentActivity$$ExternalSyntheticLambda5(this, 0));
        addOnContextAvailableListener(new OnContextAvailableListener() { // from class: androidx.activity.ComponentActivity$$ExternalSyntheticLambda6
            @Override // androidx.activity.contextaware.OnContextAvailableListener
            public final void onContextAvailable(ComponentActivity componentActivity) {
                ComponentActivity.m6$r8$lambda$yPQlaAoRiYRJ3IY_TqzUUTrVH0(ComponentActivity.this, componentActivity);
            }
        });
        this.defaultViewModelProviderFactory$delegate = LazyKt.lazy(new ComponentActivity$$ExternalSyntheticLambda1(this, 3));
        this.onBackPressedDispatcher$delegate = LazyKt.lazy(new ComponentActivity$$ExternalSyntheticLambda1(this, 4));
    }

    public static final void access$ensureViewModelStore(ComponentActivity componentActivity) {
        if (componentActivity._viewModelStore == null) {
            NonConfigurationInstances nonConfigurationInstances = (NonConfigurationInstances) componentActivity.getLastNonConfigurationInstance();
            if (nonConfigurationInstances != null) {
                componentActivity._viewModelStore = nonConfigurationInstances.viewModelStore;
            }
            if (componentActivity._viewModelStore == null) {
                componentActivity._viewModelStore = new ViewModelStore();
            }
        }
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        ReportFullyDrawnExecutor reportFullyDrawnExecutor = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        ((ReportFullyDrawnExecutorImpl) reportFullyDrawnExecutor).viewCreated(decorView);
        super.addContentView(view, layoutParams);
    }

    public void addMenuProvider(MenuProvider menuProvider, LifecycleOwner lifecycleOwner) {
        menuProvider.getClass();
        lifecycleOwner.getClass();
        MenuHostHelper menuHostHelper = this.menuHostHelper;
        menuHostHelper.mMenuProviders.add(menuProvider);
        menuHostHelper.mOnInvalidateMenuCallback.run();
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        HashMap hashMap = menuHostHelper.mProviderToLifecycleContainers;
        MenuHostHelper.LifecycleContainer lifecycleContainer = (MenuHostHelper.LifecycleContainer) hashMap.remove(menuProvider);
        if (lifecycleContainer != null) {
            lifecycleContainer.clearObservers();
        }
        hashMap.put(menuProvider, new MenuHostHelper.LifecycleContainer(lifecycle, new MenuHostHelper$$ExternalSyntheticLambda1(0, menuHostHelper, menuProvider)));
    }

    @Override // androidx.core.content.OnConfigurationChangedProvider
    public final void addOnConfigurationChangedListener(Consumer<Configuration> consumer) {
        consumer.getClass();
        this.onConfigurationChangedListeners.add(consumer);
    }

    public final void addOnContextAvailableListener(OnContextAvailableListener onContextAvailableListener) {
        onContextAvailableListener.getClass();
        ContextAwareHelper contextAwareHelper = this.contextAwareHelper;
        contextAwareHelper.getClass();
        ComponentActivity componentActivity = contextAwareHelper.context;
        if (componentActivity != null) {
            onContextAvailableListener.onContextAvailable(componentActivity);
        }
        contextAwareHelper.listeners.add(onContextAvailableListener);
    }

    @Override // androidx.core.app.OnMultiWindowModeChangedProvider
    public final void addOnMultiWindowModeChangedListener(Consumer<MultiWindowModeChangedInfo> consumer) {
        consumer.getClass();
        this.onMultiWindowModeChangedListeners.add(consumer);
    }

    public final void addOnNewIntentListener(Consumer<Intent> consumer) {
        consumer.getClass();
        this.onNewIntentListeners.add(consumer);
    }

    @Override // androidx.core.app.OnPictureInPictureModeChangedProvider
    public final void addOnPictureInPictureModeChangedListener(Consumer<PictureInPictureModeChangedInfo> consumer) {
        consumer.getClass();
        this.onPictureInPictureModeChangedListeners.add(consumer);
    }

    @Override // androidx.core.content.OnTrimMemoryProvider
    public final void addOnTrimMemoryListener(Consumer<Integer> consumer) {
        consumer.getClass();
        this.onTrimMemoryListeners.add(consumer);
    }

    public final void addOnUserLeaveHintListener(Runnable runnable) {
        runnable.getClass();
        this.onUserLeaveHintListeners.add(runnable);
    }

    @Override // androidx.activity.result.ActivityResultRegistryOwner
    public final ActivityResultRegistry getActivityResultRegistry() {
        return this.activityResultRegistry;
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public CreationExtras getDefaultViewModelCreationExtras() {
        MutableCreationExtras mutableCreationExtras = new MutableCreationExtras(0);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = mutableCreationExtras.extras;
        if (application != null) {
            linkedHashMap.put(ViewModelProvider$AndroidViewModelFactory.APPLICATION_KEY, getApplication());
        }
        linkedHashMap.put(SavedStateHandleSupport.SAVED_STATE_REGISTRY_OWNER_KEY, this);
        linkedHashMap.put(SavedStateHandleSupport.VIEW_MODEL_STORE_OWNER_KEY, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            linkedHashMap.put(SavedStateHandleSupport.DEFAULT_ARGS_KEY, extras);
        }
        return mutableCreationExtras;
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider$Factory getDefaultViewModelProviderFactory() {
        return (ViewModelProvider$Factory) this.defaultViewModelProviderFactory$delegate.getValue();
    }

    @Override // androidx.activity.FullyDrawnReporterOwner
    public FullyDrawnReporter getFullyDrawnReporter() {
        return (FullyDrawnReporter) this.fullyDrawnReporter$delegate.getValue();
    }

    @Deprecated
    public Object getLastCustomNonConfigurationInstance() {
        NonConfigurationInstances nonConfigurationInstances = (NonConfigurationInstances) getLastNonConfigurationInstance();
        if (nonConfigurationInstances != null) {
            return nonConfigurationInstances.custom;
        }
        return null;
    }

    @Override // androidx.core.app.ComponentActivity, androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        return super.getLifecycle();
    }

    @Override // androidx.navigationevent.NavigationEventDispatcherOwner
    public NavigationEventDispatcher getNavigationEventDispatcher() {
        return getOnBackPressedDispatcher().getEventInput().dispatcher;
    }

    @Override // androidx.activity.OnBackPressedDispatcherOwner
    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return (OnBackPressedDispatcher) this.onBackPressedDispatcher$delegate.getValue();
    }

    @Override // androidx.savedstate.SavedStateRegistryOwner
    public final SavedStateRegistry getSavedStateRegistry() {
        return this.savedStateRegistryController.savedStateRegistry;
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    public ViewModelStore getViewModelStore() {
        if (getApplication() == null) {
            a$$ExternalSyntheticBUOutline0.m$1("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
            return null;
        }
        if (this._viewModelStore == null) {
            NonConfigurationInstances nonConfigurationInstances = (NonConfigurationInstances) getLastNonConfigurationInstance();
            if (nonConfigurationInstances != null) {
                this._viewModelStore = nonConfigurationInstances.viewModelStore;
            }
            if (this._viewModelStore == null) {
                this._viewModelStore = new ViewModelStore();
            }
        }
        ViewModelStore viewModelStore = this._viewModelStore;
        viewModelStore.getClass();
        return viewModelStore;
    }

    public void initializeViewTreeOwners() {
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        View decorView2 = getWindow().getDecorView();
        decorView2.getClass();
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        decorView3.getClass();
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        decorView4.getClass();
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        decorView5.getClass();
        decorView5.setTag(R.id.report_drawn, this);
        View decorView6 = getWindow().getDecorView();
        decorView6.getClass();
        decorView6.setTag(R.id.view_tree_navigation_event_dispatcher_owner, this);
    }

    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    @Deprecated
    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.activityResultRegistry.dispatchResult(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    @Deprecated
    public void onBackPressed() {
        ((DirectNavigationEventInput) this.onBackPressedInput$delegate.getValue()).dispatchOnBackCompleted();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        super.onConfigurationChanged(configuration);
        Iterator<Consumer<Configuration>> it = this.onConfigurationChangedListeners.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().accept(configuration);
        }
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.savedStateRegistryController.performRestore(bundle);
        ContextAwareHelper contextAwareHelper = this.contextAwareHelper;
        contextAwareHelper.getClass();
        contextAwareHelper.context = this;
        Iterator it = contextAwareHelper.listeners.iterator();
        while (it.hasNext()) {
            ((OnContextAvailableListener) it.next()).onContextAvailable(this);
        }
        super.onCreate(bundle);
        int i = ReportFragment.$r8$clinit;
        ReportFragment.Companion.injectIfNeededIn(this);
        int i2 = this.contentLayoutId;
        if (i2 != 0) {
            setContentView(i2);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        menu.getClass();
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        MenuHostHelper menuHostHelper = this.menuHostHelper;
        MenuInflater menuInflater = getMenuInflater();
        Iterator it = menuHostHelper.mMenuProviders.iterator();
        while (it.hasNext()) {
            ((MenuProvider) it.next()).onCreateMenu(menu, menuInflater);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        menuItem.getClass();
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            Iterator it = this.menuHostHelper.mMenuProviders.iterator();
            while (it.hasNext()) {
                if (((MenuProvider) it.next()).onMenuItemSelected(menuItem)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        configuration.getClass();
        this.dispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.dispatchingOnMultiWindowModeChanged = false;
            Iterator<Consumer<MultiWindowModeChangedInfo>> it = this.onMultiWindowModeChangedListeners.iterator();
            it.getClass();
            while (it.hasNext()) {
                it.next().accept(new MultiWindowModeChangedInfo(z, configuration));
            }
        } catch (Throwable th) {
            this.dispatchingOnMultiWindowModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        Iterator<Consumer<Intent>> it = this.onNewIntentListeners.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        menu.getClass();
        Iterator it = this.menuHostHelper.mMenuProviders.iterator();
        while (it.hasNext()) {
            ((MenuProvider) it.next()).onMenuClosed(menu);
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        configuration.getClass();
        this.dispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.dispatchingOnPictureInPictureModeChanged = false;
            Iterator<Consumer<PictureInPictureModeChangedInfo>> it = this.onPictureInPictureModeChangedListeners.iterator();
            it.getClass();
            while (it.hasNext()) {
                it.next().accept(new PictureInPictureModeChangedInfo(z, configuration));
            }
        } catch (Throwable th) {
            this.dispatchingOnPictureInPictureModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i, View view, Menu menu) {
        menu.getClass();
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        Iterator it = this.menuHostHelper.mMenuProviders.iterator();
        while (it.hasNext()) {
            ((MenuProvider) it.next()).onPrepareMenu(menu);
        }
        return true;
    }

    @Override // android.app.Activity
    @Deprecated
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        strArr.getClass();
        iArr.getClass();
        if (this.activityResultRegistry.dispatchResult(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Deprecated
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        NonConfigurationInstances nonConfigurationInstances;
        Object onRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        ViewModelStore viewModelStore = this._viewModelStore;
        if (viewModelStore == null && (nonConfigurationInstances = (NonConfigurationInstances) getLastNonConfigurationInstance()) != null) {
            viewModelStore = nonConfigurationInstances.viewModelStore;
        }
        if (viewModelStore == null && onRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        NonConfigurationInstances nonConfigurationInstances2 = new NonConfigurationInstances();
        nonConfigurationInstances2.custom = onRetainCustomNonConfigurationInstance;
        nonConfigurationInstances2.viewModelStore = viewModelStore;
        return nonConfigurationInstances2;
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        if (getLifecycle() instanceof LifecycleRegistry) {
            Lifecycle lifecycle = getLifecycle();
            lifecycle.getClass();
            ((LifecycleRegistry) lifecycle).setCurrentState(Lifecycle.State.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.savedStateRegistryController.performSave(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator<Consumer<Integer>> it = this.onTrimMemoryListeners.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator<Runnable> it = this.onUserLeaveHintListeners.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().run();
        }
    }

    public Context peekAvailableContext() {
        return this.contextAwareHelper.context;
    }

    public final <I, O> ActivityResultLauncher<I> registerForActivityResult(ActivityResultContract<I, O> activityResultContract, ActivityResultRegistry activityResultRegistry, ActivityResultCallback<O> activityResultCallback) {
        activityResultContract.getClass();
        activityResultRegistry.getClass();
        activityResultCallback.getClass();
        return activityResultRegistry.register("activity_rq#" + this.nextLocalRequestCode.getAndIncrement(), this, activityResultContract, activityResultCallback);
    }

    @Override // androidx.core.view.MenuHost
    public void removeMenuProvider(MenuProvider menuProvider) {
        menuProvider.getClass();
        this.menuHostHelper.removeMenuProvider(menuProvider);
    }

    @Override // androidx.core.content.OnConfigurationChangedProvider
    public final void removeOnConfigurationChangedListener(Consumer<Configuration> consumer) {
        consumer.getClass();
        this.onConfigurationChangedListeners.remove(consumer);
    }

    public final void removeOnContextAvailableListener(OnContextAvailableListener onContextAvailableListener) {
        onContextAvailableListener.getClass();
        ContextAwareHelper contextAwareHelper = this.contextAwareHelper;
        contextAwareHelper.getClass();
        contextAwareHelper.listeners.remove(onContextAvailableListener);
    }

    @Override // androidx.core.app.OnMultiWindowModeChangedProvider
    public final void removeOnMultiWindowModeChangedListener(Consumer<MultiWindowModeChangedInfo> consumer) {
        consumer.getClass();
        this.onMultiWindowModeChangedListeners.remove(consumer);
    }

    public final void removeOnNewIntentListener(Consumer<Intent> consumer) {
        consumer.getClass();
        this.onNewIntentListeners.remove(consumer);
    }

    @Override // androidx.core.app.OnPictureInPictureModeChangedProvider
    public final void removeOnPictureInPictureModeChangedListener(Consumer<PictureInPictureModeChangedInfo> consumer) {
        consumer.getClass();
        this.onPictureInPictureModeChangedListeners.remove(consumer);
    }

    @Override // androidx.core.content.OnTrimMemoryProvider
    public final void removeOnTrimMemoryListener(Consumer<Integer> consumer) {
        consumer.getClass();
        this.onTrimMemoryListeners.remove(consumer);
    }

    public final void removeOnUserLeaveHintListener(Runnable runnable) {
        runnable.getClass();
        this.onUserLeaveHintListeners.remove(runnable);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (Trace.isEnabled()) {
                Trace.beginSection(androidx.tracing.Trace.truncatedTraceSectionLabel("reportFullyDrawn() for ComponentActivity"));
            }
            super.reportFullyDrawn();
            getFullyDrawnReporter().fullyDrawnReported();
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        initializeViewTreeOwners();
        ReportFullyDrawnExecutor reportFullyDrawnExecutor = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        ((ReportFullyDrawnExecutorImpl) reportFullyDrawnExecutor).viewCreated(decorView);
        super.setContentView(i);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(Intent intent, int i) {
        intent.getClass();
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        intentSender.getClass();
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        intent.getClass();
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        intentSender.getClass();
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        initializeViewTreeOwners();
        ReportFullyDrawnExecutor reportFullyDrawnExecutor = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        ((ReportFullyDrawnExecutorImpl) reportFullyDrawnExecutor).viewCreated(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        ReportFullyDrawnExecutor reportFullyDrawnExecutor = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        ((ReportFullyDrawnExecutorImpl) reportFullyDrawnExecutor).viewCreated(decorView);
        super.setContentView(view, layoutParams);
    }

    @Override // androidx.activity.result.ActivityResultCaller
    public final <I, O> ActivityResultLauncher<I> registerForActivityResult(ActivityResultContract<I, O> activityResultContract, ActivityResultCallback<O> activityResultCallback) {
        activityResultContract.getClass();
        activityResultCallback.getClass();
        return registerForActivityResult(activityResultContract, this.activityResultRegistry, activityResultCallback);
    }

    @Override // android.app.Activity
    @Deprecated
    public void onMultiWindowModeChanged(boolean z) {
        if (this.dispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<Consumer<MultiWindowModeChangedInfo>> it = this.onMultiWindowModeChangedListeners.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().accept(new MultiWindowModeChangedInfo(z));
        }
    }

    @Override // android.app.Activity
    @Deprecated
    public void onPictureInPictureModeChanged(boolean z) {
        if (this.dispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<Consumer<PictureInPictureModeChangedInfo>> it = this.onPictureInPictureModeChangedListeners.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().accept(new PictureInPictureModeChangedInfo(z));
        }
    }

    @Override // androidx.core.view.MenuHost
    public void addMenuProvider(MenuProvider menuProvider) {
        menuProvider.getClass();
        MenuHostHelper menuHostHelper = this.menuHostHelper;
        menuHostHelper.mMenuProviders.add(menuProvider);
        menuHostHelper.mOnInvalidateMenuCallback.run();
    }

    public void addMenuProvider(MenuProvider menuProvider, LifecycleOwner lifecycleOwner, Lifecycle.State state) {
        menuProvider.getClass();
        lifecycleOwner.getClass();
        state.getClass();
        MenuHostHelper menuHostHelper = this.menuHostHelper;
        menuHostHelper.getClass();
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        HashMap hashMap = menuHostHelper.mProviderToLifecycleContainers;
        MenuHostHelper.LifecycleContainer lifecycleContainer = (MenuHostHelper.LifecycleContainer) hashMap.remove(menuProvider);
        if (lifecycleContainer != null) {
            lifecycleContainer.clearObservers();
        }
        hashMap.put(menuProvider, new MenuHostHelper.LifecycleContainer(lifecycle, new MenuHostHelper$$ExternalSyntheticLambda0(0, state, menuHostHelper, menuProvider)));
    }

    public ComponentActivity(int i) {
        this();
        this.contentLayoutId = i;
    }
}
