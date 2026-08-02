package androidx.camera.video.internal.utils;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.IconButtonKt$$ExternalSyntheticLambda0;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.semantics.Role;
import androidx.recyclerview.widget.RecyclerView;
import androidx.tracing.Trace;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.internal.LocalEnabledStateKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.theme.RippleKt;
import com.squareup.cash.moneybot.backend.api.model.chat.SlashCommand;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes3.dex */
public abstract class StorageUtil {
    /* JADX WARN: Removed duplicated region for block: B:104:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ButtonIcon(Icons icons, String str, Function0 function0, Modifier modifier, boolean z, Alignment alignment, Composer composer, int i, int i2) {
        int i3;
        String str2;
        Function0 function02;
        Modifier modifier2;
        boolean z2;
        int i4;
        Alignment alignment2;
        Modifier modifier3;
        boolean z3;
        Alignment alignment3;
        RecomposeScopeImpl endRestartGroup;
        boolean z4;
        boolean z5;
        Object rememberedValue;
        long j;
        int i5;
        icons.getClass();
        str.getClass();
        function0.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1972383567);
        if ((i & 6) == 0) {
            i3 = (gapComposer.changed(icons.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            str2 = str;
            i3 |= gapComposer.changed(str2) ? 32 : 16;
        } else {
            str2 = str;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            function02 = function0;
            i3 |= gapComposer.changedInstance(function02) ? 256 : 128;
        } else {
            function02 = function0;
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= gapComposer.changed(modifier2) ? 2048 : 1024;
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    z2 = z;
                    if (gapComposer.changed(z2)) {
                        i5 = 16384;
                        i3 |= i5;
                    }
                } else {
                    z2 = z;
                }
                i5 = PKIFailureInfo.certRevoked;
                i3 |= i5;
            } else {
                z2 = z;
            }
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= 196608;
            } else if ((196608 & i) == 0) {
                alignment2 = alignment;
                i3 |= gapComposer.changed(alignment2) ? PKIFailureInfo.unsupportedVersion : 65536;
                if (gapComposer.shouldExecute(i3 & 1, (74899 & i3) != 74898)) {
                    gapComposer.startDefaults();
                    if ((i & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                        modifier3 = i6 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
                        if ((i2 & 16) != 0) {
                            z4 = ((Boolean) gapComposer.consume(LocalEnabledStateKt.LocalEnabledState)).booleanValue();
                            i3 &= -57345;
                        } else {
                            z4 = z2;
                        }
                        if (i4 != 0) {
                            alignment3 = Alignment.Companion.Center;
                            z5 = z4;
                            gapComposer.endDefaults();
                            Modifier m279heightInVpY3zN4$default = SizeKt.m279heightInVpY3zN4$default(SizeKt.m292widthInVpY3zN4$default(modifier3, 48.0f, RecyclerView.DECELERATION_RATE, 2), 48.0f, RecyclerView.DECELERATION_RATE, 2);
                            rememberedValue = gapComposer.rememberedValue();
                            if (rememberedValue == Composer.Companion.Empty) {
                                rememberedValue = Recorder$$ExternalSyntheticOutline2.m(gapComposer);
                            }
                            int i7 = i3;
                            Modifier m181clickableO2vRcR0 = ImageKt.m181clickableO2vRcR0(m279heightInVpY3zN4$default, (MutableInteractionSourceImpl) rememberedValue, RippleKt.m3400rippleYJYuY3k(0L, false, 20.0f, null, gapComposer, 432, 9), z5, str2, new Role(0), function02);
                            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(alignment3, false);
                            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m181clickableO2vRcR0);
                            ComposeUiNode.Companion.getClass();
                            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                            if (gapComposer.applier != null) {
                                Updater.invalidApplier();
                                throw null;
                            }
                            gapComposer.startReusableNode();
                            if (gapComposer.inserting) {
                                gapComposer.createNode(layoutNode$Companion$Constructor$1);
                            } else {
                                gapComposer.useNode();
                            }
                            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
                            if (z5) {
                                gapComposer.startReplaceGroup(-142059510);
                                j = ((Color) gapComposer.consume(ArcadeThemeKt.LocalIconColor)).value;
                                if (j == 16) {
                                    Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                                    if (colors == null) {
                                        colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                                    } else {
                                        gapComposer.startReplaceGroup(-1762997739);
                                        gapComposer.end(false);
                                    }
                                    j = colors.semantic.icon.standard;
                                }
                                gapComposer.end(false);
                            } else {
                                gapComposer.startReplaceGroup(-141958512);
                                Colors colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                                if (colors2 == null) {
                                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                                } else {
                                    gapComposer.startReplaceGroup(-1762997739);
                                    gapComposer.end(false);
                                }
                                j = colors2.semantic.icon.disabled;
                                gapComposer.end(false);
                            }
                            Trace.m1191Iconww6aTOc(icons, (String) null, (Modifier) null, j, gapComposer, (i7 & 14) | 48, 4);
                            gapComposer.end(true);
                            z3 = z5;
                        } else {
                            z5 = z4;
                        }
                    } else {
                        gapComposer.skipToGroupEnd();
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                        modifier3 = modifier2;
                        z5 = z2;
                    }
                    alignment3 = alignment2;
                    gapComposer.endDefaults();
                    Modifier m279heightInVpY3zN4$default2 = SizeKt.m279heightInVpY3zN4$default(SizeKt.m292widthInVpY3zN4$default(modifier3, 48.0f, RecyclerView.DECELERATION_RATE, 2), 48.0f, RecyclerView.DECELERATION_RATE, 2);
                    rememberedValue = gapComposer.rememberedValue();
                    if (rememberedValue == Composer.Companion.Empty) {
                    }
                    int i72 = i3;
                    Modifier m181clickableO2vRcR02 = ImageKt.m181clickableO2vRcR0(m279heightInVpY3zN4$default2, (MutableInteractionSourceImpl) rememberedValue, RippleKt.m3400rippleYJYuY3k(0L, false, 20.0f, null, gapComposer, 432, 9), z5, str2, new Role(0), function02);
                    MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(alignment3, false);
                    int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m181clickableO2vRcR02);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer.applier != null) {
                    }
                } else {
                    gapComposer.skipToGroupEnd();
                    modifier3 = modifier2;
                    z3 = z2;
                    alignment3 = alignment2;
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new IconButtonKt$$ExternalSyntheticLambda0(icons, str, function0, modifier3, z3, alignment3, i, i2);
                    return;
                }
                return;
            }
            alignment2 = alignment;
            if (gapComposer.shouldExecute(i3 & 1, (74899 & i3) != 74898)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i & 24576) != 0) {
        }
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        alignment2 = alignment;
        if (gapComposer.shouldExecute(i3 & 1, (74899 & i3) != 74898)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final List computeSlashCommandMatches(String str, List list) {
        list.getClass();
        str.getClass();
        String substring = str.substring(trailingWordStart(str));
        if (!StringsKt__StringsJVMKt.startsWith(substring, "/", false)) {
            substring = null;
        }
        if (substring == null) {
            return EmptyList.INSTANCE;
        }
        String removePrefix = StringsKt.removePrefix("/", substring);
        if (removePrefix.length() == 0) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            SlashCommand slashCommand = (SlashCommand) obj;
            if (StringsKt__StringsJVMKt.startsWith(slashCommand.command, removePrefix, true) || StringsKt.contains((CharSequence) slashCommand.name, (CharSequence) removePrefix, true)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final String formatSize(long j) {
        if (j < 0) {
            a$$ExternalSyntheticBUOutline0.m$3("Bytes cannot be negative");
            return null;
        }
        String[] strArr = {"B", "KB", "MB", "GB", "TB"};
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        double d = j;
        int i = 0;
        double d2 = d;
        while (d2 >= 1024.0d && i < 4) {
            d2 /= 1024.0d;
            i++;
        }
        if (i == 0) {
            return decimalFormat.format(d2) + ' ' + strArr[i];
        }
        StringBuilder sb = new StringBuilder();
        while (-1 < i) {
            double pow = Math.pow(1024.0d, i);
            double floor = Math.floor(d / pow);
            if (floor > 0.0d) {
                sb.append(decimalFormat.format(floor));
                sb.append(" ");
                sb.append(strArr[i]);
                sb.append(" ");
                d -= floor * pow;
            }
            i--;
        }
        return StringsKt.trim(sb).toString();
    }

    public static final boolean isStorageFullException(Throwable th) {
        if (th == null) {
            return false;
        }
        String message = th.getMessage();
        if (message == null || !StringsKt.contains((CharSequence) message, (CharSequence) "No space left on device", false)) {
            return isStorageFullException(th.getCause());
        }
        return true;
    }

    public static final int trailingWordStart(String str) {
        str.getClass();
        int i = -1;
        int length = str.length() - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                if (CharsKt.isWhitespace(str.charAt(length))) {
                    i = length;
                    break;
                }
                if (i2 < 0) {
                    break;
                }
                length = i2;
            }
        }
        return i + 1;
    }
}
