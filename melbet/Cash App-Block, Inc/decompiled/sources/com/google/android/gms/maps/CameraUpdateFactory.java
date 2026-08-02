package com.google.android.gms.maps;

import android.os.Parcel;
import android.os.RemoteException;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import coil3.request.OneShotDisposable;
import coil3.size.SizeKt;
import com.google.android.datatransport.runtime.TransportImpl$$ExternalSyntheticLambda0;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.maps.zzc;
import com.google.android.gms.maps.internal.zzb;
import com.google.android.gms.maps.model.CameraPosition;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.genericelements.components.base.GenericArcadeButtonKt$$ExternalSyntheticLambda1;
import com.squareup.cash.genericelements.components.base.GenericArcadeButtonKt$$ExternalSyntheticLambda2;
import com.squareup.cash.genericelements.components.base.GenericArcadeButtonKt$$ExternalSyntheticLambda3;
import com.squareup.cash.genericelements.viewmodels.GenericBaseViewModel;
import com.squareup.cash.instruments.views.InstrumentCellKt$$ExternalSyntheticLambda9;
import com.squareup.protos.cash.genericelements.ui.ArcadeButtonElement;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class CameraUpdateFactory {
    public static zzb zza;

    public static final void GenericArcadeButton(Modifier modifier, GenericBaseViewModel.ArcadeButtonViewModel arcadeButtonViewModel, Function1 function1, Composer composer, int i, int i2) {
        int i3;
        arcadeButtonViewModel.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1110344195);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer.changedInstance(arcadeButtonViewModel) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            if (i4 != 0) {
                modifier = Modifier.Companion.$$INSTANCE;
            }
            int ordinal = arcadeButtonViewModel.size.ordinal();
            if (ordinal == 0) {
                gapComposer.startReplaceGroup(-1888875532);
                ToDefaultButton(arcadeButtonViewModel, modifier, function1, gapComposer, ((i3 >> 3) & 14) | ((i3 << 3) & 112) | (i3 & 896));
                gapComposer.end(false);
            } else if (ordinal == 1) {
                gapComposer.startReplaceGroup(-1888873200);
                ToCtaButton(arcadeButtonViewModel, modifier, function1, gapComposer, ((i3 >> 3) & 14) | ((i3 << 3) & 112) | (i3 & 896));
                gapComposer.end(false);
            } else {
                if (ordinal != 2) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -1888876870, false);
                }
                gapComposer.startReplaceGroup(-1888870860);
                ToCompactButton(arcadeButtonViewModel, modifier, function1, gapComposer, ((i3 >> 3) & 14) | ((i3 << 3) & 112) | (i3 & 896));
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new InstrumentCellKt$$ExternalSyntheticLambda9(modifier2, arcadeButtonViewModel, function1, i, i2, 2);
        }
    }

    public static final void ToCompactButton(GenericBaseViewModel.ArcadeButtonViewModel arcadeButtonViewModel, Modifier modifier, Function1 function1, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        ButtonProminence buttonProminence;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1248640712);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(arcadeButtonViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            modifier2 = modifier;
            i2 |= gapComposer.changed(modifier2) ? 32 : 16;
        } else {
            modifier2 = modifier;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        int i3 = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            boolean z = arcadeButtonViewModel.state != ArcadeButtonElement.State.DISABLED;
            int ordinal = arcadeButtonViewModel.prominence.ordinal();
            if (ordinal == 0) {
                buttonProminence = ButtonProminence.PROMINENT;
            } else if (ordinal == 1) {
                buttonProminence = ButtonProminence.STANDARD;
            } else {
                if (ordinal != 2) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                buttonProminence = ButtonProminence.SUBTLE;
            }
            ButtonProminence buttonProminence2 = buttonProminence;
            boolean z2 = arcadeButtonViewModel.destructive;
            boolean changedInstance = gapComposer.changedInstance(arcadeButtonViewModel) | ((i2 & 896) == 256);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new GenericArcadeButtonKt$$ExternalSyntheticLambda1(arcadeButtonViewModel, function1, 0);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            SizeKt.ButtonCompact((Function0) rememberedValue, modifier2, buttonProminence2, z2, z, null, Expect_jvmKt.rememberComposableLambda(1820319168, new GenericArcadeButtonKt$$ExternalSyntheticLambda2(arcadeButtonViewModel, i3), gapComposer), gapComposer, (i2 & 112) | 1572864, 32);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new GenericArcadeButtonKt$$ExternalSyntheticLambda3(arcadeButtonViewModel, modifier, function1, i, 0);
        }
    }

    public static final void ToCtaButton(GenericBaseViewModel.ArcadeButtonViewModel arcadeButtonViewModel, Modifier modifier, Function1 function1, Composer composer, int i) {
        int i2;
        boolean z;
        ButtonProminence buttonProminence;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1165701835);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(arcadeButtonViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(modifier) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        boolean z2 = false;
        int i3 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Modifier fillMaxWidth = androidx.compose.foundation.layout.SizeKt.fillMaxWidth(modifier, 1.0f);
            if (arcadeButtonViewModel.state != ArcadeButtonElement.State.DISABLED) {
                z = false;
                z2 = true;
            } else {
                z = false;
            }
            int ordinal = arcadeButtonViewModel.prominence.ordinal();
            if (ordinal == 0) {
                buttonProminence = ButtonProminence.PROMINENT;
            } else if (ordinal == 1) {
                buttonProminence = ButtonProminence.STANDARD;
            } else {
                if (ordinal != 2) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                buttonProminence = ButtonProminence.SUBTLE;
            }
            boolean z3 = z;
            boolean z4 = arcadeButtonViewModel.destructive;
            boolean changedInstance = gapComposer.changedInstance(arcadeButtonViewModel);
            if ((i2 & 896) == 256) {
                z3 = true;
            }
            boolean z5 = changedInstance | z3;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z5 || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new GenericArcadeButtonKt$$ExternalSyntheticLambda1(arcadeButtonViewModel, function1, 1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            SizeKt.ButtonCta((Function0) rememberedValue, fillMaxWidth, buttonProminence, z4, z2, null, Expect_jvmKt.rememberComposableLambda(-119818470, new GenericArcadeButtonKt$$ExternalSyntheticLambda2(arcadeButtonViewModel, i3), gapComposer), gapComposer, 1572864, 32);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new GenericArcadeButtonKt$$ExternalSyntheticLambda3(arcadeButtonViewModel, modifier, function1, i, 1);
        }
    }

    public static final void ToDefaultButton(GenericBaseViewModel.ArcadeButtonViewModel arcadeButtonViewModel, Modifier modifier, Function1 function1, Composer composer, int i) {
        int i2;
        boolean z;
        ButtonProminence buttonProminence;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1542419942);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(arcadeButtonViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(modifier) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        boolean z2 = false;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Modifier fillMaxWidth = androidx.compose.foundation.layout.SizeKt.fillMaxWidth(modifier, 1.0f);
            if (arcadeButtonViewModel.state != ArcadeButtonElement.State.DISABLED) {
                z = false;
                z2 = true;
            } else {
                z = false;
            }
            int ordinal = arcadeButtonViewModel.prominence.ordinal();
            if (ordinal == 0) {
                buttonProminence = ButtonProminence.PROMINENT;
            } else if (ordinal == 1) {
                buttonProminence = ButtonProminence.STANDARD;
            } else {
                if (ordinal != 2) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                buttonProminence = ButtonProminence.SUBTLE;
            }
            boolean z3 = z;
            boolean z4 = arcadeButtonViewModel.destructive;
            boolean changedInstance = gapComposer.changedInstance(arcadeButtonViewModel) | ((i2 & 896) != 256 ? z3 : true);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new GenericArcadeButtonKt$$ExternalSyntheticLambda1(arcadeButtonViewModel, function1, 2);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            SizeKt.Button((Function0) rememberedValue, fillMaxWidth, buttonProminence, z4, z2, null, Expect_jvmKt.rememberComposableLambda(35728851, new GenericArcadeButtonKt$$ExternalSyntheticLambda2(arcadeButtonViewModel, i3), gapComposer), gapComposer, 1572864, 32);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new GenericArcadeButtonKt$$ExternalSyntheticLambda3(arcadeButtonViewModel, modifier, function1, i, 2);
        }
    }

    public static Date cleanDate(String str) {
        String replace;
        String replace2;
        String replace3;
        String replace4;
        String replace5;
        String replace6;
        if (str == null) {
            return null;
        }
        replace = new Regex("I").replace(str, "1");
        replace2 = new Regex("L").replace(replace, "1");
        replace3 = new Regex("D").replace(replace2, "0");
        replace4 = new Regex("O").replace(replace3, "0");
        replace5 = new Regex("S").replace(replace4, "5");
        replace6 = new Regex("G").replace(replace5, "6");
        try {
            return new SimpleDateFormat("yyMMdd", Locale.US).parse(replace6);
        } catch (ParseException unused) {
            return null;
        }
    }

    public static String cleanName(String str) {
        if (str == null) {
            return null;
        }
        return StringsKt.trim(StringsKt__StringsJVMKt.replace$default(str, "<", " ")).toString();
    }

    public static OneShotDisposable newCameraPosition(CameraPosition cameraPosition) {
        zzae.checkNotNull(cameraPosition, "cameraPosition must not be null");
        try {
            zzb zzbVar = zza;
            zzae.checkNotNull(zzbVar, "CameraUpdateFactory is not initialized");
            Parcel zza2 = zzbVar.zza();
            zzc.zze(zza2, cameraPosition);
            Parcel zzJ = zzbVar.zzJ(zza2, 7);
            IObjectWrapper asInterface = ObjectWrapper.asInterface(zzJ.readStrongBinder());
            zzJ.recycle();
            return new OneShotDisposable(asInterface);
        } catch (RemoteException e) {
            TransportImpl$$ExternalSyntheticLambda0.m(e);
            return null;
        }
    }
}
