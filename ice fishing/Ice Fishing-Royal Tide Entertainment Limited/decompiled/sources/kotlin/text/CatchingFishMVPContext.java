package kotlin.text;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;

/* loaded from: classes.dex */
public final class CatchingFishMVPContext extends CatchingFishDaggerBiometric {
    public final /* synthetic */ CatchingFishPicassoOkHttp CatchingFishLayout;
    public final /* synthetic */ CatchingFishDaggerBiometric CatchingFishViewModelFAB;
    public final /* synthetic */ TextPaint CatchingFishViewModelScope;
    public final /* synthetic */ Context CatchingFishWorkManager;

    public CatchingFishMVPContext(CatchingFishPicassoOkHttp catchingFishPicassoOkHttp, Context context, TextPaint textPaint, CatchingFishDaggerBiometric catchingFishDaggerBiometric) {
        this.CatchingFishLayout = catchingFishPicassoOkHttp;
        this.CatchingFishWorkManager = context;
        this.CatchingFishViewModelScope = textPaint;
        this.CatchingFishViewModelFAB = catchingFishDaggerBiometric;
    }

    @Override // kotlin.text.CatchingFishDaggerBiometric
    public final void CatchingFishFragmentFactory(int i) {
        this.CatchingFishViewModelFAB.CatchingFishFragmentFactory(i);
    }

    @Override // kotlin.text.CatchingFishDaggerBiometric
    public final void CatchingFishMutableLiveData(Typeface typeface, boolean z) {
        this.CatchingFishLayout.CatchingFishWorkManager(this.CatchingFishWorkManager, this.CatchingFishViewModelScope, typeface);
        this.CatchingFishViewModelFAB.CatchingFishMutableLiveData(typeface, z);
    }
}
