package bo.app;

import android.animation.ValueAnimator;
import android.content.ClipData;
import android.content.res.Resources;
import android.os.SystemClock;
import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.ui.autofill.ContentType;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.graphics.AndroidImageBitmap;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.local.viewmodels.pos.LocalPosBrandOnboardingViewModel;
import app.cash.redwood.treehouse.TreehouseLayout;
import app.cash.redwood.ui.Density;
import app.cash.redwood.ui.DensityKt;
import app.cash.redwood.ui.Margin;
import app.cash.redwood.ui.UiConfiguration;
import app.cash.sqldelight.driver.android.AndroidCursor;
import app.cash.sqldelight.driver.android.AndroidStatement;
import app.cash.zipline.CallResult;
import app.cash.zipline.internal.bridge.ArgsListSerializer;
import app.cash.zipline.internal.bridge.CallsKt;
import app.cash.zipline.internal.bridge.Endpoint;
import app.cash.zipline.internal.bridge.LongSerializer;
import app.cash.zipline.internal.bridge.PassByReference;
import app.cash.zipline.internal.bridge.ThrowableSerializer;
import app.cash.zipline.loader.internal.cache.FilesQueries;
import app.cash.zipline.loader.internal.cache.PinsQueries;
import coil3.compose.UtilsKt$$ExternalSyntheticLambda1;
import coil3.disk.DiskLruCache;
import com.braze.BrazeUser;
import com.braze.enums.Gender;
import com.braze.ui.UserJavascriptInterfaceBase;
import com.braze.ui.actions.brazeactions.steps.RemoveFromCustomAttributeArrayStep;
import com.braze.ui.actions.brazeactions.steps.StepData;
import com.fillr.browsersdk.utilities.Obfuscator;
import com.google.android.gms.maps.model.Marker;
import com.google.firebase.heartbeatinfo.HeartBeatInfoStorage;
import com.google.maps.android.compose.MapApplier;
import com.google.maps.android.compose.MapNode;
import com.google.maps.android.compose.MarkerNode;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.google.mlkit.vision.barcode.common.internal.BarcodeSource;
import com.mikepenz.markdown.compose.extendedspans.ExtendedSpans;
import com.mikepenz.markdown.compose.extendedspans.RoundedCornerSpanPainter;
import com.mikepenz.markdown.compose.extendedspans.RoundedCornerSpanPainter$$ExternalSyntheticLambda0;
import com.squareup.cardcustomizations.signature.Signature;
import com.squareup.cardcustomizations.signature.SignatureState;
import com.squareup.cardcustomizations.stampview.PatternStampState;
import com.squareup.cardcustomizations.stampview.StampState;
import com.squareup.cash.account.presenters.ProfileUpsellPresenter;
import com.squareup.cash.account.settings.viewmodels.ProfileUpsellViewEvent$UpsellRowClicked;
import com.squareup.cash.arcade.components.CopyCodeState;
import com.squareup.cash.cdf.personalprofile.PersonalProfileTapUpsell;
import com.squareup.cash.cdf.personalprofile.PersonalProfileViewOpenScreen;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.family.applets.views.FamilyAppletTile;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.money.applets.common.viewmodels.PromotedAppletTileViewEvent$Click;
import com.squareup.cash.offers.db.OffersHomeQueries$ForIdQuery;
import com.squareup.cash.overlays.OverlayKt;
import com.squareup.cash.tax.applet.views.TaxesAppletViewsModule$$ExternalSyntheticLambda1;
import com.squareup.protos.franklin.ui.ReceiptSection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;
import kotlinx.serialization.descriptors.ContextDescriptor;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.modules.SerializersModule;
import kotlinx.serialization.modules.SerializersModuleBuilder;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.asn1.cmc.BodyPartID;
import timber.log.Timber;

