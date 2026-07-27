package kotlin.text;

import android.util.SparseArray;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class CatchingFishRoomGlide {
    public static final SparseArray CatchingFishParcelableFAB = new SparseArray();
    public static final HashMap CatchingFishSnackbar;

    static {
        HashMap hashMap = new HashMap();
        CatchingFishSnackbar = hashMap;
        hashMap.put(CatchingFishContextMVI.CatchingFishReduxKtor, 0);
        hashMap.put(CatchingFishContextMVI.CatchingFishDaggerWebsocket, 1);
        hashMap.put(CatchingFishContextMVI.CatchingFishWorkManager, 2);
        for (CatchingFishContextMVI catchingFishContextMVI : hashMap.keySet()) {
            CatchingFishParcelableFAB.append(((Integer) CatchingFishSnackbar.get(catchingFishContextMVI)).intValue(), catchingFishContextMVI);
        }
    }

    public static int CatchingFishParcelableFAB(CatchingFishContextMVI catchingFishContextMVI) {
        Integer num = (Integer) CatchingFishSnackbar.get(catchingFishContextMVI);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + catchingFishContextMVI);
    }

    public static CatchingFishContextMVI CatchingFishSnackbar(int i) {
        CatchingFishContextMVI catchingFishContextMVI = (CatchingFishContextMVI) CatchingFishParcelableFAB.get(i);
        if (catchingFishContextMVI != null) {
            return catchingFishContextMVI;
        }
        throw new IllegalArgumentException(CatchingFishMVPLiveData.CatchingFishCloudMessaging("Unknown Priority for value ", i));
    }
}
