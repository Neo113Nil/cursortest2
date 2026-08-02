package com.squareup.cash.formview.components.arcade;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import androidx.room.Room;
import coil3.compose.LocalImageLoaderKt;
import com.squareup.cash.arcade.components.CheckboxKt;
import com.squareup.cash.arcade.components.cell.CellDefaultAccessory;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.family.familyhub.views.FamilyMemberRowKt$$ExternalSyntheticLambda5;
import com.squareup.cash.formview.components.arcade.ArcadeFormCheckBoxView;
import com.squareup.cash.gps.db.GpsConfigQueries$$ExternalSyntheticLambda2;
import com.squareup.protos.franklin.api.FormBlocker;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class ArcadeFormCheckBoxView$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ArcadeFormCheckBoxView f$0;

    public /* synthetic */ ArcadeFormCheckBoxView$$ExternalSyntheticLambda0(ArcadeFormCheckBoxView arcadeFormCheckBoxView, int i) {
        this.$r8$classId = i;
        this.f$0 = arcadeFormCheckBoxView;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = 4;
        Object obj3 = Composer.Companion.Empty;
        ArcadeFormCheckBoxView arcadeFormCheckBoxView = this.f$0;
        int i3 = 1;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(arcadeFormCheckBoxView.imageLoader), Expect_jvmKt.rememberComposableLambda(-597516807, new ArcadeFormCheckBoxView$$ExternalSyntheticLambda0(arcadeFormCheckBoxView, i2), gapComposer), gapComposer, 56);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    String str = arcadeFormCheckBoxView.element.text;
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str == null ? "" : str, (Map) null, (Function1) null, false);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                arcadeFormCheckBoxView.CheckboxAvatar((Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                arcadeFormCheckBoxView.Content((Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 4:
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    FormBlocker.Element.CheckBoxElement checkBoxElement = arcadeFormCheckBoxView.element;
                    FormBlocker.Element.CheckBoxElement.Style style = checkBoxElement.style;
                    int i4 = style == null ? -1 : ArcadeFormCheckBoxView.WhenMappings.$EnumSwitchMapping$0[style.ordinal()];
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    ComposableLambdaImpl composableLambdaImpl = null;
                    if (i4 == -1 || i4 == 1 || i4 == 2) {
                        gapComposer3.startReplaceGroup(2016363625);
                        Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                        String str2 = checkBoxElement.body_text;
                        if (str2 == null) {
                            gapComposer3.startReplaceGroup(2016553716);
                        } else {
                            gapComposer3.startReplaceGroup(2016553717);
                            composableLambdaImpl = Expect_jvmKt.rememberComposableLambda(-1535141069, new FamilyMemberRowKt$$ExternalSyntheticLambda5(str2, 14), gapComposer3);
                        }
                        gapComposer3.end(false);
                        ComposableLambdaImpl composableLambdaImpl2 = composableLambdaImpl;
                        CellDefaultAccessory toggle = checkBoxElement.style == FormBlocker.Element.CheckBoxElement.Style.TOGGLE ? new CellDefaultAccessory.Toggle(arcadeFormCheckBoxView.isChecked$1()) : new CellDefaultAccessory.Checkbox(arcadeFormCheckBoxView.isChecked$1());
                        boolean z = (checkBoxElement.image == null && checkBoxElement.avatar == null) ? false : true;
                        ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(1542022419, new ArcadeFormCheckBoxView$$ExternalSyntheticLambda0(arcadeFormCheckBoxView, 5), gapComposer3);
                        ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(85609364, new ArcadeFormCheckBoxView$$ExternalSyntheticLambda0(arcadeFormCheckBoxView, 6), gapComposer3);
                        boolean changedInstance = gapComposer3.changedInstance(arcadeFormCheckBoxView);
                        Object rememberedValue = gapComposer3.rememberedValue();
                        if (changedInstance || rememberedValue == obj3) {
                            rememberedValue = new ArcadeFormCheckBoxView$$ExternalSyntheticLambda2(arcadeFormCheckBoxView, 1);
                            gapComposer3.updateRememberedValue(rememberedValue);
                        }
                        CellDefaultKt.m3392CellDefaultLargeIconygcbOzY(rememberComposableLambda, rememberComposableLambda2, fillMaxWidth, (Function0) rememberedValue, null, false, z, composableLambdaImpl2, null, toggle, 0L, null, gapComposer3, 438, 0, 3376);
                        gapComposer3.end(false);
                    } else {
                        if (i4 != 3) {
                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer3, 1311967672, false);
                        }
                        gapComposer3.startReplaceGroup(2017033752);
                        Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion, 1.0f);
                        String str3 = checkBoxElement.body_text;
                        if (str3 == null) {
                            gapComposer3.startReplaceGroup(2017415764);
                        } else {
                            gapComposer3.startReplaceGroup(2017415765);
                            composableLambdaImpl = Expect_jvmKt.rememberComposableLambda(573092663, new FamilyMemberRowKt$$ExternalSyntheticLambda5(str3, 15), gapComposer3);
                        }
                        gapComposer3.end(false);
                        CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(Expect_jvmKt.rememberComposableLambda(1537736520, new ArcadeFormCheckBoxView$$ExternalSyntheticLambda0(arcadeFormCheckBoxView, 7), gapComposer3), Expect_jvmKt.rememberComposableLambda(2084129161, new ArcadeFormCheckBoxView$$ExternalSyntheticLambda0(arcadeFormCheckBoxView, i3), gapComposer3), fillMaxWidth2, null, false, false, composableLambdaImpl, null, null, 0L, gapComposer3, 438, 3960);
                        gapComposer3.end(false);
                    }
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 5:
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                    arcadeFormCheckBoxView.CheckboxAvatar(gapComposer4, 0);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 6:
                Composer composer5 = (Composer) obj;
                int intValue5 = ((Integer) obj2).intValue();
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2)) {
                    String str4 = arcadeFormCheckBoxView.element.text;
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str4 == null ? "" : str4, (Map) null, (Function1) null, false);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                Composer composer6 = (Composer) obj;
                int intValue6 = ((Integer) obj2).intValue();
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 3) != 2)) {
                    boolean isChecked$1 = arcadeFormCheckBoxView.isChecked$1();
                    boolean changedInstance2 = gapComposer6.changedInstance(arcadeFormCheckBoxView);
                    Object rememberedValue2 = gapComposer6.rememberedValue();
                    if (changedInstance2 || rememberedValue2 == obj3) {
                        rememberedValue2 = new GpsConfigQueries$$ExternalSyntheticLambda2(arcadeFormCheckBoxView, 4);
                        gapComposer6.updateRememberedValue(rememberedValue2);
                    }
                    CheckboxKt.UnlabeledCheckbox(isChecked$1, (Function1) rememberedValue2, null, null, true, gapComposer6, 24576, 12);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ ArcadeFormCheckBoxView$$ExternalSyntheticLambda0(ArcadeFormCheckBoxView arcadeFormCheckBoxView, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = arcadeFormCheckBoxView;
    }
}