/* loaded from: classes3.dex */
public final /* synthetic */ class xg$$ExternalSyntheticLambda9 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ xg$$ExternalSyntheticLambda9(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x02bc  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        Insets insets;
        Unit gender$lambda$1;
        Unit run$lambda$0;
        Object obj2;
        List list;
        Color color;
        int i;
        int i2;
        long j;
        int i3;
        int i4;
        long j2;
        List list2;
        int size;
        int i5;
        int i6 = this.$r8$classId;
        int i7 = 8;
        long j3 = BodyPartID.bodyIdMax;
        char c = ' ';
        Color color2 = null;
        Object obj3 = this.f$0;
        switch (i6) {
            case 0:
                break;
            case 1:
                ((AnimatedContentTransitionScopeImpl) obj).getClass();
                if (!(((LocalPosBrandOnboardingViewModel) obj3) instanceof LocalPosBrandOnboardingViewModel.LegalConsentModel)) {
                    break;
                } else {
                    break;
                }
            case 2:
                CallResult callResult = (CallResult) obj3;
                List list3 = (List) obj;
                list3.getClass();
                Barcode barcode = (Barcode) CollectionsKt.firstOrNull(list3);
                if (barcode != null) {
                    BarcodeSource barcodeSource = barcode.zza;
                    if (barcodeSource.getValueType() == 8) {
                        UtilsKt$$ExternalSyntheticLambda1 utilsKt$$ExternalSyntheticLambda1 = (UtilsKt$$ExternalSyntheticLambda1) callResult.result;
                        Obfuscator url = barcodeSource.getUrl();
                        url.getClass();
                        String str = url.salt;
                        str.getClass();
                        utilsKt$$ExternalSyntheticLambda1.invoke(str);
                    } else {
                        Timber.Forest.d("Detected a barcode but this is not a url: " + barcodeSource.getValueType() + ":" + barcodeSource.getRawValue(), new Object[0]);
                    }
                }
                break;
            case 3:
                TreehouseLayout treehouseLayout = (TreehouseLayout) obj3;
                WindowInsetsCompat windowInsetsCompat = (WindowInsetsCompat) obj;
                StateFlowImpl stateFlowImpl = treehouseLayout.mutableUiConfiguration;
                if (windowInsetsCompat == null) {
                    insets = Insets.NONE;
                } else {
                    insets = windowInsetsCompat.mImpl.getInsets(655);
                    insets.getClass();
                }
                Resources resources = treehouseLayout.getResources();
                resources.getClass();
                double Density = DensityKt.Density(resources);
                UiConfiguration computeUiConfiguration$default = TreehouseLayout.computeUiConfiguration$default(treehouseLayout, null, new Margin(Density.m1400toDpHt74L4(insets.left, Density), Density.m1400toDpHt74L4(insets.right, Density), Density.m1400toDpHt74L4(insets.top, Density), Density.m1400toDpHt74L4(insets.bottom, Density)), 1);
                stateFlowImpl.getClass();
                stateFlowImpl.updateState(null, computeUiConfiguration$default);
                break;
            case 4:
                AndroidCursor androidCursor = (AndroidCursor) obj;
                androidCursor.getClass();
                break;
            case 5:
                Endpoint endpoint = (Endpoint) obj3;
                JsonBuilder jsonBuilder = (JsonBuilder) obj;
                jsonBuilder.getClass();
                jsonBuilder.useArrayPolymorphism = true;
                jsonBuilder.ignoreUnknownKeys = true;
                jsonBuilder.encodeDefaults = true;
                jsonBuilder.allowStructuredMapKeys = true;
                SerializersModuleBuilder serializersModuleBuilder = new SerializersModuleBuilder();
                ReflectionFactory reflectionFactory = Reflection.factory;
                serializersModuleBuilder.contextual(reflectionFactory.getOrCreateKotlinClass(PassByReference.class), new ArgsListSerializer(endpoint, 1));
                serializersModuleBuilder.contextual(reflectionFactory.getOrCreateKotlinClass(Throwable.class), ThrowableSerializer.INSTANCE);
                serializersModuleBuilder.contextual(reflectionFactory.getOrCreateKotlinClass(Long.TYPE), LongSerializer.INSTANCE);
                serializersModuleBuilder.contextual(reflectionFactory.getOrCreateKotlinClass(Flow.class), new yf$$ExternalSyntheticLambda10(i7));
                serializersModuleBuilder.contextual(reflectionFactory.getOrCreateKotlinClass(StateFlow.class), new yf$$ExternalSyntheticLambda10(9));
                SerializersModule serializersModule = endpoint.userSerializersModule;
                serializersModule.getClass();
                serializersModule.dumpTo(serializersModuleBuilder);
                jsonBuilder.serializersModule = serializersModuleBuilder.build();
                break;
            case 6:
                ClassSerialDescriptorBuilder classSerialDescriptorBuilder = (ClassSerialDescriptorBuilder) obj;
                classSerialDescriptorBuilder.getClass();
                ContextDescriptor contextDescriptor = CallsKt.cancelCallbackSerializer.descriptor;
                EmptyList emptyList = EmptyList.INSTANCE;
                classSerialDescriptorBuilder.element("cancelCallback", contextDescriptor, emptyList, false);
                classSerialDescriptorBuilder.element("failure", ThrowableSerializer.descriptor, emptyList, false);
                classSerialDescriptorBuilder.element("success", ((KSerializer) ((ArgsListSerializer) obj3).serializers).getDescriptor(), emptyList, false);
                break;
            case 7:
                AndroidStatement androidStatement = (AndroidStatement) obj;
                androidStatement.getClass();
                androidStatement.bindLong(0, Long.valueOf(((OffersHomeQueries$ForIdQuery) obj3).id));
                break;
            case 8:
                AndroidStatement androidStatement2 = (AndroidStatement) obj;
                androidStatement2.getClass();
                androidStatement2.bindString(0, ((FilesQueries.GetQuery) obj3).sha256_hex);
                break;
            case 9:
                PinsQueries.Get_pinQuery get_pinQuery = (PinsQueries.Get_pinQuery) obj3;
                AndroidStatement androidStatement3 = (AndroidStatement) obj;
                androidStatement3.getClass();
                androidStatement3.bindString(0, (String) get_pinQuery.application_name);
                androidStatement3.bindLong(1, Long.valueOf(get_pinQuery.file_id));
                break;
            case 10:
                AndroidStatement androidStatement4 = (AndroidStatement) obj;
                androidStatement4.getClass();
                androidStatement4.bindString(0, ((FilesQueries.GetQuery) obj3).sha256_hex);
                break;
            case 11:
                PinsQueries.Get_pinQuery get_pinQuery2 = (PinsQueries.Get_pinQuery) obj3;
                AndroidStatement androidStatement5 = (AndroidStatement) obj;
                androidStatement5.getClass();
                androidStatement5.bindLong(0, Long.valueOf(get_pinQuery2.file_id));
                androidStatement5.bindString(1, (String) get_pinQuery2.application_name);
                break;
            case 12:
                ((DiskLruCache) obj3).hasJournalErrors = true;
                break;
            case 13:
                break;
            case 14:
                Ref$IntRef ref$IntRef = (Ref$IntRef) obj3;
                int i8 = ref$IntRef.element;
                ref$IntRef.element = i8 + 1;
                break;
            case 15:
                gender$lambda$1 = UserJavascriptInterfaceBase.setGender$lambda$1((Gender) obj3, (BrazeUser) obj);
                break;
            case 16:
                run$lambda$0 = RemoveFromCustomAttributeArrayStep.run$lambda$0((StepData) obj3, (BrazeUser) obj);
                break;
            case 17:
                HeartBeatInfoStorage heartBeatInfoStorage = (HeartBeatInfoStorage) obj3;
                MutablePreferences mutablePreferences = (MutablePreferences) obj;
                Preferences.Key key = HeartBeatInfoStorage.HEART_BEAT_COUNT_TAG;
                Iterator it = mutablePreferences.asMap().entrySet().iterator();
                long j4 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        if (j4 != 0) {
                            mutablePreferences.set(key, Long.valueOf(j4));
                            break;
                        } else {
                            mutablePreferences.remove(key);
                            break;
                        }
                    } else {
                        Map.Entry entry = (Map.Entry) it.next();
                        if (entry.getValue() instanceof Set) {
                            Preferences.Key key2 = (Preferences.Key) entry.getKey();
                            Set set = (Set) entry.getValue();
                            String formattedDate = heartBeatInfoStorage.getFormattedDate(System.currentTimeMillis());
                            if (set.contains(formattedDate)) {
                                Object[] objArr = {formattedDate};
                                HashSet hashSet = new HashSet(1);
                                Object obj4 = objArr[0];
                                Objects.requireNonNull(obj4);
                                if (!hashSet.add(obj4)) {
                                    a$$ExternalSyntheticBUOutline0.m$3(Boxes$$ExternalSyntheticOutline1.m("duplicate element: ", obj4));
                                    break;
                                } else {
                                    mutablePreferences.set(key2, Collections.unmodifiableSet(hashSet));
                                    j4++;
                                }
                            } else {
                                mutablePreferences.remove(key2);
                            }
                        }
                    }
                }
            case 18:
                Marker marker = (Marker) obj;
                marker.getClass();
                Iterator it2 = ((MapApplier) obj3).decorations.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        Object next = it2.next();
                        MapNode mapNode = (MapNode) next;
                        if ((mapNode instanceof MarkerNode) && ((MarkerNode) mapNode).marker.equals(marker)) {
                            obj2 = next;
                        }
                    } else {
                        obj2 = null;
                    }
                }
                break;
            case 19:
                ((DisposableEffectScope) obj).getClass();
                break;
            case 20:
                DrawScope drawScope = (DrawScope) obj;
                drawScope.getClass();
                List list4 = ((ExtendedSpans) obj3).drawInstructions;
                int size2 = list4.size();
                int i9 = 0;
                while (i9 < size2) {
                    RoundedCornerSpanPainter$$ExternalSyntheticLambda0 roundedCornerSpanPainter$$ExternalSyntheticLambda0 = (RoundedCornerSpanPainter$$ExternalSyntheticLambda0) list4.get(i9);
                    RoundedCornerSpanPainter roundedCornerSpanPainter = roundedCornerSpanPainter$$ExternalSyntheticLambda0.f$0;
                    List list5 = roundedCornerSpanPainter$$ExternalSyntheticLambda0.f$1;
                    TextLayoutResult textLayoutResult = roundedCornerSpanPainter$$ExternalSyntheticLambda0.f$2;
                    long j5 = roundedCornerSpanPainter.cornerRadius;
                    AndroidPath androidPath = roundedCornerSpanPainter.path;
                    long j6 = j3;
                    RoundedCornerSpanPainter.TextPaddingValues textPaddingValues = roundedCornerSpanPainter.padding;
                    float mo235toPxR2X_6o = drawScope.mo235toPxR2X_6o(j5);
                    char c2 = c;
                    Color color3 = color2;
                    long floatToRawIntBits = (Float.floatToRawIntBits(mo235toPxR2X_6o) & j6) | (Float.floatToRawIntBits(mo235toPxR2X_6o) << c2);
                    int size3 = list5.size();
                    int i10 = 0;
                    while (i10 < size3) {
                        Color color4 = color3;
                        AnnotatedString.Range range = (AnnotatedString.Range) list5.get(i10);
                        String str2 = (String) range.item;
                        str2.getClass();
                        if (str2.equals("null")) {
                            list = list4;
                            color = color4;
                        } else {
                            list = list4;
                            color = new Color(ColorKt.Color(Integer.parseInt(str2)));
                        }
                        color.getClass();
                        long j7 = color.value;
                        int i11 = range.start;
                        int i12 = range.end;
                        textLayoutResult.getClass();
                        if (i11 == i12) {
                            list2 = EmptyList.INSTANCE;
                            i = size2;
                            i2 = i9;
                            j = floatToRawIntBits;
                            i3 = size3;
                        } else {
                            i = size2;
                            MultiParagraph multiParagraph = textLayoutResult.multiParagraph;
                            i2 = i9;
                            int lineForOffset = multiParagraph.getLineForOffset(i11);
                            j = floatToRawIntBits;
                            int lineForOffset2 = multiParagraph.getLineForOffset(i12);
                            if (lineForOffset == lineForOffset2 || textLayoutResult.getLineStart(lineForOffset) != i11) {
                                i3 = size3;
                            } else {
                                i3 = size3;
                                if (multiParagraph.getLineEnd(lineForOffset2, true) == i12) {
                                    list2 = CollectionsKt__CollectionsJVMKt.listOf(new Rect(RecyclerView.DECELERATION_RATE, multiParagraph.getLineTop(lineForOffset), (int) (textLayoutResult.size >> c2), multiParagraph.getLineBottom(lineForOffset2)));
                                }
                            }
                            boolean z = multiParagraph.getParagraphDirection(StringsKt.getLastIndex(textLayoutResult.layoutInput.text)) == ResolvedTextDirection.Ltr;
                            i4 = i10;
                            ArrayList arrayList = new ArrayList((lineForOffset2 - lineForOffset) + 1);
                            if (lineForOffset <= lineForOffset2) {
                                int i13 = lineForOffset;
                                j2 = j7;
                                while (true) {
                                    int i14 = i11;
                                    MultiParagraph multiParagraph2 = multiParagraph;
                                    int i15 = lineForOffset;
                                    arrayList.add(new Rect(i13 == lineForOffset ? textLayoutResult.getHorizontalPosition(i11, z) : textLayoutResult.getLineLeft(i13), multiParagraph.getLineTop(i13), i13 == lineForOffset2 ? textLayoutResult.getHorizontalPosition(i12, z) : textLayoutResult.getLineRight(i13), multiParagraph.getLineBottom(i13)));
                                    if (i13 != lineForOffset2) {
                                        i13++;
                                        lineForOffset = i15;
                                        i11 = i14;
                                        multiParagraph = multiParagraph2;
                                    }
                                }
                            } else {
                                j2 = j7;
                            }
                            list2 = arrayList;
                            size = list2.size();
                            i5 = 0;
                            while (i5 < size) {
                                Rect rect = (Rect) list2.get(i5);
                                androidPath.rewind();
                                float f = rect.left;
                                long j8 = textPaddingValues.horizontal;
                                long j9 = textPaddingValues.vertical;
                                AndroidPath.addRoundRect$default(androidPath, new RoundRect(f - drawScope.mo235toPxR2X_6o(j8), drawScope.mo235toPxR2X_6o(roundedCornerSpanPainter.topMargin) + (rect.top - drawScope.mo235toPxR2X_6o(j9)), drawScope.mo235toPxR2X_6o(textPaddingValues.horizontal) + rect.right, (drawScope.mo235toPxR2X_6o(j9) + rect.bottom) - drawScope.mo235toPxR2X_6o(roundedCornerSpanPainter.bottomMargin), i5 == 0 ? j : 0L, i5 == list2.size() + (-1) ? j : 0L, i5 == list2.size() + (-1) ? j : 0L, i5 == 0 ? j : 0L));
                                RoundedCornerSpanPainter roundedCornerSpanPainter2 = roundedCornerSpanPainter;
                                List list6 = list5;
                                AndroidPath androidPath2 = androidPath;
                                long j10 = j2;
                                DrawScope.m745drawPathLG529CI$default(drawScope, androidPath2, j10, RecyclerView.DECELERATION_RATE, Fill.INSTANCE, 52);
                                i5++;
                                j2 = j10;
                                list5 = list6;
                                androidPath = androidPath2;
                                roundedCornerSpanPainter = roundedCornerSpanPainter2;
                            }
                            i10 = i4 + 1;
                            color3 = color4;
                            list4 = list;
                            size2 = i;
                            i9 = i2;
                            size3 = i3;
                            roundedCornerSpanPainter = roundedCornerSpanPainter;
                            floatToRawIntBits = j;
                        }
                        i4 = i10;
                        j2 = j7;
                        size = list2.size();
                        i5 = 0;
                        while (i5 < size) {
                        }
                        i10 = i4 + 1;
                        color3 = color4;
                        list4 = list;
                        size2 = i;
                        i9 = i2;
                        size3 = i3;
                        roundedCornerSpanPainter = roundedCornerSpanPainter;
                        floatToRawIntBits = j;
                    }
                    i9++;
                    color2 = color3;
                    j3 = j6;
                    c = c2;
                }
                break;
            case 21:
                SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver.getClass();
                SemanticsPropertiesKt.setContentType(semanticsPropertyReceiver, (ContentType) obj3);
                break;
            case 22:
                SignatureState signatureState = (SignatureState) obj3;
                Offset offset = (Offset) obj;
                Signature signature$customizations = signatureState.getSignature$customizations();
                if (signature$customizations != null) {
                    signature$customizations.extendGlyph(Float.intBitsToFloat((int) (signatureState.m2966getSignatureOffsetF1C5BW0$customizations() >> 32)) + Float.intBitsToFloat((int) (offset.packedValue >> 32)), Float.intBitsToFloat((int) (signatureState.m2966getSignatureOffsetF1C5BW0$customizations() & BodyPartID.bodyIdMax)) + Float.intBitsToFloat((int) (offset.packedValue & BodyPartID.bodyIdMax)), SystemClock.uptimeMillis());
                }
                signatureState.setInvalidate$customizations(signatureState.getInvalidate$customizations() + 1);
                break;
            case 23:
                PatternStampState patternStampState = (PatternStampState) obj3;
                ((ValueAnimator) obj).getClass();
                patternStampState.invalidate$delegate.setValue(Integer.valueOf(patternStampState.getInvalidate$customizations() + 1));
                break;
            case 24:
                StampState stampState = (StampState) obj3;
                ((ValueAnimator) obj).getClass();
                stampState.invalidate$delegate.setValue(Integer.valueOf(stampState.getInvalidate$customizations() + 1));
                break;
            case 25:
                DrawScope drawScope2 = (DrawScope) obj;
                drawScope2.getClass();
                DrawScope.m739drawImageAZ2fEMs$default(drawScope2, (AndroidImageBitmap) obj3, 0L, 0L, (((int) Math.ceil(Float.intBitsToFloat((int) (drawScope2.mo753getSizeNHjbRc() >> 32)))) << 32) | (((int) Math.ceil((Float.intBitsToFloat((int) (drawScope2.mo753getSizeNHjbRc() >> 32)) / r2.bitmap.getWidth()) * r2.bitmap.getHeight())) & BodyPartID.bodyIdMax), RecyclerView.DECELERATION_RATE, null, 0, 0, IptcConstants.IMAGE_RESOURCE_BLOCK_ALPHA_CHANNELS_NAMES);
                break;
            case 26:
                ProfileUpsellPresenter profileUpsellPresenter = (ProfileUpsellPresenter) obj3;
                ProfileUpsellViewEvent$UpsellRowClicked profileUpsellViewEvent$UpsellRowClicked = (ProfileUpsellViewEvent$UpsellRowClicked) obj;
                profileUpsellViewEvent$UpsellRowClicked.getClass();
                String str3 = profileUpsellViewEvent$UpsellRowClicked.clientRouteUrl;
                String str4 = profileUpsellViewEvent$UpsellRowClicked.upsellType;
                Analytics analytics = profileUpsellPresenter.analytics;
                analytics.track(new PersonalProfileViewOpenScreen(PersonalProfileViewOpenScreen.PersonalProfileSubScreen.PROFILE_UPSELL, null), null);
                analytics.track(new PersonalProfileTapUpsell(str3, str4), null);
                profileUpsellPresenter.router.route(new RoutingParams(null, null, profileUpsellPresenter.parentScreen, null, null, null, 503), str3);
                break;
            case 27:
                ((DisposableEffectScope) obj).getClass();
                break;
            case 28:
                CopyCodeState copyCodeState = (CopyCodeState) obj;
                copyCodeState.getClass();
                String str5 = ((ReceiptSection.DetailRow) obj3).copyable_body;
                str5.getClass();
                copyCodeState.clipboardManager.getClipboardManager().setPrimaryClip(ClipData.newPlainText("plain text", OverlayKt.convertToCharSequence(new AnnotatedString(str5))));
                break;
            default:
                ((PromotedAppletTileViewEvent$Click) obj).getClass();
                ((TaxesAppletViewsModule$$ExternalSyntheticLambda1) ((FamilyAppletTile) obj3).imageLoader).invoke();
                break;
        }
        return Unit.INSTANCE;
    }
}
