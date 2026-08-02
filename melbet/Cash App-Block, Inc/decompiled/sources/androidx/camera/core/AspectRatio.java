package androidx.camera.core;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.util.DisplayMetrics;
import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.activity.compose.ComposePredictiveBackHandler;
import androidx.activity.compose.LocalOnBackPressedDispatcherOwner;
import androidx.activity.compose.PredictiveBackHandlerInfo;
import androidx.activity.compose.internal.BackHandlerDispatcherCompat;
import androidx.camera.core.AspectRatio;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.ClickableKt$$ExternalSyntheticLambda0;
import androidx.compose.foundation.gestures.Draggable2DKt;
import androidx.compose.foundation.layout.WrapContentNode$$ExternalSyntheticLambda0;
import androidx.compose.foundation.lazy.LazyListState$$ExternalSyntheticLambda3;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.TextFieldStateKt;
import androidx.compose.material3.SliderKt$$ExternalSyntheticLambda5;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusOwnerImplKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.RulerKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.navigation.compose.DialogHostKt$$ExternalSyntheticLambda0;
import androidx.navigationevent.NavigationEventDispatcher;
import androidx.navigationevent.NavigationEventDispatcherOwner;
import androidx.navigationevent.compose.LocalNavigationEventDispatcherOwner;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.local.views.wallet.LocalHomeViewKt$$ExternalSyntheticLambda3;
import app.cash.redwood.CombinedModifier$$ExternalSyntheticLambda0;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.t7$$ExternalSyntheticLambda4;
import coil3.size.DimensionKt;
import com.squareup.cardcustomizations.signature.SavedSignature;
import com.squareup.cardcustomizations.signature.SignatureState;
import com.squareup.cardcustomizations.signature.SignatureStateListener;
import com.squareup.cardcustomizations.signature.SignaturesKt$$ExternalSyntheticLambda0;
import com.squareup.cardcustomizations.signature.SignaturesKt$$ExternalSyntheticLambda1;
import com.squareup.cardcustomizations.signature.SignaturesKt$PatternSignature$1$1;
import com.squareup.cardcustomizations.signature.SignaturesKt$Signature$1$1;
import com.squareup.cash.arcade.components.SearchBarKeyboardState;
import com.squareup.cash.arcade.components.SearchBarKt;
import com.squareup.cash.arcade.components.ShowNavigationBack;
import com.squareup.cash.invitations.InviteContactsBodyKt$$ExternalSyntheticLambda5;
import com.squareup.cash.music.views.MusicViewKt$LoadedMusicContent$1$1;
import com.squareup.cash.sheet.BasicShieetKt$$ExternalSyntheticLambda0;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes3.dex */
public abstract class AspectRatio {
    public static final void ContactInput(Modifier modifier, Function1 function1, Function1 function12, Function0 function0, String str, SearchBarKeyboardState searchBarKeyboardState, String str2, Composer composer, int i) {
        function1.getClass();
        str.getClass();
        searchBarKeyboardState.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1942531914);
        int i2 = i | (gapComposer.changed(modifier) ? 4 : 2) | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changedInstance(function12) ? 256 : 128) | (gapComposer.changedInstance(function0) ? 2048 : 1024) | (gapComposer.changed(str) ? 16384 : PKIFailureInfo.certRevoked) | (gapComposer.changed(searchBarKeyboardState) ? PKIFailureInfo.unsupportedVersion : 65536) | (gapComposer.changed(str2) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted);
        if (gapComposer.shouldExecute(i2 & 1, (599187 & i2) != 599186)) {
            TextFieldState m382rememberTextFieldStateLepunE = TextFieldStateKt.m382rememberTextFieldStateLepunE(str2, 0L, gapComposer, (i2 >> 18) & 14, 2);
            CharSequence charSequence = m382rememberTextFieldStateLepunE.getValue$foundation().text;
            boolean changed = ((i2 & 112) == 32) | gapComposer.changed(m382rememberTextFieldStateLepunE);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changed || rememberedValue == neverEqualPolicy) {
                rememberedValue = new MusicViewKt$LoadedMusicContent$1$1(function1, m382rememberTextFieldStateLepunE, (Continuation) null, 11);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Updater.LaunchedEffect(gapComposer, charSequence, (Function2) rememberedValue);
            boolean z = (i2 & 896) == 256;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new InviteContactsBodyKt$$ExternalSyntheticLambda5(29, function12);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            int i3 = i2 >> 9;
            SearchBarKt.SearchBar(m382rememberTextFieldStateLepunE, str, searchBarKeyboardState, FocusOwnerImplKt.onFocusChanged(modifier, (Function1) rememberedValue2), null, ShowNavigationBack.Never, null, null, null, function0, false, null, gapComposer, (i3 & 896) | (i3 & 112) | 196608 | ((i2 << 18) & 1879048192), 0, 7632);
            gapComposer = gapComposer;
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BasicShieetKt$$ExternalSyntheticLambda0(modifier, function1, function12, function0, str, searchBarKeyboardState, str2, i, 9);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PatternSignature(Modifier modifier, final int i, final int i2, final int i3, final float f, final float f2, final RoundedCornerShape roundedCornerShape, final SignatureStateListener signatureStateListener, SignatureState signatureState, Composer composer, final int i4) {
        Modifier modifier2;
        int i5;
        int i6;
        Object obj;
        Integer num;
        int i7;
        Integer num2;
        int i8;
        Object obj2;
        int i9;
        boolean changedInstance;
        Object rememberedValue;
        final SignatureState signatureState2 = signatureState;
        signatureState2.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(728433005);
        int i10 = i4 | (gapComposer.changed(modifier) ? 4 : 2) | (gapComposer.changed(i) ? 32 : 16) | (gapComposer.changed(i2) ? 256 : 128) | (gapComposer.changed(i3) ? 2048 : 1024) | (gapComposer.changed(f) ? 16384 : PKIFailureInfo.certRevoked) | (gapComposer.changed(f2) ? PKIFailureInfo.unsupportedVersion : 65536) | (gapComposer.changed(roundedCornerShape) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted) | (gapComposer.changed(signatureStateListener) ? 8388608 : 4194304) | (gapComposer.changedInstance(signatureState2) ? 67108864 : 33554432);
        if (gapComposer.shouldExecute(i10 & 1, (i10 & 38347923) != 38347922)) {
            gapComposer.startDefaults();
            if ((i4 & 1) != 0 && !gapComposer.getDefaultsInvalid()) {
                gapComposer.skipToGroupEnd();
            }
            gapComposer.endDefaults();
            final Density density = (Density) gapComposer.consume(CompositionLocalsKt.LocalDensity);
            Object rememberedValue2 = gapComposer.rememberedValue();
            Object obj3 = Composer.Companion.Empty;
            if (rememberedValue2 == obj3) {
                rememberedValue2 = Recorder$$ExternalSyntheticOutline2.m(i, gapComposer);
            }
            MutableFloatState mutableFloatState = (MutableFloatState) rememberedValue2;
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (rememberedValue3 == obj3) {
                rememberedValue3 = Recorder$$ExternalSyntheticOutline2.m(i2, gapComposer);
            }
            MutableFloatState mutableFloatState2 = (MutableFloatState) rememberedValue3;
            Integer valueOf = Integer.valueOf(i);
            Integer valueOf2 = Integer.valueOf(i2);
            int i11 = i10 & 112;
            int i12 = i10 & 896;
            boolean changedInstance2 = gapComposer.changedInstance(signatureState2) | (i11 == 32) | (i12 == 256);
            int i13 = i10 & 57344;
            boolean z = changedInstance2 | (i13 == 16384);
            int i14 = i10 & 7168;
            boolean z2 = (i14 == 2048) | z;
            Object rememberedValue4 = gapComposer.rememberedValue();
            if (z2 || rememberedValue4 == obj3) {
                i5 = i14;
                i6 = i12;
                obj = obj3;
                num = valueOf;
                i7 = i13;
                num2 = valueOf2;
                i8 = PKIFailureInfo.unsupportedVersion;
                Object signaturesKt$PatternSignature$1$1 = new SignaturesKt$PatternSignature$1$1(signatureState2, i2, i, f, i3, mutableFloatState, mutableFloatState2, null);
                signatureState2 = signatureState2;
                gapComposer.updateRememberedValue(signaturesKt$PatternSignature$1$1);
                rememberedValue4 = signaturesKt$PatternSignature$1$1;
            } else {
                i5 = i14;
                i6 = i12;
                obj = obj3;
                num = valueOf;
                i7 = i13;
                num2 = valueOf2;
                i8 = PKIFailureInfo.unsupportedVersion;
            }
            Updater.LaunchedEffect(num, num2, (Function2) rememberedValue4, gapComposer);
            boolean changedInstance3 = gapComposer.changedInstance(signatureState2) | ((i10 & 458752) == i8) | ((((i10 & 3670016) ^ 1572864) > 1048576 && gapComposer.changed(roundedCornerShape)) || (i10 & 1572864) == 1048576) | gapComposer.changed(density) | (i7 == 16384);
            int i15 = i5;
            int i16 = i6;
            boolean z3 = changedInstance3 | (i15 == 2048) | (i11 == 32) | (i16 == 256);
            Object rememberedValue5 = gapComposer.rememberedValue();
            if (z3) {
                obj2 = obj;
            } else {
                obj2 = obj;
                if (rememberedValue5 != obj2) {
                    i9 = i3;
                    modifier2 = modifier;
                    Modifier onPlaced = RulerKt.onPlaced(modifier2, (Function1) rememberedValue5);
                    if (((Boolean) signatureState2.isEnabled$delegate.getValue()).booleanValue()) {
                        gapComposer.startReplaceGroup(-1717294443);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(-1718875288);
                        Object rememberedValue6 = gapComposer.rememberedValue();
                        if (rememberedValue6 == obj2) {
                            rememberedValue6 = Updater.mutableStateOf$default(new Offset(0L));
                            gapComposer.updateRememberedValue(rememberedValue6);
                        }
                        final MutableState mutableState = (MutableState) rememberedValue6;
                        Integer valueOf3 = Integer.valueOf(i);
                        Integer valueOf4 = Integer.valueOf(i2);
                        boolean changedInstance4 = (i16 == 256) | (i11 == 32) | ((i10 & 29360128) == 8388608) | gapComposer.changedInstance(signatureState2);
                        Object rememberedValue7 = gapComposer.rememberedValue();
                        if (changedInstance4 || rememberedValue7 == obj2) {
                            Object obj4 = new PointerInputEventHandler() { // from class: com.squareup.cardcustomizations.signature.SignaturesKt$PatternSignature$2$1
                                @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                                public final Object invoke(PointerInputScope pointerInputScope, Continuation continuation) {
                                    int i17 = i2;
                                    int i18 = i;
                                    SignatureStateListener signatureStateListener2 = signatureStateListener;
                                    SignatureState signatureState3 = signatureState2;
                                    MutableState mutableState2 = mutableState;
                                    Object awaitEachGesture = Draggable2DKt.awaitEachGesture(pointerInputScope, new SignaturesKt$detectSignature$2(new WrapContentNode$$ExternalSyntheticLambda0(i17, i18, signatureStateListener2, signatureState3, mutableState2), new CombinedModifier$$ExternalSyntheticLambda0(10, signatureState3, mutableState2), new t7$$ExternalSyntheticLambda4(27, signatureStateListener2, signatureState3), null), continuation);
                                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                                    if (awaitEachGesture != coroutineSingletons) {
                                        awaitEachGesture = Unit.INSTANCE;
                                    }
                                    return awaitEachGesture == coroutineSingletons ? awaitEachGesture : Unit.INSTANCE;
                                }
                            };
                            gapComposer.updateRememberedValue(obj4);
                            rememberedValue7 = obj4;
                        }
                        onPlaced = SuspendingPointerInputFilterKt.pointerInput(onPlaced, valueOf3, valueOf4, (PointerInputEventHandler) rememberedValue7);
                        gapComposer.end(false);
                    }
                    changedInstance = gapComposer.changedInstance(signatureState2) | (i15 == 2048);
                    rememberedValue = gapComposer.rememberedValue();
                    if (!changedInstance || rememberedValue == obj2) {
                        rememberedValue = new LazyListState$$ExternalSyntheticLambda3(signatureState2, i9, 7);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    CanvasKt.Canvas(0, gapComposer, onPlaced, (Function1) rememberedValue);
                }
            }
            final SignatureState signatureState3 = signatureState2;
            rememberedValue5 = new Function1() { // from class: com.squareup.cardcustomizations.signature.SignaturesKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj5) {
                    LayoutCoordinates layoutCoordinates = (LayoutCoordinates) obj5;
                    layoutCoordinates.getClass();
                    SignatureState signatureState4 = SignatureState.this;
                    if (IntSize.m1055equalsimpl0(((IntSize) signatureState4.signatureSize$delegate.getValue()).packedValue, layoutCoordinates.mo838getSizeYbymL2g())) {
                        return Unit.INSTANCE;
                    }
                    signatureState4.signatureSize$delegate.setValue(new IntSize(layoutCoordinates.mo838getSizeYbymL2g()));
                    signatureState4.signatureOffset$delegate.setValue(new Offset(layoutCoordinates.mo843localToWindowMKHz9U(0L)));
                    AndroidPath clipPath$customizations = signatureState4.getClipPath$customizations();
                    clipPath$customizations.reset();
                    LayoutDirection layoutDirection = LayoutDirection.Ltr;
                    float mo838getSizeYbymL2g = (int) (layoutCoordinates.mo838getSizeYbymL2g() >> 32);
                    float f3 = f2;
                    float mo838getSizeYbymL2g2 = ((int) (layoutCoordinates.mo838getSizeYbymL2g() & BodyPartID.bodyIdMax)) - (2.0f * f3);
                    ColorKt.addOutline(clipPath$customizations, roundedCornerShape.mo175createOutlinePq9zytI((Float.floatToRawIntBits(mo838getSizeYbymL2g - r6) << 32) | (Float.floatToRawIntBits(mo838getSizeYbymL2g2) & BodyPartID.bodyIdMax), layoutDirection, density));
                    float intBitsToFloat = Float.intBitsToFloat((int) (signatureState4.m2966getSignatureOffsetF1C5BW0$customizations() >> 32)) + f3;
                    float intBitsToFloat2 = Float.intBitsToFloat((int) (signatureState4.m2966getSignatureOffsetF1C5BW0$customizations() & BodyPartID.bodyIdMax)) + f3;
                    clipPath$customizations.m667translatek4lQ0M((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & BodyPartID.bodyIdMax));
                    DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
                    long j = (displayMetrics.widthPixels << 32) | (displayMetrics.heightPixels & BodyPartID.bodyIdMax);
                    Signature signature = new Signature((int) (j >> 32), (int) (j & BodyPartID.bodyIdMax), f, i3, new SignaturesKt$sam$com_squareup_cardcustomizations_signature_Signature_PainterProvider$0(SignaturesKt$PatternSignature$canvasModifier$1$1$3.INSTANCE));
                    signature.isPatternEnabled = true;
                    signature.boxWidth = i;
                    signature.boxHeight = i2;
                    signatureState4.signature$delegate.setValue(signature);
                    return Unit.INSTANCE;
                }
            };
            signatureState2 = signatureState3;
            i9 = i3;
            gapComposer.updateRememberedValue(rememberedValue5);
            modifier2 = modifier;
            Modifier onPlaced2 = RulerKt.onPlaced(modifier2, (Function1) rememberedValue5);
            if (((Boolean) signatureState2.isEnabled$delegate.getValue()).booleanValue()) {
            }
            changedInstance = gapComposer.changedInstance(signatureState2) | (i15 == 2048);
            rememberedValue = gapComposer.rememberedValue();
            if (!changedInstance) {
            }
            rememberedValue = new LazyListState$$ExternalSyntheticLambda3(signatureState2, i9, 7);
            gapComposer.updateRememberedValue(rememberedValue);
            CanvasKt.Canvas(0, gapComposer, onPlaced2, (Function1) rememberedValue);
        } else {
            modifier2 = modifier;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            final SignatureState signatureState4 = signatureState2;
            final Modifier modifier3 = modifier2;
            endRestartGroup.block = new Function2(i, i2, i3, f, f2, roundedCornerShape, signatureStateListener, signatureState4, i4) { // from class: com.squareup.cardcustomizations.signature.SignaturesKt$$ExternalSyntheticLambda5
                public final /* synthetic */ int f$1;
                public final /* synthetic */ int f$2;
                public final /* synthetic */ int f$3;
                public final /* synthetic */ float f$4;
                public final /* synthetic */ float f$5;
                public final /* synthetic */ RoundedCornerShape f$6;
                public final /* synthetic */ SignatureStateListener f$7;
                public final /* synthetic */ SignatureState f$8;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj5, Object obj6) {
                    ((Integer) obj6).getClass();
                    int updateChangedFlags = Updater.updateChangedFlags(134217729);
                    AspectRatio.PatternSignature(Modifier.this, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, this.f$8, (Composer) obj5, updateChangedFlags);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void PredictiveBackHandler(boolean z, Function2 function2, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-642000585);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function2) ? 32 : 16;
        }
        int i3 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Object current = LocalNavigationEventDispatcherOwner.getCurrent(gapComposer);
            if (current == null) {
                gapComposer.startReplaceGroup(1512740606);
                current = LocalOnBackPressedDispatcherOwner.getCurrent(gapComposer);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(1512737723);
                gapComposer.end(false);
            }
            if (current == null) {
                a$$ExternalSyntheticBUOutline0.m$1("No NavigationEventDispatcherOwner was provided via LocalNavigationEventDispatcherOwner and no OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner. Please provide one of the two.");
                return;
            }
            boolean changed = gapComposer.changed(current);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changed || rememberedValue == neverEqualPolicy) {
                NavigationEventDispatcherOwner navigationEventDispatcherOwner = current instanceof NavigationEventDispatcherOwner ? (NavigationEventDispatcherOwner) current : null;
                NavigationEventDispatcher navigationEventDispatcher = navigationEventDispatcherOwner != null ? navigationEventDispatcherOwner.getNavigationEventDispatcher() : null;
                OnBackPressedDispatcherOwner onBackPressedDispatcherOwner = current instanceof OnBackPressedDispatcherOwner ? (OnBackPressedDispatcherOwner) current : null;
                rememberedValue = new BackHandlerDispatcherCompat(navigationEventDispatcher, onBackPressedDispatcherOwner != null ? onBackPressedDispatcherOwner.getOnBackPressedDispatcher() : null);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            BackHandlerDispatcherCompat backHandlerDispatcherCompat = (BackHandlerDispatcherCompat) rememberedValue;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            CoroutineScope coroutineScope = (CoroutineScope) rememberedValue2;
            long j = gapComposer.compositeKeyHashCode;
            boolean changed2 = gapComposer.changed(backHandlerDispatcherCompat) | gapComposer.changed(j);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (changed2 || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new ComposePredictiveBackHandler(coroutineScope, new PredictiveBackHandlerInfo(current, j));
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            ComposePredictiveBackHandler composePredictiveBackHandler = (ComposePredictiveBackHandler) rememberedValue3;
            gapComposer.startReplaceGroup(-348514256);
            boolean changedInstance = gapComposer.changedInstance(composePredictiveBackHandler) | gapComposer.changedInstance(function2);
            Object rememberedValue4 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue4 == neverEqualPolicy) {
                rememberedValue4 = new DialogHostKt$$ExternalSyntheticLambda0(i3, composePredictiveBackHandler, function2);
                gapComposer.updateRememberedValue(rememberedValue4);
            }
            Updater.SideEffect((Function0) rememberedValue4, gapComposer);
            Boolean valueOf = Boolean.valueOf(z);
            int i4 = i2 & 14;
            boolean changedInstance2 = (i4 == 4) | gapComposer.changedInstance(composePredictiveBackHandler);
            Object rememberedValue5 = gapComposer.rememberedValue();
            if (changedInstance2 || rememberedValue5 == neverEqualPolicy) {
                rememberedValue5 = new SliderKt$$ExternalSyntheticLambda5(composePredictiveBackHandler, z, i3);
                gapComposer.updateRememberedValue(rememberedValue5);
            }
            DimensionKt.LifecycleStartEffect(valueOf, composePredictiveBackHandler, null, (Function1) rememberedValue5, gapComposer, i4);
            boolean changedInstance3 = gapComposer.changedInstance(backHandlerDispatcherCompat) | gapComposer.changedInstance(composePredictiveBackHandler);
            Object rememberedValue6 = gapComposer.rememberedValue();
            if (changedInstance3 || rememberedValue6 == neverEqualPolicy) {
                rememberedValue6 = new ClickableKt$$ExternalSyntheticLambda0(i3, backHandlerDispatcherCompat, composePredictiveBackHandler);
                gapComposer.updateRememberedValue(rememberedValue6);
            }
            Updater.DisposableEffect(backHandlerDispatcherCompat, composePredictiveBackHandler, (Function1) rememberedValue6, gapComposer);
            gapComposer.end(false);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalHomeViewKt$$ExternalSyntheticLambda3(z, function2, i, i3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Signature(final Modifier modifier, boolean z, final int i, int i2, Shape shape, float f, final float f2, SignatureStateListener signatureStateListener, final SignatureState signatureState, Composer composer, final int i3, final int i4) {
        int i5;
        boolean z2;
        int i6;
        int i7;
        Shape shape2;
        int i8;
        float f3;
        int i9;
        final SignatureStateListener signatureStateListener2;
        final boolean z3;
        final int i10;
        final float f4;
        final Shape shape3;
        RecomposeScopeImpl endRestartGroup;
        SignatureStateListener signatureStateListener3;
        float f5;
        int i11;
        boolean z4;
        int i12;
        Shape shape4;
        MutableState mutableState;
        boolean z5;
        float f6;
        Object signaturesKt$$ExternalSyntheticLambda1;
        int i13;
        Modifier modifier2;
        boolean z6;
        Object obj;
        int i14;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(931679826);
        if ((i3 & 6) == 0) {
            i5 = (gapComposer.changed(modifier) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        int i15 = i4 & 2;
        if (i15 != 0) {
            i5 |= 48;
        } else if ((i3 & 48) == 0) {
            z2 = z;
            i5 |= gapComposer.changed(z2) ? 32 : 16;
            if ((i3 & MLKEMEngine.KyberPolyBytes) == 0) {
                i5 |= gapComposer.changed(i) ? 256 : 128;
            }
            i6 = i4 & 8;
            if (i6 == 0) {
                i5 |= 3072;
            } else if ((i3 & 3072) == 0) {
                i7 = i2;
                i5 |= gapComposer.changed(i7) ? 2048 : 1024;
                if ((i3 & 24576) == 0) {
                    if ((i4 & 16) == 0) {
                        shape2 = shape;
                        if (gapComposer.changed(shape2)) {
                            i14 = 16384;
                            i5 |= i14;
                        }
                    } else {
                        shape2 = shape;
                    }
                    i14 = PKIFailureInfo.certRevoked;
                    i5 |= i14;
                } else {
                    shape2 = shape;
                }
                i8 = i4 & 32;
                if (i8 != 0) {
                    i5 |= 196608;
                    f3 = f;
                } else {
                    f3 = f;
                    if ((i3 & 196608) == 0) {
                        i5 |= gapComposer.changed(f3) ? PKIFailureInfo.unsupportedVersion : 65536;
                    }
                }
                if ((i3 & 1572864) == 0) {
                    i5 |= gapComposer.changed(f2) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
                }
                i9 = i4 & 128;
                int i16 = 12582912;
                if (i9 == 0) {
                    if ((i3 & 12582912) == 0) {
                        i16 = (i3 & 16777216) == 0 ? gapComposer.changed(signatureStateListener) : gapComposer.changedInstance(signatureStateListener) ? 8388608 : 4194304;
                    }
                    if ((i3 & 100663296) == 0) {
                        i5 |= gapComposer.changedInstance(signatureState) ? 67108864 : 33554432;
                    }
                    if (gapComposer.shouldExecute(i5 & 1, (i5 & 38347923) == 38347922)) {
                        gapComposer.skipToGroupEnd();
                        signatureStateListener2 = signatureStateListener;
                        z3 = z2;
                        i10 = i7;
                        f4 = f3;
                        shape3 = shape2;
                    } else {
                        gapComposer.startDefaults();
                        if ((i3 & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                            if (i15 != 0) {
                                z2 = false;
                            }
                            if (i6 != 0) {
                                i7 = ColorKt.m694toArgb8_81llA(Color.Blue);
                            }
                            int i17 = i4 & 16;
                            float f7 = RecyclerView.DECELERATION_RATE;
                            if (i17 != 0) {
                                i5 &= -57345;
                                shape2 = RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(RecyclerView.DECELERATION_RATE);
                            }
                            if (i8 == 0) {
                                f7 = f3;
                            }
                            signatureStateListener3 = i9 != 0 ? null : signatureStateListener;
                            f5 = f7;
                            i11 = i5;
                            z4 = z2;
                            i12 = i7;
                            shape4 = shape2;
                        } else {
                            gapComposer.skipToGroupEnd();
                            if ((i4 & 16) != 0) {
                                i5 &= -57345;
                            }
                            signatureStateListener3 = signatureStateListener;
                            f5 = f3;
                            z4 = z2;
                            i12 = i7;
                            shape4 = shape2;
                            i11 = i5;
                        }
                        gapComposer.endDefaults();
                        Density density = (Density) gapComposer.consume(CompositionLocalsKt.LocalDensity);
                        Object rememberedValue = gapComposer.rememberedValue();
                        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                        Object obj2 = rememberedValue;
                        if (rememberedValue == neverEqualPolicy) {
                            ParcelableSnapshotMutableState mutableStateOf$default = Updater.mutableStateOf$default(EmptyList.INSTANCE);
                            gapComposer.updateRememberedValue(mutableStateOf$default);
                            obj2 = mutableStateOf$default;
                        }
                        MutableState mutableState2 = (MutableState) obj2;
                        int i18 = i11 & 896;
                        boolean changedInstance = gapComposer.changedInstance(signatureState) | ((i11 & 112) == 32) | ((458752 & i11) == 131072) | ((((57344 & i11) ^ 24576) > 16384 && gapComposer.changed(shape4)) || (i11 & 24576) == 16384) | gapComposer.changed(density) | ((3670016 & i11) == 1048576) | (i18 == 256);
                        Object rememberedValue2 = gapComposer.rememberedValue();
                        if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                            mutableState = mutableState2;
                            SignaturesKt$$ExternalSyntheticLambda0 signaturesKt$$ExternalSyntheticLambda0 = new SignaturesKt$$ExternalSyntheticLambda0(signatureState, z4, f2, i, f5, shape4, density);
                            z5 = z4;
                            f6 = f5;
                            gapComposer.updateRememberedValue(signaturesKt$$ExternalSyntheticLambda0);
                            rememberedValue2 = signaturesKt$$ExternalSyntheticLambda0;
                        } else {
                            mutableState = mutableState2;
                            z5 = z4;
                            f6 = f5;
                        }
                        Modifier onPlaced = RulerKt.onPlaced(modifier, (Function1) rememberedValue2);
                        if (((Boolean) signatureState.isEnabled$delegate.getValue()).booleanValue()) {
                            gapComposer.startReplaceGroup(1598985402);
                            Unit unit = Unit.INSTANCE;
                            boolean changedInstance2 = ((29360128 & i11) == 8388608 || ((i11 & 16777216) != 0 && gapComposer.changedInstance(signatureStateListener3))) | gapComposer.changedInstance(signatureState);
                            Object rememberedValue3 = gapComposer.rememberedValue();
                            if (changedInstance2 || rememberedValue3 == neverEqualPolicy) {
                                z6 = false;
                                SignaturesKt$Signature$1$1 signaturesKt$Signature$1$1 = new SignaturesKt$Signature$1$1((int) (false ? 1 : 0), (Object) signatureStateListener3, (Object) signatureState, (Object) mutableState);
                                gapComposer.updateRememberedValue(signaturesKt$Signature$1$1);
                                obj = signaturesKt$Signature$1$1;
                            } else {
                                z6 = false;
                                obj = rememberedValue3;
                            }
                            onPlaced = SuspendingPointerInputFilterKt.pointerInput(onPlaced, unit, (PointerInputEventHandler) obj);
                            gapComposer.end(z6);
                        } else {
                            gapComposer.startReplaceGroup(1600205872);
                            gapComposer.end(false);
                        }
                        boolean changedInstance3 = gapComposer.changedInstance(signatureState) | ((i11 & 7168) == 2048) | (i18 == 256);
                        Object rememberedValue4 = gapComposer.rememberedValue();
                        if (changedInstance3 || rememberedValue4 == neverEqualPolicy) {
                            i13 = i12;
                            modifier2 = onPlaced;
                            signaturesKt$$ExternalSyntheticLambda1 = new SignaturesKt$$ExternalSyntheticLambda1(signatureState, mutableState, i13, i, 0);
                            gapComposer.updateRememberedValue(signaturesKt$$ExternalSyntheticLambda1);
                        } else {
                            i13 = i12;
                            modifier2 = onPlaced;
                            signaturesKt$$ExternalSyntheticLambda1 = rememberedValue4;
                        }
                        CanvasKt.Canvas(0, gapComposer, modifier2, (Function1) signaturesKt$$ExternalSyntheticLambda1);
                        i10 = i13;
                        shape3 = shape4;
                        z3 = z5;
                        signatureStateListener2 = signatureStateListener3;
                        f4 = f6;
                    }
                    endRestartGroup = gapComposer.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.block = new Function2() { // from class: com.squareup.cardcustomizations.signature.SignaturesKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                ((Integer) obj4).getClass();
                                AspectRatio.Signature(Modifier.this, z3, i, i10, shape3, f4, f2, signatureStateListener2, signatureState, (Composer) obj3, Updater.updateChangedFlags(i3 | 1), i4);
                                return Unit.INSTANCE;
                            }
                        };
                        return;
                    }
                    return;
                }
                i5 |= i16;
                if ((i3 & 100663296) == 0) {
                }
                if (gapComposer.shouldExecute(i5 & 1, (i5 & 38347923) == 38347922)) {
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i7 = i2;
            if ((i3 & 24576) == 0) {
            }
            i8 = i4 & 32;
            if (i8 != 0) {
            }
            if ((i3 & 1572864) == 0) {
            }
            i9 = i4 & 128;
            int i162 = 12582912;
            if (i9 == 0) {
            }
            i5 |= i162;
            if ((i3 & 100663296) == 0) {
            }
            if (gapComposer.shouldExecute(i5 & 1, (i5 & 38347923) == 38347922)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        z2 = z;
        if ((i3 & MLKEMEngine.KyberPolyBytes) == 0) {
        }
        i6 = i4 & 8;
        if (i6 == 0) {
        }
        i7 = i2;
        if ((i3 & 24576) == 0) {
        }
        i8 = i4 & 32;
        if (i8 != 0) {
        }
        if ((i3 & 1572864) == 0) {
        }
        i9 = i4 & 128;
        int i1622 = 12582912;
        if (i9 == 0) {
        }
        i5 |= i1622;
        if ((i3 & 100663296) == 0) {
        }
        if (gapComposer.shouldExecute(i5 & 1, (i5 & 38347923) == 38347922)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final Canvas clip(Bitmap bitmap, AndroidPath androidPath) {
        Canvas canvas = new Canvas(bitmap);
        if (!(androidPath instanceof AndroidPath)) {
            a$$ExternalSyntheticBUOutline0.m("Unable to obtain android.graphics.Path");
            return null;
        }
        canvas.clipOutPath(androidPath.internalPath);
        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
        return canvas;
    }

    public static boolean isEscapable(int i, CharSequence charSequence) {
        if (i >= charSequence.length()) {
            return false;
        }
        char charAt = charSequence.charAt(i);
        switch (charAt) {
            case '!':
            case '\"':
            case '#':
            case '$':
            case '%':
            case '&':
            case '\'':
            case '(':
            case ')':
            case '*':
            case '+':
            case ',':
            case '-':
            case '.':
            case '/':
                return true;
            default:
                switch (charAt) {
                    case ':':
                    case ';':
                    case '<':
                    case '=':
                    case '>':
                    case '?':
                    case '@':
                        return true;
                    default:
                        switch (charAt) {
                            case '[':
                            case '\\':
                            case ']':
                            case '^':
                            case '_':
                            case '`':
                                return true;
                            default:
                                switch (charAt) {
                                    case SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE:
                                    case SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE:
                                    case '}':
                                    case SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE:
                                        return true;
                                    default:
                                        return false;
                                }
                        }
                }
        }
    }

    public static final SignatureState rememberSignatureState(Function0 function0, Composer composer, int i) {
        if ((i & 1) != 0) {
            function0 = null;
        }
        GapComposer gapComposer = (GapComposer) composer;
        Object rememberedValue = gapComposer.rememberedValue();
        if (rememberedValue == Composer.Companion.Empty) {
            rememberedValue = new SignatureState(function0 != null ? (SavedSignature) function0.invoke() : null);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        return (SignatureState) rememberedValue;
    }

    public static int skip(char c, int i, int i2, CharSequence charSequence) {
        while (i < i2) {
            if (charSequence.charAt(i) != c) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static int skipSpaceTab(int i, int i2, CharSequence charSequence) {
        while (i < i2) {
            char charAt = charSequence.charAt(i);
            if (charAt != '\t' && charAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }
}
