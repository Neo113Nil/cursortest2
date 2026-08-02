package com.squareup.cash.db2.contacts;

import app.cash.sqldelight.EnumColumnAdapter;
import app.cash.sqldelight.driver.android.AndroidCursor;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.data.contacts.RealContactRepository$contactByAlias$1;
import com.squareup.cash.data.contacts.RealContactRepository$contactById$1;
import com.squareup.cash.data.contacts.RealContactRepository$contacts$1;
import com.squareup.cash.db.WireAdapter;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.api.Region;
import com.squareup.protos.franklin.ui.BlockState;
import com.squareup.protos.franklin.ui.MerchantData;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class ContactQueries$$ExternalSyntheticLambda2 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ContactQueries f$1;

    public /* synthetic */ ContactQueries$$ExternalSyntheticLambda2(ContactQueries contactQueries, int i) {
        this.$r8$classId = i;
        switch (i) {
            case 1:
                RealContactRepository$contactById$1 realContactRepository$contactById$1 = RealContactRepository$contactById$1.INSTANCE;
                break;
            case 2:
                RealContactRepository$contactByAlias$1 realContactRepository$contactByAlias$1 = RealContactRepository$contactByAlias$1.INSTANCE;
                break;
            default:
                RealContactRepository$contacts$1 realContactRepository$contacts$1 = RealContactRepository$contacts$1.INSTANCE;
                break;
        }
        this.f$1 = contactQueries;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r10v10, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r10v25, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r10v34, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r10v55, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r11v11, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r11v2, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r11v7, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r9v22, types: [byte[], java.io.Serializable] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                RealContactRepository$contacts$1 realContactRepository$contacts$1 = RealContactRepository$contacts$1.INSTANCE;
                AndroidCursor androidCursor = (AndroidCursor) obj;
                androidCursor.getClass();
                String string2 = androidCursor.getString(0);
                String string3 = androidCursor.getString(1);
                Boolean bool = androidCursor.getBoolean(2);
                Boolean m = Matcher$$ExternalSyntheticOutline0.m(bool, androidCursor, 3);
                String string4 = androidCursor.getString(4);
                String string5 = androidCursor.getString(5);
                String string6 = androidCursor.getString(6);
                Boolean bool2 = androidCursor.getBoolean(7);
                Boolean m2 = Matcher$$ExternalSyntheticOutline0.m(bool2, androidCursor, 8);
                Boolean bool3 = androidCursor.getBoolean(9);
                bool3.getClass();
                String string7 = androidCursor.getString(10);
                String string8 = androidCursor.getString(11);
                ?? bytes = androidCursor.getBytes(12);
                ContactQueries contactQueries = this.f$1;
                Image image = bytes != 0 ? (Image) ((WireAdapter) contactQueries.customerAdapter.lazyFetcherFactories).decode(bytes) : null;
                String string9 = androidCursor.getString(13);
                String string10 = androidCursor.getString(14);
                String string11 = androidCursor.getString(15);
                Boolean bool4 = androidCursor.getBoolean(16);
                Boolean m3 = Matcher$$ExternalSyntheticOutline0.m(bool4, androidCursor, 17);
                Long l = androidCursor.getLong(18);
                l.getClass();
                String string12 = androidCursor.getString(19);
                BlockState blockState = string12 != null ? (BlockState) ((EnumColumnAdapter) contactQueries.customerAdapter.interceptors).decode(string12) : null;
                ?? bytes2 = androidCursor.getBytes(20);
                MerchantData merchantData = bytes2 != 0 ? (MerchantData) ((WireAdapter) contactQueries.customerAdapter.mappers).decode(bytes2) : null;
                ?? bytes3 = androidCursor.getBytes(21);
                Color color = bytes3 != 0 ? (Color) ((WireAdapter) contactQueries.customerAdapter.lazyDecoderFactories).decode(bytes3) : null;
                String string13 = androidCursor.getString(22);
                Region region = string13 != null ? (Region) ((EnumColumnAdapter) contactQueries.customerAdapter.keyers).decode(string13) : null;
                String string14 = androidCursor.getString(23);
                Long l2 = androidCursor.getLong(24);
                Long l3 = androidCursor.getLong(25);
                l3.getClass();
                Object[] objArr = {string2, string3, bool, m, string4, string5, string6, bool2, m2, bool3, string7, string8, image, string9, string10, string11, bool4, m3, l, blockState, merchantData, color, region, string14, l2, l3};
                if (objArr.length != 26) {
                    a$$ExternalSyntheticBUOutline0.m$3("Expected 26 arguments");
                    break;
                } else {
                    break;
                }
            case 1:
                RealContactRepository$contactById$1 realContactRepository$contactById$1 = RealContactRepository$contactById$1.INSTANCE;
                AndroidCursor androidCursor2 = (AndroidCursor) obj;
                androidCursor2.getClass();
                String string15 = androidCursor2.getString(0);
                String string16 = androidCursor2.getString(1);
                Boolean bool5 = androidCursor2.getBoolean(2);
                Boolean m4 = Matcher$$ExternalSyntheticOutline0.m(bool5, androidCursor2, 3);
                String string17 = androidCursor2.getString(4);
                String string18 = androidCursor2.getString(5);
                String string19 = androidCursor2.getString(6);
                Boolean bool6 = androidCursor2.getBoolean(7);
                Boolean m5 = Matcher$$ExternalSyntheticOutline0.m(bool6, androidCursor2, 8);
                Boolean bool7 = androidCursor2.getBoolean(9);
                bool7.getClass();
                String string20 = androidCursor2.getString(10);
                String string21 = androidCursor2.getString(11);
                ?? bytes4 = androidCursor2.getBytes(12);
                ContactQueries contactQueries2 = this.f$1;
                Image image2 = bytes4 != 0 ? (Image) ((WireAdapter) contactQueries2.customerAdapter.lazyFetcherFactories).decode(bytes4) : null;
                String string22 = androidCursor2.getString(13);
                String string23 = androidCursor2.getString(14);
                String string24 = androidCursor2.getString(15);
                Boolean bool8 = androidCursor2.getBoolean(16);
                Boolean m6 = Matcher$$ExternalSyntheticOutline0.m(bool8, androidCursor2, 17);
                Long l4 = androidCursor2.getLong(18);
                l4.getClass();
                String string25 = androidCursor2.getString(19);
                BlockState blockState2 = string25 != null ? (BlockState) ((EnumColumnAdapter) contactQueries2.customerAdapter.interceptors).decode(string25) : null;
                ?? bytes5 = androidCursor2.getBytes(20);
                MerchantData merchantData2 = bytes5 != 0 ? (MerchantData) ((WireAdapter) contactQueries2.customerAdapter.mappers).decode(bytes5) : null;
                ?? bytes6 = androidCursor2.getBytes(21);
                Color color2 = bytes6 != 0 ? (Color) ((WireAdapter) contactQueries2.customerAdapter.lazyDecoderFactories).decode(bytes6) : null;
                String string26 = androidCursor2.getString(22);
                Region region2 = string26 != null ? (Region) ((EnumColumnAdapter) contactQueries2.customerAdapter.keyers).decode(string26) : null;
                String string27 = androidCursor2.getString(23);
                Long l5 = androidCursor2.getLong(24);
                Long l6 = androidCursor2.getLong(25);
                l6.getClass();
                Object[] objArr2 = {string15, string16, bool5, m4, string17, string18, string19, bool6, m5, bool7, string20, string21, image2, string22, string23, string24, bool8, m6, l4, blockState2, merchantData2, color2, region2, string27, l5, l6};
                if (objArr2.length != 26) {
                    a$$ExternalSyntheticBUOutline0.m$3("Expected 26 arguments");
                    break;
                } else {
                    break;
                }
            default:
                RealContactRepository$contactByAlias$1 realContactRepository$contactByAlias$1 = RealContactRepository$contactByAlias$1.INSTANCE;
                AndroidCursor androidCursor3 = (AndroidCursor) obj;
                androidCursor3.getClass();
                String string28 = androidCursor3.getString(0);
                String string29 = androidCursor3.getString(1);
                Boolean bool9 = androidCursor3.getBoolean(2);
                Boolean m7 = Matcher$$ExternalSyntheticOutline0.m(bool9, androidCursor3, 3);
                String string30 = androidCursor3.getString(4);
                String string31 = androidCursor3.getString(5);
                String string32 = androidCursor3.getString(6);
                Boolean bool10 = androidCursor3.getBoolean(7);
                Boolean m8 = Matcher$$ExternalSyntheticOutline0.m(bool10, androidCursor3, 8);
                Boolean bool11 = androidCursor3.getBoolean(9);
                bool11.getClass();
                String string33 = androidCursor3.getString(10);
                String string34 = androidCursor3.getString(11);
                ?? bytes7 = androidCursor3.getBytes(12);
                ContactQueries contactQueries3 = this.f$1;
                Image image3 = bytes7 != 0 ? (Image) ((WireAdapter) contactQueries3.customerAdapter.lazyFetcherFactories).decode(bytes7) : null;
                String string35 = androidCursor3.getString(13);
                String string36 = androidCursor3.getString(14);
                String string37 = androidCursor3.getString(15);
                Boolean bool12 = androidCursor3.getBoolean(16);
                Boolean m9 = Matcher$$ExternalSyntheticOutline0.m(bool12, androidCursor3, 17);
                Long l7 = androidCursor3.getLong(18);
                l7.getClass();
                String string38 = androidCursor3.getString(19);
                BlockState blockState3 = string38 != null ? (BlockState) ((EnumColumnAdapter) contactQueries3.customerAdapter.interceptors).decode(string38) : null;
                ?? bytes8 = androidCursor3.getBytes(20);
                MerchantData merchantData3 = bytes8 != 0 ? (MerchantData) ((WireAdapter) contactQueries3.customerAdapter.mappers).decode(bytes8) : null;
                ?? bytes9 = androidCursor3.getBytes(21);
                Color color3 = bytes9 != 0 ? (Color) ((WireAdapter) contactQueries3.customerAdapter.lazyDecoderFactories).decode(bytes9) : null;
                String string39 = androidCursor3.getString(22);
                Region region3 = string39 != null ? (Region) ((EnumColumnAdapter) contactQueries3.customerAdapter.keyers).decode(string39) : null;
                String string40 = androidCursor3.getString(23);
                Long l8 = androidCursor3.getLong(24);
                Long l9 = androidCursor3.getLong(25);
                l9.getClass();
                Object[] objArr3 = {string28, string29, bool9, m7, string30, string31, string32, bool10, m8, bool11, string33, string34, image3, string35, string36, string37, bool12, m9, l7, blockState3, merchantData3, color3, region3, string40, l8, l9};
                if (objArr3.length != 26) {
                    a$$ExternalSyntheticBUOutline0.m$3("Expected 26 arguments");
                    break;
                } else {
                    break;
                }
        }
        return null;
    }
}
