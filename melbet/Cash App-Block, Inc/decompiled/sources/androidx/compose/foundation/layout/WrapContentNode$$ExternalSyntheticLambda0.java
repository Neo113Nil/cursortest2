package androidx.compose.foundation.layout;

import android.os.SystemClock;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cardcustomizations.signature.Signature;
import com.squareup.cardcustomizations.signature.SignatureState;
import com.squareup.cardcustomizations.signature.SignatureStateListener;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes3.dex */
public final /* synthetic */ class WrapContentNode$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId = 2;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ int f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ int f$3;
    public final /* synthetic */ Object f$4;

    public /* synthetic */ WrapContentNode$$ExternalSyntheticLambda0(int i, int i2, Placeable placeable, Placeable placeable2, ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState) {
        this.f$1 = i;
        this.f$3 = i2;
        this.f$2 = placeable;
        this.f$0 = placeable2;
        this.f$4 = parcelableSnapshotMutableIntState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        Object obj2 = this.f$4;
        Object obj3 = this.f$0;
        Object obj4 = this.f$2;
        int i2 = this.f$3;
        int i3 = this.f$1;
        switch (i) {
            case 0:
                Placeable.PlacementScope.m854place70tqf50$default((Placeable.PlacementScope) obj, (Placeable) obj4, ((IntOffset) ((WrapContentNode) obj3).alignmentCallback.invoke(new IntSize((BodyPartID.bodyIdMax & (i2 - r7.height)) | ((i3 - r7.width) << 32)), ((MeasureScope) obj2).getLayoutDirection())).packedValue);
                break;
            case 1:
                SignatureStateListener signatureStateListener = (SignatureStateListener) obj3;
                SignatureState signatureState = (SignatureState) obj4;
                Offset offset = (Offset) obj;
                ((MutableState) obj2).setValue(new Offset(offset.packedValue));
                long j = offset.packedValue;
                int i4 = (int) (j & BodyPartID.bodyIdMax);
                float f = i3;
                int i5 = ((int) ((Float.intBitsToFloat(i4) / f) % 2.0f)) != 0 ? i2 / 2 : 0;
                signatureStateListener.onStartedSigning();
                Signature signature$customizations = signatureState.getSignature$customizations();
                if (signature$customizations != null) {
                    signature$customizations.startGlyph();
                }
                Signature signature$customizations2 = signatureState.getSignature$customizations();
                if (signature$customizations2 != null) {
                    signature$customizations2.extendGlyph(Float.intBitsToFloat((int) (signatureState.m2966getSignatureOffsetF1C5BW0$customizations() >> 32)) + ((Float.intBitsToFloat((int) (j >> 32)) - i5) % i2), Float.intBitsToFloat((int) (BodyPartID.bodyIdMax & signatureState.m2966getSignatureOffsetF1C5BW0$customizations())) + (Float.intBitsToFloat(i4) % f), SystemClock.uptimeMillis());
                }
                signatureState.setInvalidate$customizations(signatureState.getInvalidate$customizations() + 1);
                break;
            default:
                Placeable placeable = (Placeable) obj4;
                Placeable placeable2 = (Placeable) obj3;
                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) obj2;
                Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
                placementScope.getClass();
                placementScope.placeRelative(placeable, 0, i3 < i2 ? (parcelableSnapshotMutableIntState.getIntValue() + (i2 / 2)) - (i3 / 2) : 0, RecyclerView.DECELERATION_RATE);
                placementScope.placeRelative(placeable2, placeable.width, 0, RecyclerView.DECELERATION_RATE);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ WrapContentNode$$ExternalSyntheticLambda0(int i, int i2, SignatureStateListener signatureStateListener, SignatureState signatureState, MutableState mutableState) {
        this.f$1 = i;
        this.f$3 = i2;
        this.f$0 = signatureStateListener;
        this.f$2 = signatureState;
        this.f$4 = mutableState;
    }

    public /* synthetic */ WrapContentNode$$ExternalSyntheticLambda0(WrapContentNode wrapContentNode, int i, Placeable placeable, int i2, MeasureScope measureScope) {
        this.f$0 = wrapContentNode;
        this.f$1 = i;
        this.f$2 = placeable;
        this.f$3 = i2;
        this.f$4 = measureScope;
    }
}
