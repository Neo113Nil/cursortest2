package kotlin.text;

import android.util.SparseArray;

/* loaded from: classes.dex */
public final class CatchingFishSpannableMVP {
    public SparseArray CatchingFishParcelableFAB;
    public int CatchingFishSnackbar;

    public final CatchingFishContextHandler CatchingFishParcelableFAB(int i) {
        SparseArray sparseArray = this.CatchingFishParcelableFAB;
        CatchingFishContextHandler catchingFishContextHandler = (CatchingFishContextHandler) sparseArray.get(i);
        if (catchingFishContextHandler != null) {
            return catchingFishContextHandler;
        }
        CatchingFishContextHandler catchingFishContextHandler2 = new CatchingFishContextHandler();
        sparseArray.put(i, catchingFishContextHandler2);
        return catchingFishContextHandler2;
    }
}
