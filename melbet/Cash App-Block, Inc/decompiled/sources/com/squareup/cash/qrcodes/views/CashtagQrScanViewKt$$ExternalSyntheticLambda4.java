package com.squareup.cash.qrcodes.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.room.Room;
import androidx.room.TransactorKt;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.titlebar.TitleBarActionScope;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;

/* loaded from: classes7.dex */
public final /* synthetic */ class CashtagQrScanViewKt$$ExternalSyntheticLambda4 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CameraXPreviewState f$0;

    public /* synthetic */ CashtagQrScanViewKt$$ExternalSyntheticLambda4(CameraXPreviewState cameraXPreviewState, int i) {
        this.$r8$classId = i;
        this.f$0 = cameraXPreviewState;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Pair pair;
        Pair pair2;
        Pair pair3;
        int i = this.$r8$classId;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        final CameraXPreviewState cameraXPreviewState = this.f$0;
        final int i2 = 2;
        final int i3 = 0;
        switch (i) {
            case 0:
                TitleBarActionScope titleBarActionScope = (TitleBarActionScope) obj;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                titleBarActionScope.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((GapComposer) composer).changed(titleBarActionScope) ? 4 : 2;
                }
                GapComposer gapComposer = (GapComposer) composer;
                if (!gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                    gapComposer.skipToGroupEnd();
                } else if (cameraXPreviewState.getFlashAvailable()) {
                    gapComposer.startReplaceGroup(-744862435);
                    if (cameraXPreviewState.getFlashEnabled()) {
                        gapComposer.startReplaceGroup(-744793522);
                        pair = new Pair(Icons.FlashlightFill24, Room.stringResource(gapComposer, R.string.flash_off_content_description));
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(-744667848);
                        pair = new Pair(Icons.FlashlightOffFill24, Room.stringResource(gapComposer, R.string.flash_on_content_description));
                        gapComposer.end(false);
                    }
                    Icons icons = (Icons) pair.first;
                    String str = (String) pair.second;
                    boolean changed = gapComposer.changed(cameraXPreviewState);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changed || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new Function0() { // from class: com.squareup.cash.qrcodes.views.CashtagQrScanViewKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i4 = i3;
                                CameraXPreviewState cameraXPreviewState2 = cameraXPreviewState;
                                switch (i4) {
                                    case 0:
                                        cameraXPreviewState2.flashEnabled$delegate.setValue(Boolean.valueOf(!cameraXPreviewState2.getFlashEnabled()));
                                        break;
                                    case 1:
                                        cameraXPreviewState2.flashEnabled$delegate.setValue(Boolean.valueOf(!cameraXPreviewState2.getFlashEnabled()));
                                        break;
                                    default:
                                        cameraXPreviewState2.flashEnabled$delegate.setValue(Boolean.valueOf(!cameraXPreviewState2.getFlashEnabled()));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    TransactorKt.IconAction(titleBarActionScope, icons, str, (Function0) rememberedValue, null, null, null, null, null, null, false, gapComposer, intValue & 14, IptcConstants.IMAGE_RESOURCE_BLOCK_COLOR_TRANSFER_FUNCS);
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(-744331002);
                    gapComposer.end(false);
                }
                break;
            case 1:
                TitleBarActionScope titleBarActionScope2 = (TitleBarActionScope) obj;
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                titleBarActionScope2.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((GapComposer) composer2).changed(titleBarActionScope2) ? 4 : 2;
                }
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (!gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 19) != 18)) {
                    gapComposer2.skipToGroupEnd();
                } else if (cameraXPreviewState.getFlashAvailable()) {
                    gapComposer2.startReplaceGroup(1343013931);
                    if (cameraXPreviewState.getFlashEnabled()) {
                        gapComposer2.startReplaceGroup(1343082844);
                        pair2 = new Pair(Icons.FlashlightFill24, Room.stringResource(gapComposer2, R.string.flash_off_content_description));
                        gapComposer2.end(false);
                    } else {
                        gapComposer2.startReplaceGroup(1343208518);
                        pair2 = new Pair(Icons.FlashlightOffFill24, Room.stringResource(gapComposer2, R.string.flash_on_content_description));
                        gapComposer2.end(false);
                    }
                    Icons icons2 = (Icons) pair2.first;
                    String str2 = (String) pair2.second;
                    boolean changed2 = gapComposer2.changed(cameraXPreviewState);
                    Object rememberedValue2 = gapComposer2.rememberedValue();
                    if (changed2 || rememberedValue2 == neverEqualPolicy) {
                        final int i4 = r9 ? 1 : 0;
                        rememberedValue2 = new Function0() { // from class: com.squareup.cash.qrcodes.views.CashtagQrScanViewKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i42 = i4;
                                CameraXPreviewState cameraXPreviewState2 = cameraXPreviewState;
                                switch (i42) {
                                    case 0:
                                        cameraXPreviewState2.flashEnabled$delegate.setValue(Boolean.valueOf(!cameraXPreviewState2.getFlashEnabled()));
                                        break;
                                    case 1:
                                        cameraXPreviewState2.flashEnabled$delegate.setValue(Boolean.valueOf(!cameraXPreviewState2.getFlashEnabled()));
                                        break;
                                    default:
                                        cameraXPreviewState2.flashEnabled$delegate.setValue(Boolean.valueOf(!cameraXPreviewState2.getFlashEnabled()));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        gapComposer2.updateRememberedValue(rememberedValue2);
                    }
                    TransactorKt.IconAction(titleBarActionScope2, icons2, str2, (Function0) rememberedValue2, null, null, null, null, null, null, false, gapComposer2, intValue2 & 14, IptcConstants.IMAGE_RESOURCE_BLOCK_COLOR_TRANSFER_FUNCS);
                    gapComposer2.end(false);
                } else {
                    gapComposer2.startReplaceGroup(1343545364);
                    gapComposer2.end(false);
                }
                break;
            default:
                TitleBarActionScope titleBarActionScope3 = (TitleBarActionScope) obj;
                Composer composer3 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                titleBarActionScope3.getClass();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= ((GapComposer) composer3).changed(titleBarActionScope3) ? 4 : 2;
                }
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (!gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 19) != 18)) {
                    gapComposer3.skipToGroupEnd();
                } else if (cameraXPreviewState.getFlashAvailable()) {
                    gapComposer3.startReplaceGroup(1852488049);
                    if (cameraXPreviewState.getFlashEnabled()) {
                        gapComposer3.startReplaceGroup(1852556807);
                        pair3 = new Pair(Icons.FlashlightFill24, Room.stringResource(gapComposer3, R.string.flash_off_content_description));
                        gapComposer3.end(false);
                    } else {
                        gapComposer3.startReplaceGroup(1852706661);
                        pair3 = new Pair(Icons.FlashlightOffFill24, Room.stringResource(gapComposer3, R.string.flash_on_content_description));
                        gapComposer3.end(false);
                    }
                    Icons icons3 = (Icons) pair3.first;
                    String str3 = (String) pair3.second;
                    boolean changed3 = gapComposer3.changed(cameraXPreviewState);
                    Object rememberedValue3 = gapComposer3.rememberedValue();
                    if (changed3 || rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new Function0() { // from class: com.squareup.cash.qrcodes.views.CashtagQrScanViewKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i42 = i2;
                                CameraXPreviewState cameraXPreviewState2 = cameraXPreviewState;
                                switch (i42) {
                                    case 0:
                                        cameraXPreviewState2.flashEnabled$delegate.setValue(Boolean.valueOf(!cameraXPreviewState2.getFlashEnabled()));
                                        break;
                                    case 1:
                                        cameraXPreviewState2.flashEnabled$delegate.setValue(Boolean.valueOf(!cameraXPreviewState2.getFlashEnabled()));
                                        break;
                                    default:
                                        cameraXPreviewState2.flashEnabled$delegate.setValue(Boolean.valueOf(!cameraXPreviewState2.getFlashEnabled()));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        gapComposer3.updateRememberedValue(rememberedValue3);
                    }
                    TransactorKt.IconAction(titleBarActionScope3, icons3, str3, (Function0) rememberedValue3, null, null, null, null, null, null, false, gapComposer3, intValue3 & 14, IptcConstants.IMAGE_RESOURCE_BLOCK_COLOR_TRANSFER_FUNCS);
                    gapComposer3.end(false);
                } else {
                    gapComposer3.startReplaceGroup(1853048312);
                    gapComposer3.end(false);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
