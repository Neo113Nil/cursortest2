package bo.app;

import com.braze.support.BrazeImageUtils;
import com.braze.ui.contentcards.adapters.ContentCardAdapter;
import com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper$open$2;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class xf$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ int f$0;
    public final /* synthetic */ int f$1;

    public /* synthetic */ xf$$ExternalSyntheticLambda0(int i, int i2, int i3) {
        this.$r8$classId = i3;
        this.f$0 = i;
        this.f$1 = i2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String remoteBitmap$lambda$2;
        String destinationHeightAndWidthPixels$lambda$0;
        String localBitmap$lambda$4;
        String markOnScreenCardsAsRead$lambda$1;
        String onLayoutChange$lambda$0;
        switch (this.$r8$classId) {
            case 0:
                return xf.b(this.f$0, this.f$1);
            case 1:
                remoteBitmap$lambda$2 = BrazeImageUtils.getRemoteBitmap$lambda$2(this.f$0, this.f$1);
                return remoteBitmap$lambda$2;
            case 2:
                destinationHeightAndWidthPixels$lambda$0 = BrazeImageUtils.getDestinationHeightAndWidthPixels$lambda$0(this.f$0, this.f$1);
                return destinationHeightAndWidthPixels$lambda$0;
            case 3:
                localBitmap$lambda$4 = BrazeImageUtils.getLocalBitmap$lambda$4(this.f$0, this.f$1);
                return localBitmap$lambda$4;
            case 4:
                markOnScreenCardsAsRead$lambda$1 = ContentCardAdapter.markOnScreenCardsAsRead$lambda$1(this.f$0, this.f$1);
                return markOnScreenCardsAsRead$lambda$1;
            default:
                onLayoutChange$lambda$0 = DefaultInAppMessageViewWrapper$open$2.onLayoutChange$lambda$0(this.f$0, this.f$1);
                return onLayoutChange$lambda$0;
        }
    }
}
