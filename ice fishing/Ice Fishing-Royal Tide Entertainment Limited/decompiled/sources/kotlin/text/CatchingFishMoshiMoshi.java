package kotlin.text;

import android.view.Choreographer;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class CatchingFishMoshiMoshi implements Choreographer.FrameCallback, Runnable {
    public final /* synthetic */ CatchingFishContextFragment CatchingFishReduxKtor;

    public CatchingFishMoshiMoshi(CatchingFishContextFragment catchingFishContextFragment) {
        this.CatchingFishReduxKtor = catchingFishContextFragment;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.CatchingFishReduxKtor.CatchingFishViewModelScope.removeCallbacks(this);
        CatchingFishContextFragment.CatchingFishFragmentFactory(this.CatchingFishReduxKtor);
        CatchingFishContextFragment catchingFishContextFragment = this.CatchingFishReduxKtor;
        synchronized (catchingFishContextFragment.CatchingFishViewModelFAB) {
            if (catchingFishContextFragment.CatchingFishOkHttp) {
                catchingFishContextFragment.CatchingFishOkHttp = false;
                ArrayList arrayList = catchingFishContextFragment.CatchingFishFragmentHandler;
                catchingFishContextFragment.CatchingFishFragmentHandler = catchingFishContextFragment.CatchingFishCloudMessaging;
                catchingFishContextFragment.CatchingFishCloudMessaging = arrayList;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((Choreographer.FrameCallback) arrayList.get(i)).doFrame(j);
                }
                arrayList.clear();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        CatchingFishContextFragment.CatchingFishFragmentFactory(this.CatchingFishReduxKtor);
        CatchingFishContextFragment catchingFishContextFragment = this.CatchingFishReduxKtor;
        synchronized (catchingFishContextFragment.CatchingFishViewModelFAB) {
            if (catchingFishContextFragment.CatchingFishFragmentHandler.isEmpty()) {
                catchingFishContextFragment.CatchingFishWorkManager.removeFrameCallback(this);
                catchingFishContextFragment.CatchingFishOkHttp = false;
            }
        }
    }
}
