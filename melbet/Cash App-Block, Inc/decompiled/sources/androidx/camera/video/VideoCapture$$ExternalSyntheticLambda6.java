package androidx.camera.video;

import android.graphics.Rect;
import android.media.MediaCodec;
import android.util.Size;
import androidx.camera.core.Preview;
import androidx.camera.core.impl.AutoValue_SessionConfig_OutputConfig;
import androidx.camera.core.streamsharing.StreamSharing;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import androidx.media3.extractor.VorbisUtil$Mode;
import androidx.paging.HintHandler$$ExternalSyntheticLambda0;
import app.cash.local.views.internal.LocalCombinedViewsKt$$ExternalSyntheticLambda3;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonGroup;
import com.squareup.cash.data.db.RealAppConfigManager$$ExternalSyntheticLambda6;
import com.squareup.cash.family.familyhub.views.AllowanceViewKt$$ExternalSyntheticLambda3;
import com.squareup.cash.paychecks.views.PaycheckCircles$$ExternalSyntheticLambda4;
import com.squareup.cash.sharesheet.ShareSheetPresenter$$ExternalSyntheticLambda0;
import com.squareup.wire.internal.FieldBinding$$ExternalSyntheticLambda5;
import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class VideoCapture$$ExternalSyntheticLambda6 implements Comparator {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ VideoCapture$$ExternalSyntheticLambda6(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = 1;
        Object obj3 = this.f$0;
        switch (i) {
            case 0:
                Rect rect = (Rect) obj3;
                Size size = (Size) obj;
                Size size2 = (Size) obj2;
                return (Math.abs(size.getHeight() - rect.height()) + Math.abs(size.getWidth() - rect.width())) - (Math.abs(size2.getHeight() - rect.height()) + Math.abs(size2.getWidth() - rect.width()));
            case 1:
                AutoValue_SessionConfig_OutputConfig autoValue_SessionConfig_OutputConfig = (AutoValue_SessionConfig_OutputConfig) obj2;
                ((VorbisUtil$Mode) obj3).getClass();
                Class cls = ((AutoValue_SessionConfig_OutputConfig) obj).surface.mContainerClass;
                int i3 = cls == MediaCodec.class ? 2 : (cls == Preview.class || cls == StreamSharing.class) ? 0 : 1;
                Class cls2 = autoValue_SessionConfig_OutputConfig.surface.mContainerClass;
                if (cls2 == MediaCodec.class) {
                    i2 = 2;
                } else if (cls2 == Preview.class || cls2 == StreamSharing.class) {
                    i2 = 0;
                }
                return i3 - i2;
            case 2:
                return ((Number) ((LocalCombinedViewsKt$$ExternalSyntheticLambda3) obj3).invoke(obj, obj2)).intValue();
            case 3:
                return ((Number) ((HintHandler$$ExternalSyntheticLambda0) obj3).invoke(obj, obj2)).intValue();
            case 4:
                return ((Number) ((Function2) obj3).invoke(obj, obj2)).intValue();
            case 5:
                MediaCodecUtil.ScoreProvider scoreProvider = (MediaCodecUtil.ScoreProvider) obj3;
                return scoreProvider.getScore(obj2) - scoreProvider.getScore(obj);
            case 6:
                MaterialButtonGroup materialButtonGroup = (MaterialButtonGroup) obj3;
                MaterialButton materialButton = (MaterialButton) obj;
                MaterialButton materialButton2 = (MaterialButton) obj2;
                Object obj4 = MaterialButtonGroup.OVERFLOW_BUTTON_TAG;
                int compareTo = Boolean.valueOf(materialButton.checked).compareTo(Boolean.valueOf(materialButton2.checked));
                if (compareTo != 0) {
                    return compareTo;
                }
                int compareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
                return compareTo2 != 0 ? compareTo2 : Integer.compare(materialButtonGroup.indexOfChild(materialButton), materialButtonGroup.indexOfChild(materialButton2));
            case 7:
                return ((Number) ((RealAppConfigManager$$ExternalSyntheticLambda6) obj3).invoke(obj, obj2)).intValue();
            case 8:
                return ((Number) ((AllowanceViewKt$$ExternalSyntheticLambda3) obj3).invoke(obj, obj2)).intValue();
            case 9:
                return ((Number) ((PaycheckCircles$$ExternalSyntheticLambda4) obj3).invoke(obj, obj2)).intValue();
            case 10:
                return ((Number) ((ShareSheetPresenter$$ExternalSyntheticLambda0) obj3).invoke(obj, obj2)).intValue();
            case 11:
                return ((Number) ((FieldBinding$$ExternalSyntheticLambda5) obj3).invoke(obj, obj2)).intValue();
            case 12:
                for (Function1 function1 : (Function1[]) obj3) {
                    int compareValues = ComparisonsKt__ComparisonsKt.compareValues((Comparable) function1.invoke(obj), (Comparable) function1.invoke(obj2));
                    if (compareValues != 0) {
                        return compareValues;
                    }
                }
                return 0;
            default:
                Comparator comparator = (Comparator) obj3;
                if (obj == obj2) {
                    return 0;
                }
                if (obj == null) {
                    return 1;
                }
                if (obj2 == null) {
                    return -1;
                }
                return comparator.compare(obj, obj2);
        }
    }
}
