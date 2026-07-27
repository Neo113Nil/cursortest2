package kotlin.text;

import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class CatchingFishLifecycleRoom {
    public final CatchingFishOkHttpViewPager CatchingFishCoroutine;
    public final XmlPullParser CatchingFishParcelableFAB;
    public int CatchingFishSnackbar = 0;

    public CatchingFishLifecycleRoom(XmlResourceParser xmlResourceParser) {
        this.CatchingFishParcelableFAB = xmlResourceParser;
        CatchingFishOkHttpViewPager catchingFishOkHttpViewPager = new CatchingFishOkHttpViewPager();
        catchingFishOkHttpViewPager.CatchingFishSnackbar = new float[64];
        this.CatchingFishCoroutine = catchingFishOkHttpViewPager;
    }

    public final float CatchingFishParcelableFAB(TypedArray typedArray, String str, int i, float f) {
        if (CatchingFishViewMVIMVVM.CatchingFishEspressoTesting(this.CatchingFishParcelableFAB, str)) {
            f = typedArray.getFloat(i, f);
        }
        CatchingFishSnackbar(typedArray.getChangingConfigurations());
        return f;
    }

    public final void CatchingFishSnackbar(int i) {
        this.CatchingFishSnackbar = i | this.CatchingFishSnackbar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatchingFishLifecycleRoom)) {
            return false;
        }
        CatchingFishLifecycleRoom catchingFishLifecycleRoom = (CatchingFishLifecycleRoom) obj;
        return CatchingFishFirebaseDagger.CatchingFishOkHttp(this.CatchingFishParcelableFAB, catchingFishLifecycleRoom.CatchingFishParcelableFAB) && this.CatchingFishSnackbar == catchingFishLifecycleRoom.CatchingFishSnackbar;
    }

    public final int hashCode() {
        return Integer.hashCode(this.CatchingFishSnackbar) + (this.CatchingFishParcelableFAB.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidVectorParser(xmlParser=");
        sb.append(this.CatchingFishParcelableFAB);
        sb.append(", config=");
        return CatchingFishMVPLiveData.CatchingFishAnimationMockk(sb, this.CatchingFishSnackbar, ')');
    }
}
