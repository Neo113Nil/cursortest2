package kotlin.text;

import android.os.Handler;
import android.view.Choreographer;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class CatchingFishContextFragment extends CatchingFishToastGradle {
    public final CatchingFishWebsocketWidget CatchingFishAnimationMockk;
    public boolean CatchingFishEspressoTesting;
    public boolean CatchingFishOkHttp;
    public final Handler CatchingFishViewModelScope;
    public final Choreographer CatchingFishWorkManager;
    public static final CatchingFishKtorHiltIntent CatchingFishStateLiveData = CatchingFishXMLLayoutGlide.CatchingFishPayPal(CatchingFishDataStoreJUnit.CatchingFishCloudMessaging);
    public static final CatchingFishKtorDatabinding CatchingFishRoomDatabase = new CatchingFishKtorDatabinding(0);
    public final Object CatchingFishViewModelFAB = new Object();
    public final CatchingFishMVVMLifecycle CatchingFishLayout = new CatchingFishMVVMLifecycle();
    public ArrayList CatchingFishFragmentHandler = new ArrayList();
    public ArrayList CatchingFishCloudMessaging = new ArrayList();
    public final CatchingFishMoshiMoshi CatchingFishUnitTesting = new CatchingFishMoshiMoshi(this);

    public CatchingFishContextFragment(Choreographer choreographer, Handler handler) {
        this.CatchingFishWorkManager = choreographer;
        this.CatchingFishViewModelScope = handler;
        this.CatchingFishAnimationMockk = new CatchingFishWebsocketWidget(choreographer, this);
    }

    public static final void CatchingFishFragmentFactory(CatchingFishContextFragment catchingFishContextFragment) {
        Runnable runnable;
        boolean z;
        do {
            synchronized (catchingFishContextFragment.CatchingFishViewModelFAB) {
                CatchingFishMVVMLifecycle catchingFishMVVMLifecycle = catchingFishContextFragment.CatchingFishLayout;
                runnable = (Runnable) (catchingFishMVVMLifecycle.isEmpty() ? null : catchingFishMVVMLifecycle.removeFirst());
            }
            while (runnable != null) {
                runnable.run();
                synchronized (catchingFishContextFragment.CatchingFishViewModelFAB) {
                    CatchingFishMVVMLifecycle catchingFishMVVMLifecycle2 = catchingFishContextFragment.CatchingFishLayout;
                    runnable = (Runnable) (catchingFishMVVMLifecycle2.isEmpty() ? null : catchingFishMVVMLifecycle2.removeFirst());
                }
            }
            synchronized (catchingFishContextFragment.CatchingFishViewModelFAB) {
                if (catchingFishContextFragment.CatchingFishLayout.isEmpty()) {
                    z = false;
                    catchingFishContextFragment.CatchingFishEspressoTesting = false;
                } else {
                    z = true;
                }
            }
        } while (z);
    }

    @Override // kotlin.text.CatchingFishToastGradle
    public final void CatchingFishCardViewView(CatchingFishManifestMockk catchingFishManifestMockk, Runnable runnable) {
        synchronized (this.CatchingFishViewModelFAB) {
            this.CatchingFishLayout.addLast(runnable);
            if (!this.CatchingFishEspressoTesting) {
                this.CatchingFishEspressoTesting = true;
                this.CatchingFishViewModelScope.post(this.CatchingFishUnitTesting);
                if (!this.CatchingFishOkHttp) {
                    this.CatchingFishOkHttp = true;
                    this.CatchingFishWorkManager.postFrameCallback(this.CatchingFishUnitTesting);
                }
            }
        }
    }
}
