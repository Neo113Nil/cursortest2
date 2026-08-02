package com.squareup.cash.boost.db;

import app.cash.sqldelight.driver.android.AndroidCursor;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.db.WireAdapter;
import com.squareup.cash.db.WireRepeatedAdapter;
import com.squareup.protos.franklin.ui.RewardSelection;
import com.squareup.protos.rewardly.ui.AppLinks;
import com.squareup.protos.rewardly.ui.UiRewardAvatars;
import com.squareup.protos.rewardly.ui.UiRewardProgramDetails;
import com.squareup.protos.rewardly.ui.UiRewardSelectionState;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class SelectableRewardQueries$$ExternalSyntheticLambda3 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ RewardQueries f$1;

    public /* synthetic */ SelectableRewardQueries$$ExternalSyntheticLambda3(RewardQueries rewardQueries, int i) {
        this.$r8$classId = i;
        switch (i) {
            case 1:
                SelectableRewardQueries$rewards$2 selectableRewardQueries$rewards$2 = SelectableRewardQueries$rewards$2.INSTANCE;
                break;
            default:
                SelectableRewardQueries$rewardsExcept$2 selectableRewardQueries$rewardsExcept$2 = SelectableRewardQueries$rewardsExcept$2.INSTANCE;
                break;
        }
        this.f$1 = rewardQueries;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v39, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r1v4, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r6v16, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r6v3, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r6v4, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r6v42, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r6v43, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r6v44, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r6v5, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r6v55, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r7v1, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r7v14, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r7v15, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r7v16, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r7v2, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r7v3, types: [byte[], java.io.Serializable] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                SelectableRewardQueries$rewardsExcept$2 selectableRewardQueries$rewardsExcept$2 = SelectableRewardQueries$rewardsExcept$2.INSTANCE;
                AndroidCursor androidCursor = (AndroidCursor) obj;
                String m1431m = re$$ExternalSyntheticOutline0.m1431m(androidCursor, 0);
                String string2 = androidCursor.getString(1);
                ?? bytes = androidCursor.getBytes(2);
                RewardQueries rewardQueries = this.f$1;
                UiRewardAvatars uiRewardAvatars = bytes != 0 ? (UiRewardAvatars) ((WireAdapter) rewardQueries.rewardAdapter.avatarsAdapter).decode(bytes) : null;
                String string3 = androidCursor.getString(3);
                String string4 = androidCursor.getString(4);
                ?? bytes2 = androidCursor.getBytes(5);
                List list = bytes2 != 0 ? (List) ((WireRepeatedAdapter) rewardQueries.rewardAdapter.program_detail_rowsAdapter).decode(bytes2) : null;
                String string5 = androidCursor.getString(6);
                ?? bytes3 = androidCursor.getBytes(7);
                List list2 = bytes3 != 0 ? (List) ((WireRepeatedAdapter) rewardQueries.rewardAdapter.boost_detail_rowsAdapter).decode(bytes3) : null;
                ?? bytes4 = androidCursor.getBytes(8);
                List list3 = bytes4 != 0 ? (List) ((WireRepeatedAdapter) rewardQueries.rewardAdapter.boost_attributesAdapter).decode(bytes4) : null;
                String string6 = androidCursor.getString(9);
                Long l = androidCursor.getLong(10);
                Long l2 = androidCursor.getLong(11);
                String string7 = androidCursor.getString(12);
                ?? bytes5 = androidCursor.getBytes(13);
                UiRewardSelectionState uiRewardSelectionState = bytes5 != 0 ? (UiRewardSelectionState) ((WireAdapter) rewardQueries.rewardAdapter.reward_selection_stateAdapter).decode(bytes5) : null;
                Boolean bool = androidCursor.getBoolean(14);
                bool.getClass();
                String string8 = androidCursor.getString(15);
                String string9 = androidCursor.getString(16);
                String string10 = androidCursor.getString(17);
                Boolean bool2 = androidCursor.getBoolean(18);
                bool2.getClass();
                ?? bytes6 = androidCursor.getBytes(19);
                UiRewardProgramDetails.BottomUpsell bottomUpsell = bytes6 != 0 ? (UiRewardProgramDetails.BottomUpsell) ((WireAdapter) rewardQueries.rewardAdapter.boost_detail_bottom_upsellAdapter).decode(bytes6) : null;
                Boolean bool3 = androidCursor.getBoolean(20);
                Boolean m = Matcher$$ExternalSyntheticOutline0.m(bool3, androidCursor, 21);
                ?? bytes7 = androidCursor.getBytes(22);
                AppLinks appLinks = bytes7 != 0 ? (AppLinks) ((WireAdapter) rewardQueries.rewardAdapter.app_linksAdapter).decode(bytes7) : null;
                ?? bytes8 = androidCursor.getBytes(23);
                Object[] objArr = {m1431m, string2, uiRewardAvatars, string3, string4, list, string5, list2, list3, string6, l, l2, string7, uiRewardSelectionState, bool, string8, string9, string10, bool2, bottomUpsell, bool3, m, appLinks, bytes8 != 0 ? (RewardSelection) rewardQueries.rewardSelectionAdapter.target_balance_amountAdapter.decode(bytes8) : null};
                if (objArr.length != 24) {
                    a$$ExternalSyntheticBUOutline0.m$3("Expected 24 arguments");
                    break;
                } else {
                    String str = (String) objArr[0];
                    String str2 = (String) objArr[1];
                    UiRewardAvatars uiRewardAvatars2 = (UiRewardAvatars) objArr[2];
                    String str3 = (String) objArr[3];
                    String str4 = (String) objArr[4];
                    List list4 = (List) objArr[5];
                    String str5 = (String) objArr[6];
                    List list5 = (List) objArr[7];
                    List list6 = (List) objArr[8];
                    String str6 = (String) objArr[9];
                    Long l3 = (Long) objArr[10];
                    Long l4 = (Long) objArr[11];
                    String str7 = (String) objArr[12];
                    UiRewardSelectionState uiRewardSelectionState2 = (UiRewardSelectionState) objArr[13];
                    boolean booleanValue = ((Boolean) objArr[14]).booleanValue();
                    String str8 = (String) objArr[15];
                    String str9 = (String) objArr[16];
                    String str10 = (String) objArr[17];
                    boolean booleanValue2 = ((Boolean) objArr[18]).booleanValue();
                    UiRewardProgramDetails.BottomUpsell bottomUpsell2 = (UiRewardProgramDetails.BottomUpsell) objArr[19];
                    boolean booleanValue3 = ((Boolean) objArr[20]).booleanValue();
                    boolean booleanValue4 = ((Boolean) objArr[21]).booleanValue();
                    AppLinks appLinks2 = (AppLinks) objArr[22];
                    RewardSelection rewardSelection = (RewardSelection) objArr[23];
                    str.getClass();
                    break;
                }
            default:
                SelectableRewardQueries$rewards$2 selectableRewardQueries$rewards$2 = SelectableRewardQueries$rewards$2.INSTANCE;
                RewardQueries rewardQueries2 = this.f$1;
                Reward$Adapter reward$Adapter = rewardQueries2.rewardAdapter;
                AndroidCursor androidCursor2 = (AndroidCursor) obj;
                String m1431m2 = re$$ExternalSyntheticOutline0.m1431m(androidCursor2, 0);
                String string11 = androidCursor2.getString(1);
                ?? bytes9 = androidCursor2.getBytes(2);
                UiRewardAvatars uiRewardAvatars3 = bytes9 != 0 ? (UiRewardAvatars) ((WireAdapter) reward$Adapter.avatarsAdapter).decode(bytes9) : null;
                String string12 = androidCursor2.getString(3);
                String string13 = androidCursor2.getString(4);
                ?? bytes10 = androidCursor2.getBytes(5);
                List list7 = bytes10 != 0 ? (List) ((WireRepeatedAdapter) reward$Adapter.program_detail_rowsAdapter).decode(bytes10) : null;
                String string14 = androidCursor2.getString(6);
                ?? bytes11 = androidCursor2.getBytes(7);
                List list8 = bytes11 != 0 ? (List) ((WireRepeatedAdapter) reward$Adapter.boost_detail_rowsAdapter).decode(bytes11) : null;
                ?? bytes12 = androidCursor2.getBytes(8);
                List list9 = bytes12 != 0 ? (List) ((WireRepeatedAdapter) reward$Adapter.boost_attributesAdapter).decode(bytes12) : null;
                String string15 = androidCursor2.getString(9);
                Long l5 = androidCursor2.getLong(10);
                Long l6 = androidCursor2.getLong(11);
                String string16 = androidCursor2.getString(12);
                ?? bytes13 = androidCursor2.getBytes(13);
                UiRewardSelectionState uiRewardSelectionState3 = bytes13 != 0 ? (UiRewardSelectionState) ((WireAdapter) reward$Adapter.reward_selection_stateAdapter).decode(bytes13) : null;
                Boolean bool4 = androidCursor2.getBoolean(14);
                bool4.getClass();
                String string17 = androidCursor2.getString(15);
                String string18 = androidCursor2.getString(16);
                String string19 = androidCursor2.getString(17);
                Boolean bool5 = androidCursor2.getBoolean(18);
                bool5.getClass();
                ?? bytes14 = androidCursor2.getBytes(19);
                UiRewardProgramDetails.BottomUpsell bottomUpsell3 = bytes14 != 0 ? (UiRewardProgramDetails.BottomUpsell) ((WireAdapter) reward$Adapter.boost_detail_bottom_upsellAdapter).decode(bytes14) : null;
                Boolean bool6 = androidCursor2.getBoolean(20);
                Boolean m2 = Matcher$$ExternalSyntheticOutline0.m(bool6, androidCursor2, 21);
                ?? bytes15 = androidCursor2.getBytes(22);
                AppLinks appLinks3 = bytes15 != 0 ? (AppLinks) ((WireAdapter) reward$Adapter.app_linksAdapter).decode(bytes15) : null;
                ?? bytes16 = androidCursor2.getBytes(23);
                Object[] objArr2 = {m1431m2, string11, uiRewardAvatars3, string12, string13, list7, string14, list8, list9, string15, l5, l6, string16, uiRewardSelectionState3, bool4, string17, string18, string19, bool5, bottomUpsell3, bool6, m2, appLinks3, bytes16 != 0 ? (RewardSelection) rewardQueries2.rewardSelectionAdapter.target_balance_amountAdapter.decode(bytes16) : null};
                if (objArr2.length != 24) {
                    a$$ExternalSyntheticBUOutline0.m$3("Expected 24 arguments");
                    break;
                } else {
                    String str11 = (String) objArr2[0];
                    String str12 = (String) objArr2[1];
                    UiRewardAvatars uiRewardAvatars4 = (UiRewardAvatars) objArr2[2];
                    String str13 = (String) objArr2[3];
                    String str14 = (String) objArr2[4];
                    List list10 = (List) objArr2[5];
                    String str15 = (String) objArr2[6];
                    List list11 = (List) objArr2[7];
                    List list12 = (List) objArr2[8];
                    String str16 = (String) objArr2[9];
                    Long l7 = (Long) objArr2[10];
                    Long l8 = (Long) objArr2[11];
                    String str17 = (String) objArr2[12];
                    UiRewardSelectionState uiRewardSelectionState4 = (UiRewardSelectionState) objArr2[13];
                    boolean booleanValue5 = ((Boolean) objArr2[14]).booleanValue();
                    String str18 = (String) objArr2[15];
                    String str19 = (String) objArr2[16];
                    String str20 = (String) objArr2[17];
                    boolean booleanValue6 = ((Boolean) objArr2[18]).booleanValue();
                    UiRewardProgramDetails.BottomUpsell bottomUpsell4 = (UiRewardProgramDetails.BottomUpsell) objArr2[19];
                    boolean booleanValue7 = ((Boolean) objArr2[20]).booleanValue();
                    boolean booleanValue8 = ((Boolean) objArr2[21]).booleanValue();
                    AppLinks appLinks4 = (AppLinks) objArr2[22];
                    RewardSelection rewardSelection2 = (RewardSelection) objArr2[23];
                    str11.getClass();
                    break;
                }
        }
        return null;
    }
}
