package androidx.camera.core;

import android.content.Context;
import android.view.OrientationEventListener;
import com.squareup.cash.device.DeviceOrientation;
import com.squareup.cash.device.RealDeviceOrientationProvider;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.StateFlowImpl;

/* loaded from: classes3.dex */
public final class RotationProvider {
    public final LinkedHashMap listeners;
    public final Object lock;
    public final AnonymousClass1 orientationListener;
    public volatile int rotation;

    public abstract class ListenerWrapper {
        public abstract void onRotationChanged(int i);
    }

    public RotationProvider(Context context) {
        context.getClass();
        this.lock = new Object();
        this.listeners = new LinkedHashMap();
        this.rotation = -1;
        this.orientationListener = new AnonymousClass1(context, this);
    }

    /* renamed from: androidx.camera.core.RotationProvider$1, reason: invalid class name */
    public final class AnonymousClass1 extends OrientationEventListener {
        public final /* synthetic */ int $r8$classId = 2;
        public Object this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(RealDeviceOrientationProvider realDeviceOrientationProvider, Context context) {
            super(context);
            this.this$0 = realDeviceOrientationProvider;
        }

        /* JADX WARN: Code restructure failed: missing block: B:75:0x0097, code lost:
        
            if (r12 < 315) goto L84;
         */
        @Override // android.view.OrientationEventListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onOrientationChanged(int i) {
            List list;
            int i2 = 0;
            switch (this.$r8$classId) {
                case 0:
                    if (i == -1) {
                        return;
                    }
                    RotationProvider rotationProvider = (RotationProvider) this.this$0;
                    if (rotationProvider.rotation == -1) {
                        if (i < 0 || i >= 45) {
                            if (45 > i || i >= 135) {
                                if (135 > i || i >= 225) {
                                    if (225 <= i) {
                                    }
                                }
                                i2 = 2;
                            }
                            i2 = 3;
                        }
                    } else if ((i < 0 || i >= 40) && (320 > i || i >= 360)) {
                        if (50 > i || i >= 130) {
                            if (140 > i || i >= 220) {
                                if (230 > i || i >= 310) {
                                    i2 = rotationProvider.rotation;
                                }
                                i2 = 1;
                            }
                            i2 = 2;
                        }
                        i2 = 3;
                    }
                    RotationProvider rotationProvider2 = (RotationProvider) this.this$0;
                    if (rotationProvider2.rotation != i2) {
                        rotationProvider2.rotation = i2;
                        synchronized (rotationProvider2.lock) {
                            list = CollectionsKt.toList(rotationProvider2.listeners.values());
                        }
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            ((ListenerWrapper) it.next()).onRotationChanged(i2);
                        }
                        return;
                    }
                    return;
                case 1:
                    StateFlowImpl stateFlowImpl = ((RealDeviceOrientationProvider) this.this$0).orientation;
                    if (i == -1) {
                        DeviceOrientation deviceOrientation = DeviceOrientation.UNKNOWN;
                        stateFlowImpl.getClass();
                        stateFlowImpl.updateState(null, deviceOrientation);
                        return;
                    } else {
                        DeviceOrientation deviceOrientation2 = ((i < 0 || i >= 46) && (315 > i || i >= 361)) ? (135 > i || i >= 226) ? (45 > i || i >= 136) ? (225 > i || i >= 316) ? DeviceOrientation.UNKNOWN : DeviceOrientation.LANDSCAPE_LEFT : DeviceOrientation.LANDSCAPE_RIGHT : DeviceOrientation.PORTRAIT_UPSIDE_DOWN : DeviceOrientation.PORTRAIT;
                        stateFlowImpl.getClass();
                        stateFlowImpl.updateState(null, deviceOrientation2);
                        return;
                    }
                default:
                    if (i == -1) {
                        return;
                    }
                    if (45 <= i && i < 135) {
                        i2 = 3;
                    } else if (135 <= i && i < 225) {
                        i2 = 2;
                    } else if (225 <= i && i < 315) {
                        i2 = 1;
                    }
                    Function1 function1 = (Function1) this.this$0;
                    if (function1 != null) {
                        function1.invoke(Integer.valueOf(i2));
                        return;
                    }
                    return;
            }
        }

        public /* synthetic */ AnonymousClass1(Context context) {
            super(context);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Context context, RotationProvider rotationProvider) {
            super(context);
            this.this$0 = rotationProvider;
        }
    }
}
