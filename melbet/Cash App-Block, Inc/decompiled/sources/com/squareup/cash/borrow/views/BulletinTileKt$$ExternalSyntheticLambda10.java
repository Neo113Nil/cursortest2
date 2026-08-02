package com.squareup.cash.borrow.views;

import androidx.compose.foundation.text.InlineTextContent;
import androidx.compose.foundation.text.KeyMappingKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.TextStyle;
import androidx.room.Room;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.lending.sync_values.BorrowAppletBulletinsTile;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final /* synthetic */ class BulletinTileKt$$ExternalSyntheticLambda10 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ BorrowAppletBulletinsTile.Data.Bulletin f$0;

    public /* synthetic */ BulletinTileKt$$ExternalSyntheticLambda10(BorrowAppletBulletinsTile.Data.Bulletin bulletin, int i) {
        this.$r8$classId = 3;
        this.f$0 = bulletin;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        BorrowAppletBulletinsTile.Data.Bulletin bulletin = this.f$0;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                    BorrowHomeKt.BulletinGraphic(bulletin, gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 1:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    AnnotatedString.Builder builder = new AnnotatedString.Builder();
                    LocalizedString localizedString = bulletin.primary_text;
                    localizedString.getClass();
                    String str = localizedString.translated_value;
                    str.getClass();
                    builder.append(str);
                    BorrowAppletBulletinsTile.Data.Bulletin.Accessory accessory = bulletin.accessory;
                    if ((accessory == null ? -1 : BulletinTileKt$WhenMappings.$EnumSwitchMapping$0[accessory.ordinal()]) == 1) {
                        builder.append(" ");
                        KeyMappingKt.appendInlineContent(builder, "<info_icon>", "�");
                    }
                    Room.m1164Text25TpFw(0, 0, 0, 0, 0, 0, 2046, 0L, (Composer) gapComposer2, (Modifier) null, builder.toAnnotatedString(), (TextStyle) null, (TextLineBalancing) null, MapsKt__MapsJVMKt.mapOf(new Pair("<info_icon>", new InlineTextContent(new Placeholder(7, Room.getSp(16), Room.getSp(16)), BorrowHomeKt.f322lambda$1821133503))), (Function1) null, false);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
            case 2:
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    LocalizedString localizedString2 = bulletin.detail_text;
                    localizedString2.getClass();
                    String str2 = localizedString2.translated_value;
                    str2.getClass();
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                BorrowHomeKt.BulletinGraphic(bulletin, (Composer) obj, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ BulletinTileKt$$ExternalSyntheticLambda10(BorrowAppletBulletinsTile.Data.Bulletin bulletin, int i, byte b) {
        this.$r8$classId = i;
        this.f$0 = bulletin;
    }
}
