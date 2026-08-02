package com.squareup.cash.db2.contacts;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.sqldelight.EnumColumnAdapter;
import app.cash.sqldelight.driver.android.AndroidCursor;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.ComponentRegistry;
import com.squareup.cash.boost.db.RewardSlotQueries;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.db.WireAdapter;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.api.Region;
import com.squareup.protos.franklin.common.SyncBusinessGrant;
import com.squareup.protos.franklin.ui.BlockState;
import com.squareup.protos.franklin.ui.MerchantData;
import kotlin.jvm.functions.Function1;
import retrofit2.OkHttpCall;

/* loaded from: classes6.dex */
public final /* synthetic */ class CustomerQueries$$ExternalSyntheticLambda7 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ RewardSlotQueries f$1;

    public /* synthetic */ CustomerQueries$$ExternalSyntheticLambda7(RewardSlotQueries rewardSlotQueries, int i) {
        this.$r8$classId = i;
        switch (i) {
            case 1:
                CustomerQueries$customerForPaymentToken$2 customerQueries$customerForPaymentToken$2 = CustomerQueries$customerForPaymentToken$2.INSTANCE;
                break;
            case 2:
                CustomerQueries$merchantsWithBusinessGrants$2 customerQueries$merchantsWithBusinessGrants$2 = CustomerQueries$merchantsWithBusinessGrants$2.INSTANCE;
                break;
            case 3:
                CustomerQueries$forIds$2 customerQueries$forIds$2 = CustomerQueries$forIds$2.INSTANCE;
                break;
            default:
                CustomerQueries$forId$2 customerQueries$forId$2 = CustomerQueries$forId$2.INSTANCE;
                break;
        }
        this.f$1 = rewardSlotQueries;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v11, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r10v34, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r10v70, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r11v12, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r11v39, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r11v5, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r12v1, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r12v3, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r12v4, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r9v15, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r9v2, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r9v7, types: [byte[], java.io.Serializable] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                CustomerQueries$forId$2 customerQueries$forId$2 = CustomerQueries$forId$2.INSTANCE;
                AndroidCursor androidCursor = (AndroidCursor) obj;
                androidCursor.getClass();
                String string2 = androidCursor.getString(0);
                String string3 = androidCursor.getString(1);
                Boolean bool = androidCursor.getBoolean(2);
                Boolean bool2 = androidCursor.getBoolean(3);
                String string4 = androidCursor.getString(4);
                string4.getClass();
                String string5 = androidCursor.getString(5);
                String string6 = androidCursor.getString(6);
                Boolean bool3 = androidCursor.getBoolean(7);
                Boolean m = Matcher$$ExternalSyntheticOutline0.m(bool3, androidCursor, 8);
                Boolean bool4 = androidCursor.getBoolean(9);
                bool4.getClass();
                String string7 = androidCursor.getString(10);
                String string8 = androidCursor.getString(11);
                ?? bytes = androidCursor.getBytes(12);
                RewardSlotQueries rewardSlotQueries = this.f$1;
                Image image = bytes != 0 ? (Image) ((WireAdapter) ((ComponentRegistry.Builder) rewardSlotQueries.rewardSlotAdapter).lazyFetcherFactories).decode(bytes) : null;
                String string9 = androidCursor.getString(13);
                String string10 = androidCursor.getString(14);
                String string11 = androidCursor.getString(15);
                Boolean bool5 = androidCursor.getBoolean(16);
                Boolean m2 = Matcher$$ExternalSyntheticOutline0.m(bool5, androidCursor, 17);
                Long l = androidCursor.getLong(18);
                l.getClass();
                ComponentRegistry.Builder builder = (ComponentRegistry.Builder) rewardSlotQueries.rewardSlotAdapter;
                Enum m3 = NavAction$$ExternalSyntheticOutline0.m(androidCursor, 19, (EnumColumnAdapter) builder.interceptors);
                ?? bytes2 = androidCursor.getBytes(20);
                MerchantData merchantData = bytes2 != 0 ? (MerchantData) ((WireAdapter) builder.mappers).decode(bytes2) : null;
                ?? bytes3 = androidCursor.getBytes(21);
                Color color = bytes3 != 0 ? (Color) ((WireAdapter) builder.lazyDecoderFactories).decode(bytes3) : null;
                String string12 = androidCursor.getString(22);
                Object[] objArr = {string2, string3, bool, bool2, string4, string5, string6, bool3, m, bool4, string7, string8, image, string9, string10, string11, bool5, m2, l, m3, merchantData, color, string12 != null ? (Region) ((EnumColumnAdapter) builder.keyers).decode(string12) : null, androidCursor.getString(23), androidCursor.getString(24), androidCursor.getString(25)};
                if (objArr.length != 26) {
                    a$$ExternalSyntheticBUOutline0.m$3("Expected 26 arguments");
                    break;
                } else {
                    String str = (String) objArr[0];
                    String str2 = (String) objArr[1];
                    Boolean bool6 = (Boolean) objArr[2];
                    Boolean bool7 = (Boolean) objArr[3];
                    String str3 = (String) objArr[4];
                    String str4 = (String) objArr[5];
                    String str5 = (String) objArr[6];
                    boolean booleanValue = ((Boolean) objArr[7]).booleanValue();
                    boolean booleanValue2 = ((Boolean) objArr[8]).booleanValue();
                    boolean booleanValue3 = ((Boolean) objArr[9]).booleanValue();
                    String str6 = (String) objArr[10];
                    String str7 = (String) objArr[11];
                    Image image2 = (Image) objArr[12];
                    String str8 = (String) objArr[13];
                    String str9 = (String) objArr[14];
                    String str10 = (String) objArr[15];
                    boolean booleanValue4 = ((Boolean) objArr[16]).booleanValue();
                    boolean booleanValue5 = ((Boolean) objArr[17]).booleanValue();
                    long longValue = ((Number) objArr[18]).longValue();
                    BlockState blockState = (BlockState) objArr[19];
                    MerchantData merchantData2 = (MerchantData) objArr[20];
                    Color color2 = (Color) objArr[21];
                    Region region = (Region) objArr[22];
                    String str11 = (String) objArr[23];
                    String str12 = (String) objArr[24];
                    String str13 = (String) objArr[25];
                    str3.getClass();
                    blockState.getClass();
                    break;
                }
            case 1:
                CustomerQueries$customerForPaymentToken$2 customerQueries$customerForPaymentToken$2 = CustomerQueries$customerForPaymentToken$2.INSTANCE;
                AndroidCursor androidCursor2 = (AndroidCursor) obj;
                androidCursor2.getClass();
                String string13 = androidCursor2.getString(0);
                String string14 = androidCursor2.getString(1);
                Boolean bool8 = androidCursor2.getBoolean(2);
                Boolean bool9 = androidCursor2.getBoolean(3);
                String string15 = androidCursor2.getString(4);
                string15.getClass();
                String string16 = androidCursor2.getString(5);
                String string17 = androidCursor2.getString(6);
                Boolean bool10 = androidCursor2.getBoolean(7);
                Boolean m4 = Matcher$$ExternalSyntheticOutline0.m(bool10, androidCursor2, 8);
                Boolean bool11 = androidCursor2.getBoolean(9);
                bool11.getClass();
                String string18 = androidCursor2.getString(10);
                String string19 = androidCursor2.getString(11);
                ?? bytes4 = androidCursor2.getBytes(12);
                RewardSlotQueries rewardSlotQueries2 = this.f$1;
                Image image3 = bytes4 != 0 ? (Image) ((WireAdapter) ((ComponentRegistry.Builder) rewardSlotQueries2.rewardSlotAdapter).lazyFetcherFactories).decode(bytes4) : null;
                String string20 = androidCursor2.getString(13);
                String string21 = androidCursor2.getString(14);
                String string22 = androidCursor2.getString(15);
                Boolean bool12 = androidCursor2.getBoolean(16);
                Boolean m5 = Matcher$$ExternalSyntheticOutline0.m(bool12, androidCursor2, 17);
                Long l2 = androidCursor2.getLong(18);
                l2.getClass();
                ComponentRegistry.Builder builder2 = (ComponentRegistry.Builder) rewardSlotQueries2.rewardSlotAdapter;
                Enum m6 = NavAction$$ExternalSyntheticOutline0.m(androidCursor2, 19, (EnumColumnAdapter) builder2.interceptors);
                ?? bytes5 = androidCursor2.getBytes(20);
                MerchantData merchantData3 = bytes5 != 0 ? (MerchantData) ((WireAdapter) builder2.mappers).decode(bytes5) : null;
                ?? bytes6 = androidCursor2.getBytes(21);
                Color color3 = bytes6 != 0 ? (Color) ((WireAdapter) builder2.lazyDecoderFactories).decode(bytes6) : null;
                String string23 = androidCursor2.getString(22);
                Object[] objArr2 = {string13, string14, bool8, bool9, string15, string16, string17, bool10, m4, bool11, string18, string19, image3, string20, string21, string22, bool12, m5, l2, m6, merchantData3, color3, string23 != null ? (Region) ((EnumColumnAdapter) builder2.keyers).decode(string23) : null, androidCursor2.getString(23), androidCursor2.getString(24), androidCursor2.getString(25)};
                if (objArr2.length != 26) {
                    a$$ExternalSyntheticBUOutline0.m$3("Expected 26 arguments");
                    break;
                } else {
                    String str14 = (String) objArr2[0];
                    String str15 = (String) objArr2[1];
                    Boolean bool13 = (Boolean) objArr2[2];
                    Boolean bool14 = (Boolean) objArr2[3];
                    String str16 = (String) objArr2[4];
                    String str17 = (String) objArr2[5];
                    String str18 = (String) objArr2[6];
                    boolean booleanValue6 = ((Boolean) objArr2[7]).booleanValue();
                    boolean booleanValue7 = ((Boolean) objArr2[8]).booleanValue();
                    boolean booleanValue8 = ((Boolean) objArr2[9]).booleanValue();
                    String str19 = (String) objArr2[10];
                    String str20 = (String) objArr2[11];
                    Image image4 = (Image) objArr2[12];
                    String str21 = (String) objArr2[13];
                    String str22 = (String) objArr2[14];
                    String str23 = (String) objArr2[15];
                    boolean booleanValue9 = ((Boolean) objArr2[16]).booleanValue();
                    boolean booleanValue10 = ((Boolean) objArr2[17]).booleanValue();
                    long longValue2 = ((Number) objArr2[18]).longValue();
                    BlockState blockState2 = (BlockState) objArr2[19];
                    MerchantData merchantData4 = (MerchantData) objArr2[20];
                    Color color4 = (Color) objArr2[21];
                    Region region2 = (Region) objArr2[22];
                    String str24 = (String) objArr2[23];
                    String str25 = (String) objArr2[24];
                    String str26 = (String) objArr2[25];
                    str16.getClass();
                    blockState2.getClass();
                    break;
                }
            case 2:
                CustomerQueries$merchantsWithBusinessGrants$2 customerQueries$merchantsWithBusinessGrants$2 = CustomerQueries$merchantsWithBusinessGrants$2.INSTANCE;
                AndroidCursor androidCursor3 = (AndroidCursor) obj;
                String m1431m = re$$ExternalSyntheticOutline0.m1431m(androidCursor3, 0);
                String string24 = androidCursor3.getString(1);
                String string25 = androidCursor3.getString(2);
                Boolean bool15 = androidCursor3.getBoolean(3);
                Boolean m7 = Matcher$$ExternalSyntheticOutline0.m(bool15, androidCursor3, 4);
                Boolean bool16 = androidCursor3.getBoolean(5);
                Boolean m8 = Matcher$$ExternalSyntheticOutline0.m(bool16, androidCursor3, 6);
                Boolean bool17 = androidCursor3.getBoolean(7);
                bool17.getClass();
                Long l3 = androidCursor3.getLong(8);
                String string26 = androidCursor3.getString(9);
                RewardSlotQueries rewardSlotQueries3 = this.f$1;
                ComponentRegistry.Builder builder3 = (ComponentRegistry.Builder) rewardSlotQueries3.rewardSlotAdapter;
                OkHttpCall.AnonymousClass1 anonymousClass1 = (OkHttpCall.AnonymousClass1) rewardSlotQueries3.rewardAdapter;
                Enum m9 = NavAction$$ExternalSyntheticOutline0.m(androidCursor3, 10, (EnumColumnAdapter) builder3.interceptors);
                String string27 = androidCursor3.getString(11);
                ?? bytes7 = androidCursor3.getBytes(12);
                MerchantData merchantData5 = bytes7 != 0 ? (MerchantData) ((WireAdapter) builder3.mappers).decode(bytes7) : null;
                String string28 = androidCursor3.getString(13);
                String string29 = androidCursor3.getString(14);
                String string30 = androidCursor3.getString(15);
                Region region3 = string30 != null ? (Region) ((EnumColumnAdapter) builder3.keyers).decode(string30) : null;
                Long l4 = androidCursor3.getLong(16);
                ?? bytes8 = androidCursor3.getBytes(17);
                Image image5 = bytes8 != 0 ? (Image) ((WireAdapter) builder3.lazyFetcherFactories).decode(bytes8) : null;
                ?? bytes9 = androidCursor3.getBytes(18);
                Color color5 = bytes9 != 0 ? (Color) ((WireAdapter) builder3.lazyDecoderFactories).decode(bytes9) : null;
                Boolean bool18 = androidCursor3.getBoolean(19);
                bool18.getClass();
                String string31 = androidCursor3.getString(20);
                string31.getClass();
                String string32 = androidCursor3.getString(21);
                String string33 = androidCursor3.getString(22);
                SyncBusinessGrant.ActionType actionType = string33 != null ? (SyncBusinessGrant.ActionType) ((EnumColumnAdapter) anonymousClass1.val$callback).decode(string33) : null;
                String string34 = androidCursor3.getString(23);
                String string35 = androidCursor3.getString(24);
                Object[] objArr3 = {m1431m, string24, string25, bool15, m7, bool16, m8, bool17, l3, string26, m9, string27, merchantData5, string28, string29, region3, l4, image5, color5, bool18, string31, string32, actionType, string34, string35 != null ? (SyncBusinessGrant.RenderingBehavior) ((EnumColumnAdapter) anonymousClass1.this$0).decode(string35) : null};
                if (objArr3.length != 25) {
                    a$$ExternalSyntheticBUOutline0.m$3("Expected 25 arguments");
                    break;
                } else {
                    String str27 = (String) objArr3[0];
                    String str28 = (String) objArr3[1];
                    String str29 = (String) objArr3[2];
                    boolean booleanValue11 = ((Boolean) objArr3[3]).booleanValue();
                    boolean booleanValue12 = ((Boolean) objArr3[4]).booleanValue();
                    boolean booleanValue13 = ((Boolean) objArr3[5]).booleanValue();
                    boolean booleanValue14 = ((Boolean) objArr3[6]).booleanValue();
                    boolean booleanValue15 = ((Boolean) objArr3[7]).booleanValue();
                    Long l5 = (Long) objArr3[8];
                    String str30 = (String) objArr3[9];
                    BlockState blockState3 = (BlockState) objArr3[10];
                    String str31 = (String) objArr3[11];
                    MerchantData merchantData6 = (MerchantData) objArr3[12];
                    String str32 = (String) objArr3[13];
                    String str33 = (String) objArr3[14];
                    Region region4 = (Region) objArr3[15];
                    Long l6 = (Long) objArr3[16];
                    Image image6 = (Image) objArr3[17];
                    Color color6 = (Color) objArr3[18];
                    boolean booleanValue16 = ((Boolean) objArr3[19]).booleanValue();
                    String str34 = (String) objArr3[20];
                    String str35 = (String) objArr3[21];
                    SyncBusinessGrant.ActionType actionType2 = (SyncBusinessGrant.ActionType) objArr3[22];
                    String str36 = (String) objArr3[23];
                    SyncBusinessGrant.RenderingBehavior renderingBehavior = (SyncBusinessGrant.RenderingBehavior) objArr3[24];
                    str27.getClass();
                    blockState3.getClass();
                    str34.getClass();
                    break;
                }
            default:
                CustomerQueries$forIds$2 customerQueries$forIds$2 = CustomerQueries$forIds$2.INSTANCE;
                ComponentRegistry.Builder builder4 = (ComponentRegistry.Builder) this.f$1.rewardSlotAdapter;
                AndroidCursor androidCursor4 = (AndroidCursor) obj;
                androidCursor4.getClass();
                String string36 = androidCursor4.getString(0);
                String string37 = androidCursor4.getString(1);
                Boolean bool19 = androidCursor4.getBoolean(2);
                Boolean bool20 = androidCursor4.getBoolean(3);
                String string38 = androidCursor4.getString(4);
                string38.getClass();
                String string39 = androidCursor4.getString(5);
                String string40 = androidCursor4.getString(6);
                Boolean bool21 = androidCursor4.getBoolean(7);
                Boolean m10 = Matcher$$ExternalSyntheticOutline0.m(bool21, androidCursor4, 8);
                Boolean bool22 = androidCursor4.getBoolean(9);
                bool22.getClass();
                String string41 = androidCursor4.getString(10);
                String string42 = androidCursor4.getString(11);
                ?? bytes10 = androidCursor4.getBytes(12);
                Image image7 = bytes10 != 0 ? (Image) ((WireAdapter) builder4.lazyFetcherFactories).decode(bytes10) : null;
                String string43 = androidCursor4.getString(13);
                String string44 = androidCursor4.getString(14);
                String string45 = androidCursor4.getString(15);
                Boolean bool23 = androidCursor4.getBoolean(16);
                Boolean m11 = Matcher$$ExternalSyntheticOutline0.m(bool23, androidCursor4, 17);
                Long l7 = androidCursor4.getLong(18);
                l7.getClass();
                Enum m12 = NavAction$$ExternalSyntheticOutline0.m(androidCursor4, 19, (EnumColumnAdapter) builder4.interceptors);
                ?? bytes11 = androidCursor4.getBytes(20);
                MerchantData merchantData7 = bytes11 != 0 ? (MerchantData) ((WireAdapter) builder4.mappers).decode(bytes11) : null;
                ?? bytes12 = androidCursor4.getBytes(21);
                Color color7 = bytes12 != 0 ? (Color) ((WireAdapter) builder4.lazyDecoderFactories).decode(bytes12) : null;
                String string46 = androidCursor4.getString(22);
                Object[] objArr4 = {string36, string37, bool19, bool20, string38, string39, string40, bool21, m10, bool22, string41, string42, image7, string43, string44, string45, bool23, m11, l7, m12, merchantData7, color7, string46 != null ? (Region) ((EnumColumnAdapter) builder4.keyers).decode(string46) : null, androidCursor4.getString(23), androidCursor4.getString(24), androidCursor4.getString(25)};
                if (objArr4.length != 26) {
                    a$$ExternalSyntheticBUOutline0.m$3("Expected 26 arguments");
                    break;
                } else {
                    String str37 = (String) objArr4[0];
                    String str38 = (String) objArr4[1];
                    Boolean bool24 = (Boolean) objArr4[2];
                    Boolean bool25 = (Boolean) objArr4[3];
                    String str39 = (String) objArr4[4];
                    String str40 = (String) objArr4[5];
                    String str41 = (String) objArr4[6];
                    boolean booleanValue17 = ((Boolean) objArr4[7]).booleanValue();
                    boolean booleanValue18 = ((Boolean) objArr4[8]).booleanValue();
                    boolean booleanValue19 = ((Boolean) objArr4[9]).booleanValue();
                    String str42 = (String) objArr4[10];
                    String str43 = (String) objArr4[11];
                    Image image8 = (Image) objArr4[12];
                    String str44 = (String) objArr4[13];
                    String str45 = (String) objArr4[14];
                    String str46 = (String) objArr4[15];
                    boolean booleanValue20 = ((Boolean) objArr4[16]).booleanValue();
                    boolean booleanValue21 = ((Boolean) objArr4[17]).booleanValue();
                    long longValue3 = ((Number) objArr4[18]).longValue();
                    BlockState blockState4 = (BlockState) objArr4[19];
                    MerchantData merchantData8 = (MerchantData) objArr4[20];
                    Color color8 = (Color) objArr4[21];
                    Region region5 = (Region) objArr4[22];
                    String str47 = (String) objArr4[23];
                    String str48 = (String) objArr4[24];
                    String str49 = (String) objArr4[25];
                    str39.getClass();
                    blockState4.getClass();
                    break;
                }
        }
        return null;
    }
}
