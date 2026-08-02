package androidx.camera.video.internal.muxer;

import android.content.Context;
import android.media.MediaCodec;
import android.widget.ImageView;
import androidx.appcompat.widget.TintInfo;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.media3.common.util.Util;
import androidx.media3.muxer.BufferInfo;
import androidx.media3.muxer.Mp4Muxer;
import androidx.tracing.Trace;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.ImageLoader$Builder;
import coil3.RealImageLoader;
import coil3.request.ImageRequest;
import coil3.request.ImageRequests_androidKt;
import com.miteksystems.misnap.workflow.a.o;
import com.squareup.cash.amountslider.viewmodels.AmountSelectorWidgetModel;
import com.squareup.cash.formview.components.FormElementViewBuilder$toView$18;
import com.squareup.cash.formview.components.arcade.ArcadeFormEmojiPicker;
import com.squareup.cash.formview.viewevents.api.FormViewEvent;
import com.squareup.protos.franklin.api.FormBlocker;
import com.squareup.protos.franklin.app.SubmitFormRequest;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.steps.ui.components.RemoteImageComponentKt$$ExternalSyntheticLambda7;
import com.withpersona.sdk2.inquiry.steps.ui.styling.ImageStylingKt;
import java.nio.ByteBuffer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref$BooleanRef;
import org.brotli.dec.HuffmanTreeGroup;

/* loaded from: classes3.dex */
public final /* synthetic */ class Media3MuxerImpl$$ExternalSyntheticLambda1 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ int f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;

    public /* synthetic */ Media3MuxerImpl$$ExternalSyntheticLambda1(o oVar, RemoteImage remoteImage, Ref$BooleanRef ref$BooleanRef, int i) {
        this.$r8$classId = 3;
        this.f$0 = oVar;
        this.f$2 = remoteImage;
        this.f$3 = ref$BooleanRef;
        this.f$1 = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        int i2 = 1;
        int i3 = this.f$1;
        Object obj = this.f$3;
        Object obj2 = this.f$2;
        Object obj3 = this.f$0;
        switch (i) {
            case 0:
                ByteBuffer byteBuffer = (ByteBuffer) obj2;
                MediaCodec.BufferInfo bufferInfo = (MediaCodec.BufferInfo) obj;
                TintInfo tintInfo = (TintInfo) ((HuffmanTreeGroup) obj3).codes;
                tintInfo.getClass();
                Trace.checkState(tintInfo.mHasTintMode);
                try {
                    Mp4Muxer mp4Muxer = (Mp4Muxer) tintInfo.mTintMode;
                    bufferInfo.getClass();
                    long j = bufferInfo.presentationTimeUs;
                    int i4 = bufferInfo.size;
                    int i5 = bufferInfo.flags;
                    String str = Util.DEVICE_DEBUG_INFO;
                    if ((i5 & 1) != 1) {
                        i2 = 0;
                    }
                    if ((i5 & 4) == 4) {
                        i2 |= 4;
                    }
                    mp4Muxer.writeSampleData(i3, byteBuffer, new BufferInfo(i4, i2, j));
                    break;
                } catch (androidx.media3.muxer.MuxerException e) {
                    a$$ExternalSyntheticBUOutline0.m((Throwable) e);
                    return null;
                }
            case 1:
                ((ParcelableSnapshotMutableIntState) obj).setIntValue(i3);
                ((Function1) obj3).invoke((AmountSelectorWidgetModel.Item) obj2);
                break;
            case 2:
                ArcadeFormEmojiPicker arcadeFormEmojiPicker = (ArcadeFormEmojiPicker) obj3;
                ((MutableState) obj).setValue(Integer.valueOf(i3));
                FormElementViewBuilder$toView$18 formElementViewBuilder$toView$18 = arcadeFormEmojiPicker.onEvent;
                String str2 = arcadeFormEmojiPicker.formElementId;
                String str3 = ((FormBlocker.Element.EmojiPickerElement.EmojiCategory.EmojiOption) obj2).icon_id;
                str3.getClass();
                formElementViewBuilder$toView$18.invoke(new FormViewEvent.UpdateResultEvent.EmojiPickChanged(str2, new SubmitFormRequest.ElementResult.EmojiPickerResult(str3)));
                break;
            default:
                RemoteImage remoteImage = (RemoteImage) obj2;
                ImageView imageView = (ImageView) ((o) obj3).c;
                ImageStylingKt.applyStyles(imageView, remoteImage);
                if (((Ref$BooleanRef) obj).element) {
                    Context context = imageView.getContext();
                    context.getClass();
                    RealImageLoader build = new ImageLoader$Builder(context).build();
                    Integer valueOf = Integer.valueOf(i3);
                    ImageRequest.Builder builder = new ImageRequest.Builder(imageView.getContext());
                    builder.data = valueOf;
                    ImageRequests_androidKt.target(builder, imageView);
                    builder.decoderFactory = new RemoteImageComponentKt$$ExternalSyntheticLambda7(remoteImage, i2);
                    build.enqueue(builder.build());
                } else {
                    imageView.setImageResource(i3);
                }
                imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                imageView.setAdjustViewBounds(true);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ Media3MuxerImpl$$ExternalSyntheticLambda1(int i, Object obj, Object obj2, MutableState mutableState, int i2) {
        this.$r8$classId = i2;
        this.f$1 = i;
        this.f$0 = obj;
        this.f$2 = obj2;
        this.f$3 = mutableState;
    }

    public /* synthetic */ Media3MuxerImpl$$ExternalSyntheticLambda1(HuffmanTreeGroup huffmanTreeGroup, int i, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        this.$r8$classId = 0;
        this.f$0 = huffmanTreeGroup;
        this.f$1 = i;
        this.f$2 = byteBuffer;
        this.f$3 = bufferInfo;
    }
}
