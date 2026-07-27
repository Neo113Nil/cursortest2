package kotlin.text;

import android.util.Base64;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class CatchingFishBundleMVIHilt {
    public final CatchingFishContextMVI CatchingFishCoroutine;
    public final String CatchingFishParcelableFAB;
    public final byte[] CatchingFishSnackbar;

    public CatchingFishBundleMVIHilt(String str, byte[] bArr, CatchingFishContextMVI catchingFishContextMVI) {
        this.CatchingFishParcelableFAB = str;
        this.CatchingFishSnackbar = bArr;
        this.CatchingFishCoroutine = catchingFishContextMVI;
    }

    public static CatchingFishAsyncTaskDagger CatchingFishParcelableFAB() {
        CatchingFishAsyncTaskDagger catchingFishAsyncTaskDagger = new CatchingFishAsyncTaskDagger(2, false);
        catchingFishAsyncTaskDagger.CatchingFishViewModelScope = CatchingFishContextMVI.CatchingFishReduxKtor;
        return catchingFishAsyncTaskDagger;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CatchingFishBundleMVIHilt) {
            CatchingFishBundleMVIHilt catchingFishBundleMVIHilt = (CatchingFishBundleMVIHilt) obj;
            if (this.CatchingFishParcelableFAB.equals(catchingFishBundleMVIHilt.CatchingFishParcelableFAB) && Arrays.equals(this.CatchingFishSnackbar, catchingFishBundleMVIHilt.CatchingFishSnackbar) && this.CatchingFishCoroutine.equals(catchingFishBundleMVIHilt.CatchingFishCoroutine)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.CatchingFishParcelableFAB.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.CatchingFishSnackbar)) * 1000003) ^ this.CatchingFishCoroutine.hashCode();
    }

    public final String toString() {
        byte[] bArr = this.CatchingFishSnackbar;
        String encodeToString = bArr == null ? "" : Base64.encodeToString(bArr, 2);
        StringBuilder sb = new StringBuilder("TransportContext(");
        sb.append(this.CatchingFishParcelableFAB);
        sb.append(", ");
        sb.append(this.CatchingFishCoroutine);
        sb.append(", ");
        return CatchingFishMVPLiveData.CatchingFishStateLiveData(sb, encodeToString, ")");
    }
}
