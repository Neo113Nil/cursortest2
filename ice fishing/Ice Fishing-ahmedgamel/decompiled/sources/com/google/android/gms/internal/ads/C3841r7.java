package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.ads.r7, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3841r7 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: u, reason: collision with root package name */
    public final Application f34292u;

    /* renamed from: v, reason: collision with root package name */
    public final WeakReference f34293v;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f34291n = 0;

    /* renamed from: w, reason: collision with root package name */
    public boolean f34294w = false;

    public C3841r7(Application application, C7 c72) {
        this.f34293v = new WeakReference(c72);
        this.f34292u = application;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Application application = this.f34292u;
        WeakReference weakReference = this.f34293v;
        switch (this.f34291n) {
            case 0:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) weakReference.get();
                    if (activityLifecycleCallbacks != null) {
                        activityLifecycleCallbacks.onActivityCreated(activity, bundle);
                    } else if (!this.f34294w) {
                        application.unregisterActivityLifecycleCallbacks(this);
                        this.f34294w = true;
                    }
                    break;
                } catch (Exception unused) {
                    return;
                }
            default:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks2 = (Application.ActivityLifecycleCallbacks) weakReference.get();
                    if (activityLifecycleCallbacks2 != null) {
                        activityLifecycleCallbacks2.onActivityCreated(activity, bundle);
                    } else if (!this.f34294w) {
                        application.unregisterActivityLifecycleCallbacks(this);
                        this.f34294w = true;
                    }
                    break;
                } catch (Exception e9) {
                    int i = w2.z.f41712b;
                    x2.i.d("Error while dispatching lifecycle callback.", e9);
                    return;
                }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        Application application = this.f34292u;
        WeakReference weakReference = this.f34293v;
        switch (this.f34291n) {
            case 0:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) weakReference.get();
                    if (activityLifecycleCallbacks != null) {
                        activityLifecycleCallbacks.onActivityDestroyed(activity);
                    } else if (!this.f34294w) {
                        application.unregisterActivityLifecycleCallbacks(this);
                        this.f34294w = true;
                    }
                    break;
                } catch (Exception unused) {
                    return;
                }
            default:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks2 = (Application.ActivityLifecycleCallbacks) weakReference.get();
                    if (activityLifecycleCallbacks2 != null) {
                        activityLifecycleCallbacks2.onActivityDestroyed(activity);
                    } else if (!this.f34294w) {
                        application.unregisterActivityLifecycleCallbacks(this);
                        this.f34294w = true;
                    }
                    break;
                } catch (Exception e9) {
                    int i = w2.z.f41712b;
                    x2.i.d("Error while dispatching lifecycle callback.", e9);
                    return;
                }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        Application application = this.f34292u;
        WeakReference weakReference = this.f34293v;
        switch (this.f34291n) {
            case 0:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) weakReference.get();
                    if (activityLifecycleCallbacks != null) {
                        activityLifecycleCallbacks.onActivityPaused(activity);
                    } else if (!this.f34294w) {
                        application.unregisterActivityLifecycleCallbacks(this);
                        this.f34294w = true;
                    }
                    break;
                } catch (Exception unused) {
                    return;
                }
            default:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks2 = (Application.ActivityLifecycleCallbacks) weakReference.get();
                    if (activityLifecycleCallbacks2 != null) {
                        activityLifecycleCallbacks2.onActivityPaused(activity);
                    } else if (!this.f34294w) {
                        application.unregisterActivityLifecycleCallbacks(this);
                        this.f34294w = true;
                    }
                    break;
                } catch (Exception e9) {
                    int i = w2.z.f41712b;
                    x2.i.d("Error while dispatching lifecycle callback.", e9);
                    return;
                }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Application application = this.f34292u;
        WeakReference weakReference = this.f34293v;
        switch (this.f34291n) {
            case 0:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) weakReference.get();
                    if (activityLifecycleCallbacks != null) {
                        activityLifecycleCallbacks.onActivityResumed(activity);
                    } else if (!this.f34294w) {
                        application.unregisterActivityLifecycleCallbacks(this);
                        this.f34294w = true;
                    }
                    break;
                } catch (Exception unused) {
                    return;
                }
            default:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks2 = (Application.ActivityLifecycleCallbacks) weakReference.get();
                    if (activityLifecycleCallbacks2 != null) {
                        activityLifecycleCallbacks2.onActivityResumed(activity);
                    } else if (!this.f34294w) {
                        application.unregisterActivityLifecycleCallbacks(this);
                        this.f34294w = true;
                    }
                    break;
                } catch (Exception e9) {
                    int i = w2.z.f41712b;
                    x2.i.d("Error while dispatching lifecycle callback.", e9);
                    return;
                }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        Application application = this.f34292u;
        WeakReference weakReference = this.f34293v;
        switch (this.f34291n) {
            case 0:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) weakReference.get();
                    if (activityLifecycleCallbacks != null) {
                        activityLifecycleCallbacks.onActivitySaveInstanceState(activity, bundle);
                    } else if (!this.f34294w) {
                        application.unregisterActivityLifecycleCallbacks(this);
                        this.f34294w = true;
                    }
                    break;
                } catch (Exception unused) {
                    return;
                }
            default:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks2 = (Application.ActivityLifecycleCallbacks) weakReference.get();
                    if (activityLifecycleCallbacks2 != null) {
                        activityLifecycleCallbacks2.onActivitySaveInstanceState(activity, bundle);
                    } else if (!this.f34294w) {
                        application.unregisterActivityLifecycleCallbacks(this);
                        this.f34294w = true;
                    }
                    break;
                } catch (Exception e9) {
                    int i = w2.z.f41712b;
                    x2.i.d("Error while dispatching lifecycle callback.", e9);
                    return;
                }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        Application application = this.f34292u;
        WeakReference weakReference = this.f34293v;
        switch (this.f34291n) {
            case 0:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) weakReference.get();
                    if (activityLifecycleCallbacks != null) {
                        activityLifecycleCallbacks.onActivityStarted(activity);
                    } else if (!this.f34294w) {
                        application.unregisterActivityLifecycleCallbacks(this);
                        this.f34294w = true;
                    }
                    break;
                } catch (Exception unused) {
                    return;
                }
            default:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks2 = (Application.ActivityLifecycleCallbacks) weakReference.get();
                    if (activityLifecycleCallbacks2 != null) {
                        activityLifecycleCallbacks2.onActivityStarted(activity);
                    } else if (!this.f34294w) {
                        application.unregisterActivityLifecycleCallbacks(this);
                        this.f34294w = true;
                    }
                    break;
                } catch (Exception e9) {
                    int i = w2.z.f41712b;
                    x2.i.d("Error while dispatching lifecycle callback.", e9);
                    return;
                }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        Application application = this.f34292u;
        WeakReference weakReference = this.f34293v;
        switch (this.f34291n) {
            case 0:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) weakReference.get();
                    if (activityLifecycleCallbacks != null) {
                        activityLifecycleCallbacks.onActivityStopped(activity);
                    } else if (!this.f34294w) {
                        application.unregisterActivityLifecycleCallbacks(this);
                        this.f34294w = true;
                    }
                    break;
                } catch (Exception unused) {
                    return;
                }
            default:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks2 = (Application.ActivityLifecycleCallbacks) weakReference.get();
                    if (activityLifecycleCallbacks2 != null) {
                        activityLifecycleCallbacks2.onActivityStopped(activity);
                    } else if (!this.f34294w) {
                        application.unregisterActivityLifecycleCallbacks(this);
                        this.f34294w = true;
                    }
                    break;
                } catch (Exception e9) {
                    int i = w2.z.f41712b;
                    x2.i.d("Error while dispatching lifecycle callback.", e9);
                    return;
                }
        }
    }

    public C3841r7(Application application, ViewOnAttachStateChangeListenerC4004u8 viewOnAttachStateChangeListenerC4004u8) {
        this.f34293v = new WeakReference(viewOnAttachStateChangeListenerC4004u8);
        this.f34292u = application;
    }
}
