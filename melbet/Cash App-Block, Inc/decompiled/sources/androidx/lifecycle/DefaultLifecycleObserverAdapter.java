package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.Drop$$ExternalSyntheticBUOutline0;

/* loaded from: classes.dex */
public final class DefaultLifecycleObserverAdapter implements LifecycleEventObserver {
    public final DefaultLifecycleObserver defaultLifecycleObserver;
    public final LifecycleEventObserver lifecycleEventObserver;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            try {
                iArr[Lifecycle.Event.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Lifecycle.Event.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Lifecycle.Event.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Lifecycle.Event.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Lifecycle.Event.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public DefaultLifecycleObserverAdapter(DefaultLifecycleObserver defaultLifecycleObserver, LifecycleEventObserver lifecycleEventObserver) {
        defaultLifecycleObserver.getClass();
        this.defaultLifecycleObserver = defaultLifecycleObserver;
        this.lifecycleEventObserver = lifecycleEventObserver;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        int i = WhenMappings.$EnumSwitchMapping$0[event.ordinal()];
        DefaultLifecycleObserver defaultLifecycleObserver = this.defaultLifecycleObserver;
        switch (i) {
            case 1:
                defaultLifecycleObserver.onCreate(lifecycleOwner);
                break;
            case 2:
                defaultLifecycleObserver.onStart(lifecycleOwner);
                break;
            case 3:
                defaultLifecycleObserver.onResume(lifecycleOwner);
                break;
            case 4:
                defaultLifecycleObserver.onPause(lifecycleOwner);
                break;
            case 5:
                defaultLifecycleObserver.onStop(lifecycleOwner);
                break;
            case 6:
                defaultLifecycleObserver.onDestroy(lifecycleOwner);
                break;
            case 7:
                a$$ExternalSyntheticBUOutline0.m$3("ON_ANY must not been send by anybody");
                return;
            default:
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
        }
        LifecycleEventObserver lifecycleEventObserver = this.lifecycleEventObserver;
        if (lifecycleEventObserver != null) {
            lifecycleEventObserver.onStateChanged(lifecycleOwner, event);
        }
    }
}
