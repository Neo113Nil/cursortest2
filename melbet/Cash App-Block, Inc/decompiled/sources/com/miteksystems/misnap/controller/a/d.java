package com.miteksystems.misnap.controller.a;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Looper;
import android.util.Log;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.miteksystems.misnap.controller.AnalysisSettings;
import com.miteksystems.misnap.core.MiSnapSettings;
import com.miteksystems.misnap.core.MibiData;
import com.nimbusds.jose.jca.JCAContext;
import com.withpersona.sdk2.camera.stats.RealCameraStatsManager;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedDeque;

/* loaded from: classes4.dex */
public final class d {
    public final SensorManager a;
    public final MibiData.Session b;
    public final Sensor c;
    public final JCAContext d;
    public final /* synthetic */ float e;
    public final ConcurrentLinkedDeque f;
    public final MutableLiveData g;
    public /* synthetic */ float h;
    public /* synthetic */ float i;
    public /* synthetic */ float j;
    public /* synthetic */ int k;
    public final /* synthetic */ e l;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class c {
        public static final c a;
        public static final c b;
        public static final /* synthetic */ c[] c;

        static {
            c cVar = new c("MOVING", 0);
            a = cVar;
            c cVar2 = new c("NOT_MOVING", 1);
            b = cVar2;
            c = new c[]{cVar, cVar2};
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) c.clone();
        }
    }

    /* renamed from: com.miteksystems.misnap.controller.a.d$d, reason: collision with other inner class name */
    public abstract /* synthetic */ class AbstractC0009d {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[MiSnapSettings.Analysis.MotionDetectorSensitivity.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public final class e implements SensorEventListener {
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ Object a;

        public /* synthetic */ e(Object obj, int i) {
            this.$r8$classId = i;
            this.a = obj;
        }

        private final void onAccuracyChanged$com$withpersona$sdk2$camera$stats$RealCameraStatsManager$sensorEventListener$1(Sensor sensor, int i) {
        }

        @Override // android.hardware.SensorEventListener
        public final void onAccuracyChanged(Sensor sensor, int i) {
            switch (this.$r8$classId) {
                case 0:
                    d dVar = (d) this.a;
                    dVar.k = i;
                    if (i != 3) {
                        dVar.b.addUxpEvent("DMDUS", new String[0]);
                        dVar.d();
                        break;
                    }
                    break;
            }
        }

        @Override // android.hardware.SensorEventListener
        public final void onSensorChanged(SensorEvent sensorEvent) {
            float[] fArr;
            float[] fArr2;
            int i = this.$r8$classId;
            Object obj = this.a;
            boolean z = true;
            boolean z2 = false;
            switch (i) {
                case 0:
                    if (sensorEvent != null && (fArr = sensorEvent.values) != null) {
                        d dVar = (d) obj;
                        ConcurrentLinkedDeque concurrentLinkedDeque = dVar.f;
                        if (dVar.k == 3) {
                            try {
                                if (fArr.length != 0 && fArr.length == 3) {
                                    float f = fArr[0];
                                    float f2 = fArr[1];
                                    float f3 = fArr[2];
                                    dVar.h = dVar.i;
                                    float sqrt = (float) Math.sqrt((f3 * f3) + (f2 * f2) + (f * f));
                                    dVar.i = sqrt;
                                    float abs = Math.abs((dVar.j * 0.9f) + (sqrt - dVar.h));
                                    dVar.j = abs;
                                    c cVar = abs > dVar.e ? c.a : c.b;
                                    if (concurrentLinkedDeque.size() == 25) {
                                        concurrentLinkedDeque.pollFirst();
                                    }
                                    concurrentLinkedDeque.addLast(cVar);
                                    JCAContext jCAContext = dVar.d;
                                    jCAContext.getClass();
                                    ConcurrentLinkedDeque concurrentLinkedDeque2 = (ConcurrentLinkedDeque) jCAContext.provider;
                                    if (concurrentLinkedDeque2.size() == 2) {
                                        concurrentLinkedDeque2.pollFirst();
                                    }
                                    concurrentLinkedDeque2.addLast(cVar);
                                    if (concurrentLinkedDeque2.size() >= 2) {
                                        if (!concurrentLinkedDeque2.isEmpty()) {
                                            Iterator it = concurrentLinkedDeque2.iterator();
                                            while (it.hasNext()) {
                                                if (((c) it.next()) != cVar) {
                                                    z = true ^ z2;
                                                }
                                            }
                                        }
                                        z2 = true;
                                        z = true ^ z2;
                                    }
                                    if (!z) {
                                        MutableLiveData mutableLiveData = dVar.g;
                                        if (cVar != mutableLiveData.getValue()) {
                                            if (!Looper.getMainLooper().isCurrentThread()) {
                                                mutableLiveData.postValue(cVar);
                                                break;
                                            } else {
                                                mutableLiveData.setValue(cVar);
                                                break;
                                            }
                                        }
                                    } else {
                                        break;
                                    }
                                }
                            } catch (Exception e) {
                                Log.e("DeviceMotionDetector", "Error calculating the acceleration: " + e.getMessage(), e);
                                return;
                            }
                        }
                    }
                    break;
                default:
                    if (sensorEvent != null && (fArr2 = sensorEvent.values) != null && fArr2.length >= 3) {
                        float f4 = fArr2[0];
                        RealCameraStatsManager realCameraStatsManager = (RealCameraStatsManager) obj;
                        double d = realCameraStatsManager.averageRotationPerMeasurement;
                        long j = realCameraStatsManager.measurementsTaken;
                        double abs2 = (d * j) + ((Math.abs(fArr2[2]) + (Math.abs(fArr2[1]) + Math.abs(f4))) / 3.0d);
                        long j2 = j + 1;
                        realCameraStatsManager.averageRotationPerMeasurement = abs2 / j2;
                        realCameraStatsManager.measurementsTaken = j2;
                        break;
                    }
                    break;
            }
        }
    }

    public d(Context context, MiSnapSettings miSnapSettings) {
        float f;
        Object systemService = context.getSystemService("sensor");
        systemService.getClass();
        SensorManager sensorManager = (SensorManager) systemService;
        this.a = sensorManager;
        this.b = MibiData.bindSession();
        this.c = sensorManager.getDefaultSensor(10);
        this.d = new JCAContext();
        int i = AbstractC0009d.a[AnalysisSettings.getMotionDetectorSensitivity(miSnapSettings.analysis, miSnapSettings.a).ordinal()];
        if (i == 1) {
            f = Float.MAX_VALUE;
        } else if (i == 2) {
            f = 0.25f;
        } else {
            if (i != 3) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                throw null;
            }
            f = 0.05f;
        }
        this.e = f;
        this.f = new ConcurrentLinkedDeque();
        this.g = new MutableLiveData(c.b);
        this.k = 1;
        this.l = new e(this, 0);
    }

    public final void d() {
        MutableLiveData mutableLiveData = this.g;
        boolean m = Recorder$$ExternalSyntheticOutline1.m(mutableLiveData);
        c cVar = c.b;
        if (m) {
            mutableLiveData.setValue(cVar);
        } else {
            mutableLiveData.postValue(cVar);
        }
        ((ConcurrentLinkedDeque) this.d.provider).clear();
        this.h = RecyclerView.DECELERATION_RATE;
        this.i = RecyclerView.DECELERATION_RATE;
        this.j = RecyclerView.DECELERATION_RATE;
        this.f.clear();
        this.k = 1;
    }
}
