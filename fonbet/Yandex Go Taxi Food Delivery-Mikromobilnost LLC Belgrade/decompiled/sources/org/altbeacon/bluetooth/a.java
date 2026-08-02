package org.altbeacon.bluetooth;

import android.app.job.JobParameters;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.bluetooth.le.AdvertiseCallback;
import android.bluetooth.le.AdvertiseData;
import android.bluetooth.le.AdvertiseSettings;
import android.bluetooth.le.BluetoothLeAdvertiser;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanResult;
import defpackage.n66;
import defpackage.ny61;
import java.util.List;

/* loaded from: classes4.dex */
public final class a implements Runnable {
    public final /* synthetic */ JobParameters a;
    public final /* synthetic */ BluetoothTestJob b;

    public a(BluetoothTestJob bluetoothTestJob, JobParameters jobParameters) {
        this.b = bluetoothTestJob;
        this.a = jobParameters;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j;
        int i = BluetoothTestJob.a;
        JobParameters jobParameters = this.a;
        int i2 = jobParameters.getExtras().getInt("test_type");
        boolean z = true;
        boolean z2 = i2 == 0;
        int i3 = i2 & 1;
        final BluetoothLeAdvertiser bluetoothLeAdvertiser = null;
        BluetoothTestJob bluetoothTestJob = this.b;
        if (i3 == 1) {
            final n66 a = n66.a();
            if (a.a == null) {
                BluetoothManager bluetoothManager = (BluetoothManager) bluetoothTestJob.getSystemService("bluetooth");
                if (bluetoothManager == null) {
                    ny61.t("Cannot get BluetoothManager");
                    return;
                }
                a.a = bluetoothManager.getAdapter();
            }
            a.c = null;
            long currentTimeMillis = System.currentTimeMillis();
            BluetoothAdapter bluetoothAdapter = a.a;
            if (bluetoothAdapter != null) {
                final BluetoothLeScanner bluetoothLeScanner = bluetoothAdapter.getBluetoothLeScanner();
                j = 5000;
                ScanCallback scanCallback = new ScanCallback() { // from class: org.altbeacon.bluetooth.BluetoothMedic$1
                    @Override // android.bluetooth.le.ScanCallback
                    public void onBatchScanResults(List<ScanResult> list) {
                        super.onBatchScanResults(list);
                    }

                    @Override // android.bluetooth.le.ScanCallback
                    public void onScanFailed(int i4) {
                        super.onScanFailed(i4);
                        n66.this.getClass();
                        n66 n66Var = n66.this;
                        if (i4 != 2) {
                            n66Var.c = Boolean.TRUE;
                            return;
                        }
                        n66Var.getClass();
                        n66.this.c = Boolean.FALSE;
                    }

                    @Override // android.bluetooth.le.ScanCallback
                    public void onScanResult(int i4, ScanResult scanResult) {
                        super.onScanResult(i4, scanResult);
                        n66.this.c = Boolean.TRUE;
                        try {
                            bluetoothLeScanner.stopScan(this);
                        } catch (IllegalStateException unused) {
                        }
                    }
                };
                if (bluetoothLeScanner != null) {
                    try {
                        bluetoothLeScanner.startScan(scanCallback);
                        while (a.c == null) {
                            try {
                                Thread.sleep(1000L);
                            } catch (InterruptedException unused) {
                            }
                            if (System.currentTimeMillis() - currentTimeMillis > 5000) {
                                break;
                            }
                        }
                        bluetoothLeScanner.stopScan(scanCallback);
                    } catch (IllegalStateException | NullPointerException unused2) {
                    }
                }
            } else {
                j = 5000;
            }
            Boolean bool = a.c;
            if (bool != null && !bool.booleanValue()) {
                int i4 = BluetoothTestJob.a;
            }
            z2 = true;
        } else {
            j = 5000;
        }
        if ((i2 & 2) == 2) {
            if (z2) {
                try {
                    Thread.sleep(10000L);
                } catch (InterruptedException unused3) {
                }
            }
            int i5 = BluetoothTestJob.a;
            final n66 a2 = n66.a();
            if (a2.a == null) {
                BluetoothManager bluetoothManager2 = (BluetoothManager) bluetoothTestJob.getSystemService("bluetooth");
                if (bluetoothManager2 == null) {
                    ny61.t("Cannot get BluetoothManager");
                    return;
                }
                a2.a = bluetoothManager2.getAdapter();
            }
            a2.b = null;
            long currentTimeMillis2 = System.currentTimeMillis();
            BluetoothAdapter bluetoothAdapter2 = a2.a;
            if (bluetoothAdapter2 != null) {
                try {
                    bluetoothLeAdvertiser = bluetoothAdapter2.getBluetoothLeAdvertiser();
                } catch (Exception unused4) {
                }
                if (bluetoothLeAdvertiser != null) {
                    bluetoothLeAdvertiser.startAdvertising(new AdvertiseSettings.Builder().setAdvertiseMode(0).build(), new AdvertiseData.Builder().addManufacturerData(0, new byte[]{0}).build(), new AdvertiseCallback() { // from class: org.altbeacon.bluetooth.BluetoothMedic$2
                        @Override // android.bluetooth.le.AdvertiseCallback
                        public void onStartFailure(int i6) {
                            super.onStartFailure(i6);
                            n66.this.getClass();
                            n66 n66Var = n66.this;
                            if (i6 == 4) {
                                n66Var.b = Boolean.FALSE;
                            } else {
                                n66Var.b = Boolean.TRUE;
                            }
                        }

                        @Override // android.bluetooth.le.AdvertiseCallback
                        public void onStartSuccess(AdvertiseSettings advertiseSettings) {
                            super.onStartSuccess(advertiseSettings);
                            bluetoothLeAdvertiser.stopAdvertising(this);
                            n66.this.b = Boolean.TRUE;
                        }
                    });
                }
                while (a2.b == null) {
                    try {
                        Thread.sleep(1000L);
                    } catch (InterruptedException unused5) {
                    }
                    if (System.currentTimeMillis() - currentTimeMillis2 > j) {
                        break;
                    }
                }
            }
            Boolean bool2 = a2.b;
            if (bool2 == null || !bool2.booleanValue()) {
                int i6 = BluetoothTestJob.a;
            }
        } else {
            z = z2;
        }
        if (!z) {
            int i7 = BluetoothTestJob.a;
        }
        bluetoothTestJob.jobFinished(jobParameters, false);
    }
}
