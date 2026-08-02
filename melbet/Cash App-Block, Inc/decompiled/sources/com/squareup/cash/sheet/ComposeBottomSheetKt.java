package com.squareup.cash.sheet;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.credentials.exceptions.CreateCredentialCustomException;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.exceptions.domerrors.DataError;
import androidx.credentials.exceptions.domerrors.InvalidStateError;
import androidx.credentials.exceptions.domerrors.NotAllowedError;
import androidx.credentials.exceptions.publickeycredential.CreatePublicKeyCredentialDomException;
import androidx.credentials.internal.FrameworkClassParsingException;
import androidx.room.util.DBUtil;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.dialog.ComposeDialogKt$Modal$lambda$2$0$0$$inlined$onDispose$1;
import com.squareup.cash.overlays.OverlayLayer;
import com.squareup.cash.overlays.OverlaysKt;
import com.squareup.cash.payments.views.ToViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.tabs.views.TabToolbarsKt$$ExternalSyntheticLambda15;
import com.squareup.cash.ui.BottomSheetConfig;
import com.squareup.cash.ui.BottomSheetStyle;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes7.dex */
public abstract class ComposeBottomSheetKt {
    /* JADX WARN: Removed duplicated region for block: B:106:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BottomSheet(Object obj, final Object obj2, final Function0 function0, boolean z, boolean z2, int i, BottomSheetConfig.HeightMode heightMode, BottomSheetStyle bottomSheetStyle, final ComposableLambdaImpl composableLambdaImpl, Composer composer, final int i2, final int i3) {
        Object obj3;
        int i4;
        boolean z3;
        int i5;
        boolean z4;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        final BottomSheetStyle bottomSheetStyle2;
        final Object obj4;
        final boolean z5;
        final boolean z6;
        final int i11;
        final BottomSheetConfig.HeightMode heightMode2;
        RecomposeScopeImpl endRestartGroup;
        Function2 function2;
        function0.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-299903691);
        int i12 = i3 & 1;
        if (i12 != 0) {
            i4 = i2 | 6;
            obj3 = obj;
        } else if ((i2 & 6) == 0) {
            obj3 = obj;
            i4 = (gapComposer.changedInstance(obj3) ? 4 : 2) | i2;
        } else {
            obj3 = obj;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= (i2 & 64) == 0 ? gapComposer.changed(obj2) : gapComposer.changedInstance(obj2) ? 32 : 16;
        }
        if ((i2 & MLKEMEngine.KyberPolyBytes) == 0) {
            i4 |= gapComposer.changedInstance(function0) ? 256 : 128;
        }
        int i13 = i3 & 8;
        if (i13 != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            z3 = z;
            i4 |= gapComposer.changed(z3) ? 2048 : 1024;
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= 24576;
            } else if ((i2 & 24576) == 0) {
                z4 = z2;
                i4 |= gapComposer.changed(z4) ? 16384 : PKIFailureInfo.certRevoked;
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= 196608;
                } else if ((196608 & i2) == 0) {
                    i7 = i;
                    i4 |= gapComposer.changed(i7) ? PKIFailureInfo.unsupportedVersion : 65536;
                    i8 = i3 & 64;
                    if (i8 == 0) {
                        i4 |= 1572864;
                    } else if ((i2 & 1572864) == 0) {
                        i9 = i12;
                        i4 |= gapComposer.changed(heightMode == null ? -1 : heightMode.ordinal()) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
                        i10 = i3 & 128;
                        int i14 = 12582912;
                        if (i10 == 0) {
                            if ((i2 & 12582912) == 0) {
                                i14 = (i2 & 16777216) == 0 ? gapComposer.changed(bottomSheetStyle) : gapComposer.changedInstance(bottomSheetStyle) ? 8388608 : 4194304;
                            }
                            if ((i2 & 100663296) == 0) {
                                i4 |= gapComposer.changedInstance(composableLambdaImpl) ? 67108864 : 33554432;
                            }
                            if (gapComposer.shouldExecute(i4 & 1, (i4 & 38347923) == 38347922)) {
                                gapComposer.skipToGroupEnd();
                                bottomSheetStyle2 = bottomSheetStyle;
                                obj4 = obj3;
                                z5 = z3;
                                z6 = z4;
                                i11 = i7;
                                heightMode2 = heightMode;
                            } else {
                                obj4 = i9 != 0 ? null : obj3;
                                final int i15 = i4;
                                z5 = i13 != 0 ? false : z3;
                                z6 = i5 != 0 ? false : z4;
                                i11 = i6 != 0 ? 0 : i7;
                                heightMode2 = i8 != 0 ? BottomSheetConfig.HeightMode.FULL_SCREEN : heightMode;
                                bottomSheetStyle2 = i10 != 0 ? null : bottomSheetStyle;
                                if (obj2 == null) {
                                    endRestartGroup = gapComposer.endRestartGroup();
                                    if (endRestartGroup != null) {
                                        final int i16 = 0;
                                        function2 = new Function2() { // from class: com.squareup.cash.sheet.ComposeBottomSheetKt$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj5, Object obj6) {
                                                int i17 = i16;
                                                int i18 = i2;
                                                switch (i17) {
                                                    case 0:
                                                        ((Integer) obj6).getClass();
                                                        int updateChangedFlags = Updater.updateChangedFlags(i18 | 1);
                                                        ComposeBottomSheetKt.BottomSheet(obj4, obj2, function0, z5, z6, i11, heightMode2, bottomSheetStyle2, composableLambdaImpl, (Composer) obj5, updateChangedFlags, i3);
                                                        break;
                                                    default:
                                                        ((Integer) obj6).getClass();
                                                        int updateChangedFlags2 = Updater.updateChangedFlags(i18 | 1);
                                                        ComposeBottomSheetKt.BottomSheet(obj4, obj2, function0, z5, z6, i11, heightMode2, bottomSheetStyle2, composableLambdaImpl, (Composer) obj5, updateChangedFlags2, i3);
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        endRestartGroup.block = function2;
                                        return;
                                    }
                                    return;
                                }
                                OverlaysKt.WithOverlayLayer(Expect_jvmKt.rememberComposableLambda(670569768, new Function3() { // from class: com.squareup.cash.sheet.ComposeBottomSheetKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function3
                                    public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                        OverlayLayer overlayLayer = (OverlayLayer) obj5;
                                        int intValue = ((Integer) obj7).intValue();
                                        overlayLayer.getClass();
                                        ComposeBottomSheetKt.SheetV2(obj4, obj2, function0, z5, z6, i11, heightMode2, bottomSheetStyle2, overlayLayer, composableLambdaImpl, (Composer) obj6, (((i15 >> 3) & 8) << 3) | ((intValue << 24) & 234881024));
                                        return Unit.INSTANCE;
                                    }
                                }, gapComposer), gapComposer, 6);
                            }
                            endRestartGroup = gapComposer.endRestartGroup();
                            if (endRestartGroup == null) {
                                final int i17 = 1;
                                function2 = new Function2() { // from class: com.squareup.cash.sheet.ComposeBottomSheetKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj5, Object obj6) {
                                        int i172 = i17;
                                        int i18 = i2;
                                        switch (i172) {
                                            case 0:
                                                ((Integer) obj6).getClass();
                                                int updateChangedFlags = Updater.updateChangedFlags(i18 | 1);
                                                ComposeBottomSheetKt.BottomSheet(obj4, obj2, function0, z5, z6, i11, heightMode2, bottomSheetStyle2, composableLambdaImpl, (Composer) obj5, updateChangedFlags, i3);
                                                break;
                                            default:
                                                ((Integer) obj6).getClass();
                                                int updateChangedFlags2 = Updater.updateChangedFlags(i18 | 1);
                                                ComposeBottomSheetKt.BottomSheet(obj4, obj2, function0, z5, z6, i11, heightMode2, bottomSheetStyle2, composableLambdaImpl, (Composer) obj5, updateChangedFlags2, i3);
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                endRestartGroup.block = function2;
                                return;
                            }
                            return;
                        }
                        i4 |= i14;
                        if ((i2 & 100663296) == 0) {
                        }
                        if (gapComposer.shouldExecute(i4 & 1, (i4 & 38347923) == 38347922)) {
                        }
                        endRestartGroup = gapComposer.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    i9 = i12;
                    i10 = i3 & 128;
                    int i142 = 12582912;
                    if (i10 == 0) {
                    }
                    i4 |= i142;
                    if ((i2 & 100663296) == 0) {
                    }
                    if (gapComposer.shouldExecute(i4 & 1, (i4 & 38347923) == 38347922)) {
                    }
                    endRestartGroup = gapComposer.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                i7 = i;
                i8 = i3 & 64;
                if (i8 == 0) {
                }
                i9 = i12;
                i10 = i3 & 128;
                int i1422 = 12582912;
                if (i10 == 0) {
                }
                i4 |= i1422;
                if ((i2 & 100663296) == 0) {
                }
                if (gapComposer.shouldExecute(i4 & 1, (i4 & 38347923) == 38347922)) {
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z4 = z2;
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            i7 = i;
            i8 = i3 & 64;
            if (i8 == 0) {
            }
            i9 = i12;
            i10 = i3 & 128;
            int i14222 = 12582912;
            if (i10 == 0) {
            }
            i4 |= i14222;
            if ((i2 & 100663296) == 0) {
            }
            if (gapComposer.shouldExecute(i4 & 1, (i4 & 38347923) == 38347922)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        z3 = z;
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        z4 = z2;
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        i7 = i;
        i8 = i3 & 64;
        if (i8 == 0) {
        }
        i9 = i12;
        i10 = i3 & 128;
        int i142222 = 12582912;
        if (i10 == 0) {
        }
        i4 |= i142222;
        if ((i2 & 100663296) == 0) {
        }
        if (gapComposer.shouldExecute(i4 & 1, (i4 & 38347923) == 38347922)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void SheetV2(final Object obj, Object obj2, final Function0 function0, boolean z, boolean z2, final int i, final BottomSheetConfig.HeightMode heightMode, final BottomSheetStyle bottomSheetStyle, final OverlayLayer overlayLayer, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i2) {
        int i3;
        boolean z3;
        ComposableLambdaImpl composableLambdaImpl2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-543394397);
        if ((i2 & 6) == 0) {
            i3 = (gapComposer.changedInstance(obj) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? gapComposer.changed(obj2) : gapComposer.changedInstance(obj2) ? 32 : 16;
        }
        if ((i2 & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changedInstance(function0) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= gapComposer.changed(z) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            z3 = z2;
            i3 |= gapComposer.changed(z3) ? 16384 : PKIFailureInfo.certRevoked;
        } else {
            z3 = z2;
        }
        if ((196608 & i2) == 0) {
            i3 |= gapComposer.changed(i) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= gapComposer.changed(heightMode == null ? -1 : heightMode.ordinal()) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((12582912 & i2) == 0) {
            i3 |= (i2 & 16777216) == 0 ? gapComposer.changed(bottomSheetStyle) : gapComposer.changedInstance(bottomSheetStyle) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i3 |= gapComposer.changedInstance(overlayLayer) ? 67108864 : 33554432;
        }
        if ((805306368 & i2) == 0) {
            composableLambdaImpl2 = composableLambdaImpl;
            i3 |= gapComposer.changedInstance(composableLambdaImpl2) ? PKIFailureInfo.duplicateCertReq : 268435456;
        } else {
            composableLambdaImpl2 = composableLambdaImpl;
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 306783379) != 306783378)) {
            final MutableState rememberUpdatedState = Updater.rememberUpdatedState(new Pair(obj, obj2), gapComposer);
            final MutableState rememberUpdatedState2 = Updater.rememberUpdatedState(Boolean.valueOf(z), gapComposer);
            final MutableState rememberUpdatedState3 = Updater.rememberUpdatedState(Boolean.valueOf(z3), gapComposer);
            DBUtil.BackHandler(false, function0, gapComposer, (i3 >> 3) & 112, 1);
            final Context context = (Context) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalContext);
            boolean changedInstance = ((458752 & i3) == 131072) | gapComposer.changedInstance(context) | ((i3 & 29360128) == 8388608 || ((i3 & 16777216) != 0 && gapComposer.changedInstance(bottomSheetStyle))) | gapComposer.changed(rememberUpdatedState2) | gapComposer.changed(rememberUpdatedState3) | ((3670016 & i3) == 1048576) | gapComposer.changedInstance(obj) | gapComposer.changed(rememberUpdatedState) | ((1879048192 & i3) == 536870912) | ((i3 & 896) == 256) | gapComposer.changedInstance(overlayLayer);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                final ComposableLambdaImpl composableLambdaImpl3 = composableLambdaImpl2;
                Function1 function1 = new Function1() { // from class: com.squareup.cash.sheet.ComposeBottomSheetKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        ((DisposableEffectScope) obj3).getClass();
                        int i4 = i;
                        BottomSheetConfig.HeightMode heightMode2 = heightMode;
                        Object obj4 = obj;
                        Context context2 = context;
                        BottomSheet bottomSheet = new BottomSheet(context2, new ComposeBottomSheetKt$SheetV2$1$1$sheet$1(i4, heightMode2, obj4, context2, bottomSheetStyle, rememberUpdatedState2, rememberUpdatedState3, rememberUpdatedState, composableLambdaImpl3), null, 60);
                        Function0 function02 = function0;
                        bottomSheet.setOnClickOutsideListener(new ToViewKt$$ExternalSyntheticLambda2(26, function02));
                        bottomSheet.addOnStateChangeListener(new ComposeBottomSheetKt$$ExternalSyntheticLambda6(function02, 0));
                        return new ComposeDialogKt$Modal$lambda$2$0$0$$inlined$onDispose$1(overlayLayer.show(bottomSheet), 3);
                    }
                };
                gapComposer.updateRememberedValue(function1);
                rememberedValue = function1;
            }
            Updater.DisposableEffect(obj, bottomSheetStyle, (Function1) rememberedValue, gapComposer);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TabToolbarsKt$$ExternalSyntheticLambda15(obj, obj2, function0, z, z2, i, heightMode, bottomSheetStyle, overlayLayer, composableLambdaImpl, i2);
        }
    }

    public static CreateCredentialException createFrom(String str, String str2) {
        Exception access$generateException;
        str.getClass();
        try {
            CreatePublicKeyCredentialDomException createPublicKeyCredentialDomException = new CreatePublicKeyCredentialDomException(new DataError(24), null);
            if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_ABORT_ERROR")) {
                access$generateException = PinnedKt.access$generateException(new DataError(1), str2, createPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_CONSTRAINT_ERROR")) {
                access$generateException = PinnedKt.access$generateException(new DataError(2), str2, createPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_DATA_CLONE_ERROR")) {
                access$generateException = PinnedKt.access$generateException(new DataError(3), str2, createPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_DATA_ERROR")) {
                access$generateException = PinnedKt.access$generateException(new DataError(0), str2, createPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_ENCODING_ERROR")) {
                access$generateException = PinnedKt.access$generateException(new DataError(4), str2, createPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_HIERARCHY_REQUEST_ERROR")) {
                access$generateException = PinnedKt.access$generateException(new DataError(5), str2, createPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_IN_USE_ATTRIBUTE_ERROR")) {
                access$generateException = PinnedKt.access$generateException(new DataError(6), str2, createPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_CHARACTER_ERROR")) {
                access$generateException = PinnedKt.access$generateException(new DataError(7), str2, createPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_MODIFICATION_ERROR")) {
                access$generateException = PinnedKt.access$generateException(new DataError(8), str2, createPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_NODE_TYPE_ERROR")) {
                access$generateException = PinnedKt.access$generateException(new DataError(9), str2, createPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_STATE_ERROR")) {
                access$generateException = PinnedKt.access$generateException(new InvalidStateError(), str2, createPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NAMESPACE_ERROR")) {
                access$generateException = PinnedKt.access$generateException(new DataError(10), str2, createPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NETWORK_ERROR")) {
                access$generateException = PinnedKt.access$generateException(new DataError(11), str2, createPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NO_MODIFICATION_ALLOWED_ERROR")) {
                access$generateException = PinnedKt.access$generateException(new DataError(12), str2, createPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_ALLOWED_ERROR")) {
                access$generateException = PinnedKt.access$generateException(new NotAllowedError(), str2, createPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_FOUND_ERROR")) {
                access$generateException = PinnedKt.access$generateException(new DataError(13), str2, createPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_READABLE_ERROR")) {
                access$generateException = PinnedKt.access$generateException(new DataError(14), str2, createPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_SUPPORTED_ERROR")) {
                access$generateException = PinnedKt.access$generateException(new DataError(15), str2, createPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_OPERATION_ERROR")) {
                access$generateException = PinnedKt.access$generateException(new DataError(16), str2, createPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_OPT_OUT_ERROR")) {
                access$generateException = PinnedKt.access$generateException(new DataError(17), str2, createPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_QUOTA_EXCEEDED_ERROR")) {
                access$generateException = PinnedKt.access$generateException(new DataError(18), str2, createPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_READ_ONLY_ERROR")) {
                access$generateException = PinnedKt.access$generateException(new DataError(19), str2, createPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_SECURITY_ERROR")) {
                access$generateException = PinnedKt.access$generateException(new DataError(20), str2, createPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_SYNTAX_ERROR")) {
                access$generateException = PinnedKt.access$generateException(new DataError(21), str2, createPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_TIMEOUT_ERROR")) {
                access$generateException = PinnedKt.access$generateException(new DataError(22), str2, createPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_TRANSACTION_INACTIVE_ERROR")) {
                access$generateException = PinnedKt.access$generateException(new DataError(23), str2, createPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_UNKNOWN_ERROR")) {
                access$generateException = PinnedKt.access$generateException(new DataError(24), str2, createPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_VERSION_ERROR")) {
                access$generateException = PinnedKt.access$generateException(new DataError(25), str2, createPublicKeyCredentialDomException);
            } else {
                if (!str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_WRONG_DOCUMENT_ERROR")) {
                    throw new FrameworkClassParsingException();
                }
                access$generateException = PinnedKt.access$generateException(new DataError(26), str2, createPublicKeyCredentialDomException);
            }
            return (CreateCredentialException) access$generateException;
        } catch (FrameworkClassParsingException unused) {
            return new CreateCredentialCustomException(str2, str);
        }
    }

    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.InvestingFlow.deepLinkSpecs;
    }
}
