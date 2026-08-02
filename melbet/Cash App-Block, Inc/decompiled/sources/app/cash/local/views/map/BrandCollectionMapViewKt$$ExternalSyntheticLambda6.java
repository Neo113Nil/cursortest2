package app.cash.local.views.map;

import android.graphics.Matrix;
import android.graphics.RectF;
import androidx.camera.video.internal.muxer.Media3MuxerImpl$$ExternalSyntheticLambda1;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.local.viewmodels.map.BrandCollectionMapViewModel;
import app.cash.local.viewmodels.wallet.BrandCollectionModel;
import coil3.compose.UtilsKt$$ExternalSyntheticLambda1;
import com.squareup.cardcustomizations.stampview.PatternStampState;
import com.squareup.cardcustomizations.stampview.StampMovingListener;
import com.squareup.cardcustomizations.stampview.StampState;
import com.squareup.cardcustomizations.stampview.TransformedStamp;
import com.squareup.cash.formview.components.arcade.ArcadeFormEmojiPicker;
import com.squareup.cash.maps.viewmodels.MarkerLocation;
import com.squareup.protos.franklin.api.FormBlocker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function5;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes3.dex */
public final /* synthetic */ class BrandCollectionMapViewKt$$ExternalSyntheticLambda6 implements Function5 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ BrandCollectionMapViewKt$$ExternalSyntheticLambda6(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override // kotlin.jvm.functions.Function5
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        List list;
        int i;
        int i2 = this.$r8$classId;
        Object obj6 = Composer.Companion.Empty;
        Object obj7 = this.f$1;
        Object obj8 = this.f$0;
        switch (i2) {
            case 0:
                BrandCollectionMapViewModel brandCollectionMapViewModel = (BrandCollectionMapViewModel) obj8;
                Function1 function1 = (Function1) obj7;
                Modifier modifier = (Modifier) obj;
                List list2 = (List) obj2;
                Function0 function0 = (Function0) obj3;
                Composer composer = (Composer) obj4;
                int intValue = ((Integer) obj5).intValue();
                modifier.getClass();
                list2.getClass();
                function0.getClass();
                List list3 = list2;
                ArrayList arrayList = new ArrayList();
                Iterator it = list3.iterator();
                while (it.hasNext()) {
                    String token = ((MarkerLocation) it.next()).getToken();
                    if (token != null) {
                        arrayList.add(token);
                    }
                }
                BrandCollectionMapViewModel.Sheet sheet = brandCollectionMapViewModel.sheet;
                ArrayList arrayList2 = null;
                BrandCollectionMapViewModel.Sheet.BrandCollection brandCollection = sheet instanceof BrandCollectionMapViewModel.Sheet.BrandCollection ? (BrandCollectionMapViewModel.Sheet.BrandCollection) sheet : null;
                if (brandCollection != null && (list = brandCollection.model.locations) != null) {
                    arrayList2 = new ArrayList();
                    for (Object obj9 : list) {
                        if (CollectionsKt.contains(arrayList, ((BrandCollectionModel.Location) obj9).clientRoute)) {
                            arrayList2.add(obj9);
                        }
                    }
                }
                if (arrayList2 == null) {
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj10 : list3) {
                        if (obj10 instanceof BrandCollectionMapViewModel.Location) {
                            arrayList3.add(obj10);
                        }
                    }
                    arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList3, 10));
                    Iterator it2 = arrayList3.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(((BrandCollectionMapViewModel.Location) it2.next()).sheetLocation);
                    }
                }
                GapComposer gapComposer = (GapComposer) composer;
                boolean changed = gapComposer.changed(function1);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changed || rememberedValue == obj6) {
                    rememberedValue = new UtilsKt$$ExternalSyntheticLambda1(2, function1);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                BrandCollectionMapViewKt.MultipleLocationsSelectorSheetContent((intValue & 14) | ((intValue << 3) & 7168), gapComposer, modifier, arrayList2, function0, (Function1) rememberedValue);
                break;
            case 1:
                long j = BodyPartID.bodyIdMax;
                PatternStampState patternStampState = (PatternStampState) obj8;
                StampMovingListener stampMovingListener = (StampMovingListener) obj7;
                float floatValue = ((Float) obj2).floatValue();
                float floatValue2 = ((Float) obj3).floatValue();
                int intValue2 = ((Integer) obj5).intValue();
                long j2 = ((Offset) obj).packedValue;
                long j3 = ((Offset) obj4).packedValue;
                for (TransformedStamp transformedStamp : patternStampState.getMovingStamps()) {
                    Matrix matrix = transformedStamp.transform;
                    Matrix matrix2 = transformedStamp.persistedTransform;
                    int i3 = (int) (j2 >> 32);
                    long j4 = j3;
                    int i4 = (int) (j2 & j);
                    matrix.postTranslate(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4));
                    matrix2.postTranslate(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4));
                    int i5 = (int) (j4 >> 32);
                    long j5 = j;
                    int i6 = (int) (j4 & j5);
                    if (((RectF) patternStampState.stampSaveArea$delegate.getValue()).contains(Float.intBitsToFloat(i5), Float.intBitsToFloat(i6)) || intValue2 > 1) {
                        if (!matrix.equals(matrix2)) {
                            if (stampMovingListener != null) {
                                stampMovingListener.onStampMovedOntoCard();
                            }
                            matrix.set(matrix2);
                        }
                        matrix.postScale(floatValue, floatValue, transformedStamp.bounds().centerX(), transformedStamp.bounds().centerY());
                        matrix.postRotate(floatValue2, transformedStamp.bounds().centerX(), transformedStamp.bounds().centerY());
                        matrix2.set(matrix);
                    } else {
                        if (((Boolean) patternStampState.hasTrashBin$delegate.getValue()).booleanValue()) {
                            matrix2.set(matrix);
                        } else {
                            float height = transformedStamp.minHeight / transformedStamp.bounds().height();
                            matrix.postScale(height, height, Float.intBitsToFloat(i5), Float.intBitsToFloat(i6));
                            matrix.postTranslate(Float.intBitsToFloat(i5) - transformedStamp.bounds().centerX(), Float.intBitsToFloat(i6) - transformedStamp.bounds().bottom);
                        }
                        if (stampMovingListener != null) {
                            stampMovingListener.onStampMovedOffCard();
                        }
                    }
                    j3 = j4;
                    j = j5;
                }
                long j6 = j;
                if (patternStampState.trashBinDirectionResolved || Offset.m622equalsimpl0(j2, 0L)) {
                    i = 1;
                } else {
                    patternStampState.trashBinAtTop$delegate.setValue(Boolean.valueOf(Float.intBitsToFloat((int) (j2 & j6)) < RecyclerView.DECELERATION_RATE));
                    i = 1;
                    patternStampState.trashBinDirectionResolved = true;
                }
                patternStampState.invalidate$delegate.setValue(Integer.valueOf(patternStampState.getInvalidate$customizations() + i));
                break;
            case 2:
                StampState stampState = (StampState) obj8;
                StampMovingListener stampMovingListener2 = (StampMovingListener) obj7;
                float floatValue3 = ((Float) obj2).floatValue();
                float floatValue4 = ((Float) obj3).floatValue();
                int intValue3 = ((Integer) obj5).intValue();
                long j7 = ((Offset) obj).packedValue;
                long j8 = ((Offset) obj4).packedValue;
                TransformedStamp movingStamp = stampState.getMovingStamp();
                if (movingStamp != null) {
                    Matrix matrix3 = movingStamp.persistedTransform;
                    Matrix matrix4 = movingStamp.transform;
                    int i7 = (int) (j7 >> 32);
                    float intBitsToFloat = Float.intBitsToFloat(i7);
                    int i8 = (int) (j7 & BodyPartID.bodyIdMax);
                    matrix4.postTranslate(intBitsToFloat, Float.intBitsToFloat(i8));
                    matrix3.postTranslate(Float.intBitsToFloat(i7), Float.intBitsToFloat(i8));
                    if (!stampState.trashBinDirectionResolved && !Offset.m622equalsimpl0(j7, 0L)) {
                        stampState.trashBinAtTop$delegate.setValue(Boolean.valueOf(Float.intBitsToFloat(i8) < RecyclerView.DECELERATION_RATE));
                        stampState.trashBinDirectionResolved = true;
                    }
                    RectF rectF = (RectF) stampState.stampSaveArea$delegate.getValue();
                    int i9 = (int) (j8 >> 32);
                    float intBitsToFloat2 = Float.intBitsToFloat(i9);
                    int i10 = (int) (j8 & BodyPartID.bodyIdMax);
                    if (rectF.contains(intBitsToFloat2, Float.intBitsToFloat(i10)) || intValue3 > 1) {
                        if (!matrix4.equals(matrix3)) {
                            if (stampMovingListener2 != null) {
                                stampMovingListener2.onStampMovedOntoCard();
                            }
                            matrix4.set(matrix3);
                        }
                        matrix4.postScale(floatValue3, floatValue3, movingStamp.bounds().centerX(), movingStamp.bounds().centerY());
                        matrix4.postRotate(floatValue4, movingStamp.bounds().centerX(), movingStamp.bounds().centerY());
                        matrix3.set(matrix4);
                    } else {
                        if (((Boolean) stampState.hasTrashBin$delegate.getValue()).booleanValue()) {
                            matrix3.set(matrix4);
                        } else {
                            float height2 = movingStamp.minHeight / movingStamp.bounds().height();
                            matrix4.postScale(height2, height2, Float.intBitsToFloat(i9), Float.intBitsToFloat(i10));
                            matrix4.postTranslate(Float.intBitsToFloat(i9) - movingStamp.bounds().centerX(), Float.intBitsToFloat(i10) - movingStamp.bounds().bottom);
                        }
                        if (stampMovingListener2 != null) {
                            stampMovingListener2.onStampMovedOffCard();
                        }
                    }
                    stampState.invalidate$delegate.setValue(Integer.valueOf(stampState.getInvalidate$customizations() + 1));
                }
                break;
            default:
                ArcadeFormEmojiPicker arcadeFormEmojiPicker = (ArcadeFormEmojiPicker) obj8;
                MutableState mutableState = (MutableState) obj7;
                RowScope rowScope = (RowScope) obj;
                int intValue4 = ((Integer) obj2).intValue();
                FormBlocker.Element.EmojiPickerElement.EmojiCategory emojiCategory = (FormBlocker.Element.EmojiPickerElement.EmojiCategory) obj3;
                Composer composer2 = (Composer) obj4;
                int intValue5 = ((Integer) obj5).intValue();
                rowScope.getClass();
                emojiCategory.getClass();
                FormBlocker.Element.EmojiPickerElement.EmojiCategory.EmojiOption emojiOption = (FormBlocker.Element.EmojiPickerElement.EmojiCategory.EmojiOption) CollectionsKt.first((List) emojiCategory.emojiOptions);
                Integer num = (Integer) mutableState.getValue();
                boolean z = num != null && intValue4 == num.intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                boolean changed2 = gapComposer2.changed(mutableState) | ((((intValue5 & 112) ^ 48) > 32 && gapComposer2.changed(intValue4)) || (intValue5 & 48) == 32) | gapComposer2.changedInstance(arcadeFormEmojiPicker) | gapComposer2.changedInstance(emojiOption);
                Object rememberedValue2 = gapComposer2.rememberedValue();
                if (changed2 || rememberedValue2 == obj6) {
                    rememberedValue2 = new Media3MuxerImpl$$ExternalSyntheticLambda1(intValue4, arcadeFormEmojiPicker, emojiOption, mutableState, 2);
                    gapComposer2.updateRememberedValue(rememberedValue2);
                }
                arcadeFormEmojiPicker.EmojiOptionItem(emojiOption, z, (Function0) rememberedValue2, rowScope.weight(1.0f, Modifier.Companion.$$INSTANCE, false), gapComposer2, 0);
                break;
        }
        return Unit.INSTANCE;
    }
}
