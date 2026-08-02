package com.squareup.cash.deposits.physical.view.map;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import androidx.room.Room;
import androidx.tracing.Trace;
import com.google.mlkit.common.internal.zzd;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.bindings.component.ArcadeComponentProtoBindingKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.formview.components.arcade.ArcadeFormCellDefaultElementKt;
import com.squareup.cash.mooncake.compose_ui.ComposeUtilsKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.util.cash.StringsKt;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import squareup.cash.ui.arcade.elements.CellDefault;

/* loaded from: classes6.dex */
public final /* synthetic */ class AtmPmdExplainerViewKt$$ExternalSyntheticLambda7 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CellDefault f$0;

    public /* synthetic */ AtmPmdExplainerViewKt$$ExternalSyntheticLambda7(CellDefault cellDefault, int i) {
        this.$r8$classId = i;
        this.f$0 = cellDefault;
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x0158, code lost:
    
        if (r1 != null) goto L104;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0192  */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        String str;
        CellDefault.CellDefaultIcon.IconStyle iconStyle;
        CellDefault.CellDefaultIcon cellDefaultIcon;
        Color color;
        long j;
        CellDefault.CellDefaultIcon.IconStyle iconStyle2;
        CellDefault.CellDefaultIcon.TintedIcon value;
        CellDefault.CellDefaultIcon.IconStyle iconStyle3;
        int i = this.$r8$classId;
        CellDefault cellDefault = this.f$0;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    LocalizedString localizedString = cellDefault.label_text;
                    localizedString.getClass();
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, StringsKt.translated(localizedString), (Map) null, (Function1) null, false);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 1:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ArcadeComponentProtoBindingKt.translatedOrEmpty(cellDefault.label_text), (Map) null, (Function1) null, false);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                AtmPmdExplainerViewKt.CellDefault(cellDefault, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 3:
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    LocalizedString localizedString2 = cellDefault.body_text;
                    localizedString2.getClass();
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, StringsKt.translated(localizedString2), (Map) null, (Function1) null, false);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                break;
            case 4:
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(1 & intValue4, (intValue4 & 3) != 2)) {
                    CellDefault.CellDefaultIcon cellDefaultIcon2 = cellDefault.icon;
                    androidx.compose.ui.graphics.Color color2 = null;
                    if (cellDefaultIcon2 != null && (iconStyle3 = cellDefaultIcon2.icon_style) != null) {
                        CellDefault.CellDefaultIcon.IconStyle.TintedIcon tintedIcon = iconStyle3 instanceof CellDefault.CellDefaultIcon.IconStyle.TintedIcon ? (CellDefault.CellDefaultIcon.IconStyle.TintedIcon) iconStyle3 : null;
                        CellDefault.CellDefaultIcon.TintedIcon value2 = tintedIcon != null ? tintedIcon.getValue() : null;
                        if (value2 != null) {
                            Icon icon = value2.icon;
                            if (icon != null) {
                                str = icon.arcade_id;
                                break;
                            }
                        }
                    }
                    CellDefault.CellDefaultIcon cellDefaultIcon3 = cellDefault.icon;
                    if (cellDefaultIcon3 != null && (iconStyle = cellDefaultIcon3.icon_style) != null) {
                        CellDefault.CellDefaultIcon.IconStyle.Icon icon2 = iconStyle instanceof CellDefault.CellDefaultIcon.IconStyle.Icon ? (CellDefault.CellDefaultIcon.IconStyle.Icon) iconStyle : null;
                        Icon value3 = icon2 != null ? icon2.getValue() : null;
                        if (value3 != null) {
                            str = value3.arcade_id;
                            cellDefaultIcon = cellDefault.icon;
                            if (cellDefaultIcon != null && (iconStyle2 = cellDefaultIcon.icon_style) != null) {
                                CellDefault.CellDefaultIcon.IconStyle.TintedIcon tintedIcon2 = !(iconStyle2 instanceof CellDefault.CellDefaultIcon.IconStyle.TintedIcon) ? (CellDefault.CellDefaultIcon.IconStyle.TintedIcon) iconStyle2 : null;
                                value = tintedIcon2 == null ? tintedIcon2.getValue() : null;
                                if (value != null) {
                                    color = value.icon_tint_color;
                                    zzd zzdVar = Icons.Companion;
                                    str.getClass();
                                    zzdVar.getClass();
                                    Icons icons = zzd.get(str);
                                    icons.getClass();
                                    if (color == null) {
                                        gapComposer4.startReplaceGroup(1509943645);
                                    } else {
                                        gapComposer4.startReplaceGroup(602897188);
                                        color2 = ComposeUtilsKt.toComposeColor(color, gapComposer4);
                                    }
                                    gapComposer4.end(false);
                                    if (color2 == null) {
                                        gapComposer4.startReplaceGroup(602898299);
                                        j = ((androidx.compose.ui.graphics.Color) gapComposer4.consume(ArcadeThemeKt.LocalIconColor)).value;
                                        gapComposer4.end(false);
                                    } else {
                                        gapComposer4.startReplaceGroup(602897028);
                                        gapComposer4.end(false);
                                        j = color2.value;
                                    }
                                    Trace.m1191Iconww6aTOc(icons, (String) null, (Modifier) null, j, gapComposer4, 48, 4);
                                }
                            }
                            color = null;
                            zzd zzdVar2 = Icons.Companion;
                            str.getClass();
                            zzdVar2.getClass();
                            Icons icons2 = zzd.get(str);
                            icons2.getClass();
                            if (color == null) {
                            }
                            gapComposer4.end(false);
                            if (color2 == null) {
                            }
                            Trace.m1191Iconww6aTOc(icons2, (String) null, (Modifier) null, j, gapComposer4, 48, 4);
                        }
                    }
                    str = null;
                    cellDefaultIcon = cellDefault.icon;
                    if (cellDefaultIcon != null) {
                        if (!(iconStyle2 instanceof CellDefault.CellDefaultIcon.IconStyle.TintedIcon)) {
                        }
                        if (tintedIcon2 == null) {
                        }
                        if (value != null) {
                        }
                    }
                    color = null;
                    zzd zzdVar22 = Icons.Companion;
                    str.getClass();
                    zzdVar22.getClass();
                    Icons icons22 = zzd.get(str);
                    icons22.getClass();
                    if (color == null) {
                    }
                    gapComposer4.end(false);
                    if (color2 == null) {
                    }
                    Trace.m1191Iconww6aTOc(icons22, (String) null, (Modifier) null, j, gapComposer4, 48, 4);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                break;
            case 5:
                ((Integer) obj2).getClass();
                ArcadeFormCellDefaultElementKt.CellDefaultLabel(cellDefault, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                ArcadeFormCellDefaultElementKt.CellDefaultBody(cellDefault, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 7:
                Composer composer5 = (Composer) obj;
                int intValue5 = ((Integer) obj2).intValue();
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(1 & intValue5, (intValue5 & 3) != 2)) {
                    ArcadeFormCellDefaultElementKt.CellDefaultLabel(cellDefault, gapComposer5, 0);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                break;
            case 8:
                Composer composer6 = (Composer) obj;
                int intValue6 = ((Integer) obj2).intValue();
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (gapComposer6.shouldExecute(1 & intValue6, (intValue6 & 3) != 2)) {
                    ArcadeFormCellDefaultElementKt.CellDefaultBody(cellDefault, gapComposer6, 0);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                break;
            case 9:
                Composer composer7 = (Composer) obj;
                int intValue7 = ((Integer) obj2).intValue();
                GapComposer gapComposer7 = (GapComposer) composer7;
                if (gapComposer7.shouldExecute(1 & intValue7, (intValue7 & 3) != 2)) {
                    ArcadeFormCellDefaultElementKt.CellDefaultLabel(cellDefault, gapComposer7, 0);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                break;
            case 10:
                Composer composer8 = (Composer) obj;
                int intValue8 = ((Integer) obj2).intValue();
                GapComposer gapComposer8 = (GapComposer) composer8;
                if (gapComposer8.shouldExecute(1 & intValue8, (intValue8 & 3) != 2)) {
                    ArcadeFormCellDefaultElementKt.CellDefaultBody(cellDefault, gapComposer8, 0);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                break;
            case 11:
                Composer composer9 = (Composer) obj;
                int intValue9 = ((Integer) obj2).intValue();
                GapComposer gapComposer9 = (GapComposer) composer9;
                if (gapComposer9.shouldExecute(1 & intValue9, (intValue9 & 3) != 2)) {
                    ArcadeFormCellDefaultElementKt.CellDefaultLabel(cellDefault, gapComposer9, 0);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                break;
            default:
                Composer composer10 = (Composer) obj;
                int intValue10 = ((Integer) obj2).intValue();
                GapComposer gapComposer10 = (GapComposer) composer10;
                if (gapComposer10.shouldExecute(1 & intValue10, (intValue10 & 3) != 2)) {
                    ArcadeFormCellDefaultElementKt.CellDefaultBody(cellDefault, gapComposer10, 0);
                } else {
                    gapComposer10.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ AtmPmdExplainerViewKt$$ExternalSyntheticLambda7(CellDefault cellDefault, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = cellDefault;
    }
}
