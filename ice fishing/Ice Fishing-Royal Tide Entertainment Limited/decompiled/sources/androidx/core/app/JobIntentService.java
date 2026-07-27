package androidx.core.app;

import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.IBinder;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.text.CatchingFishContextMVPMVVM;
import kotlin.text.CatchingFishLayoutMVIRoom;
import kotlin.text.CatchingFishMVISpannable;
import kotlin.text.CatchingFishStateFlowKtor;

@Deprecated
/* loaded from: classes.dex */
public abstract class JobIntentService extends Service {
    public static final HashMap CatchingFishLayout = new HashMap();
    public CatchingFishContextMVPMVVM CatchingFishDaggerWebsocket;
    public CatchingFishStateFlowKtor CatchingFishReduxKtor;
    public final ArrayList CatchingFishViewModelFAB;
    public boolean CatchingFishViewModelScope = false;
    public CatchingFishMVISpannable CatchingFishWorkManager;

    public JobIntentService() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.CatchingFishViewModelFAB = null;
        } else {
            this.CatchingFishViewModelFAB = new ArrayList();
        }
    }

    public final void CatchingFishCoroutine() {
        ArrayList arrayList = this.CatchingFishViewModelFAB;
        if (arrayList != null) {
            synchronized (arrayList) {
                try {
                    this.CatchingFishWorkManager = null;
                    ArrayList arrayList2 = this.CatchingFishViewModelFAB;
                    if (arrayList2 != null && arrayList2.size() > 0) {
                        CatchingFishParcelableFAB(false);
                    } else if (!this.CatchingFishViewModelScope) {
                        this.CatchingFishDaggerWebsocket.CatchingFishParcelableFAB();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void CatchingFishParcelableFAB(boolean z) {
        if (this.CatchingFishWorkManager == null) {
            this.CatchingFishWorkManager = new CatchingFishMVISpannable(this);
            CatchingFishContextMVPMVVM catchingFishContextMVPMVVM = this.CatchingFishDaggerWebsocket;
            if (catchingFishContextMVPMVVM != null && z) {
                synchronized (catchingFishContextMVPMVVM) {
                    try {
                        if (!catchingFishContextMVPMVVM.CatchingFishCoroutine) {
                            catchingFishContextMVPMVVM.CatchingFishCoroutine = true;
                            catchingFishContextMVPMVVM.CatchingFishSnackbar.acquire(600000L);
                            catchingFishContextMVPMVVM.CatchingFishParcelableFAB.release();
                        }
                    } finally {
                    }
                }
            }
            this.CatchingFishWorkManager.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    public abstract void CatchingFishSnackbar();

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        IBinder binder;
        CatchingFishStateFlowKtor catchingFishStateFlowKtor = this.CatchingFishReduxKtor;
        if (catchingFishStateFlowKtor == null) {
            return null;
        }
        binder = catchingFishStateFlowKtor.getBinder();
        return binder;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            this.CatchingFishReduxKtor = new CatchingFishStateFlowKtor(this);
            this.CatchingFishDaggerWebsocket = null;
            return;
        }
        this.CatchingFishReduxKtor = null;
        ComponentName componentName = new ComponentName(this, getClass());
        HashMap hashMap = CatchingFishLayout;
        CatchingFishContextMVPMVVM catchingFishContextMVPMVVM = (CatchingFishContextMVPMVVM) hashMap.get(componentName);
        if (catchingFishContextMVPMVVM == null) {
            if (i >= 26) {
                throw new IllegalArgumentException("Can't be here without a job id");
            }
            catchingFishContextMVPMVVM = new CatchingFishContextMVPMVVM(this, componentName);
            hashMap.put(componentName, catchingFishContextMVPMVVM);
        }
        this.CatchingFishDaggerWebsocket = catchingFishContextMVPMVVM;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        ArrayList arrayList = this.CatchingFishViewModelFAB;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.CatchingFishViewModelScope = true;
                this.CatchingFishDaggerWebsocket.CatchingFishParcelableFAB();
            }
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        if (this.CatchingFishViewModelFAB == null) {
            return 2;
        }
        synchronized (this.CatchingFishDaggerWebsocket) {
        }
        synchronized (this.CatchingFishViewModelFAB) {
            ArrayList arrayList = this.CatchingFishViewModelFAB;
            if (intent == null) {
                intent = new Intent();
            }
            arrayList.add(new CatchingFishLayoutMVIRoom(this, intent, i2));
            CatchingFishParcelableFAB(true);
        }
        return 3;
    }
}
