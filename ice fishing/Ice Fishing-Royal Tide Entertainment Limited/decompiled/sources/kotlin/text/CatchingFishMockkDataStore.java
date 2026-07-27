package kotlin.text;

import android.view.View;
import com.android.installreferrer.api.InstallReferrerClient;

/* loaded from: classes.dex */
public final class CatchingFishMockkDataStore extends CatchingFishXMLLayoutGlide {
    public final /* synthetic */ int CatchingFishStateLiveData;

    public /* synthetic */ CatchingFishMockkDataStore(int i) {
        this.CatchingFishStateLiveData = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.text.CatchingFishXMLLayoutGlide
    public final float CatchingFishCoroutineFlow(CatchingFishOkHttpDagger catchingFishOkHttpDagger) {
        switch (this.CatchingFishStateLiveData) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((View) catchingFishOkHttpDagger).getAlpha();
            case 1:
                return ((View) catchingFishOkHttpDagger).getScaleX();
            case 2:
                return ((View) catchingFishOkHttpDagger).getScaleY();
            case 3:
                return ((View) catchingFishOkHttpDagger).getRotation();
            case 4:
                return ((View) catchingFishOkHttpDagger).getRotationX();
            default:
                return ((View) catchingFishOkHttpDagger).getRotationY();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.text.CatchingFishXMLLayoutGlide
    public final void CatchingFishDagger(CatchingFishOkHttpDagger catchingFishOkHttpDagger, float f) {
        switch (this.CatchingFishStateLiveData) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((View) catchingFishOkHttpDagger).setAlpha(f);
                break;
            case 1:
                ((View) catchingFishOkHttpDagger).setScaleX(f);
                break;
            case 2:
                ((View) catchingFishOkHttpDagger).setScaleY(f);
                break;
            case 3:
                ((View) catchingFishOkHttpDagger).setRotation(f);
                break;
            case 4:
                ((View) catchingFishOkHttpDagger).setRotationX(f);
                break;
            default:
                ((View) catchingFishOkHttpDagger).setRotationY(f);
                break;
        }
    }
}
