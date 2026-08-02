package com.squareup.cash.appmessages.db;

import app.cash.local.db.LocalTabContentQueries;
import app.cash.sqldelight.EnumColumnAdapter;
import app.cash.sqldelight.TransacterImpl;
import app.cash.sqldelight.driver.android.AndroidStatement;
import coil3.ComponentRegistry;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.db.WireAdapter;
import com.squareup.protos.cash.messagingplatformcommon.app.Animation;
import com.squareup.protos.cash.messagingplatformcommon.app.AppMessageAction;
import com.squareup.protos.cash.messagingplatformcommon.app.CardMessage;
import com.squareup.protos.cash.messagingplatformcommon.app.Image;
import java.io.Serializable;
import java.time.Instant;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import okio.AsyncTimeout;

/* loaded from: classes5.dex */
public final /* synthetic */ class CardMessageQueries$$ExternalSyntheticLambda4 implements Function1 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ TransacterImpl f$10;
    public final /* synthetic */ int f$11;
    public final /* synthetic */ boolean f$2;
    public final /* synthetic */ Serializable f$3;
    public final /* synthetic */ Image f$4;
    public final /* synthetic */ Animation f$5;
    public final /* synthetic */ String f$6;
    public final /* synthetic */ Object f$7;
    public final /* synthetic */ AppMessageAction f$8;
    public final /* synthetic */ Instant f$9;

    public /* synthetic */ CardMessageQueries$$ExternalSyntheticLambda4(String str, String str2, boolean z, CardMessage.Placement placement, Image image, Animation animation, String str3, String str4, AppMessageAction appMessageAction, Instant instant, LocalTabContentQueries localTabContentQueries, int i) {
        this.f$0 = str;
        this.f$1 = str2;
        this.f$2 = z;
        this.f$3 = placement;
        this.f$4 = image;
        this.f$5 = animation;
        this.f$6 = str3;
        this.f$7 = str4;
        this.f$8 = appMessageAction;
        this.f$9 = instant;
        this.f$10 = localTabContentQueries;
        this.f$11 = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        int i2 = this.f$11;
        TransacterImpl transacterImpl = this.f$10;
        Instant instant = this.f$9;
        Serializable serializable = this.f$3;
        Image image = this.f$4;
        AppMessageAction appMessageAction = this.f$8;
        Animation animation = this.f$5;
        String str = this.f$6;
        Object obj2 = this.f$7;
        boolean z = this.f$2;
        String str2 = this.f$1;
        String str3 = this.f$0;
        switch (i) {
            case 0:
                CardMessage.Placement placement = (CardMessage.Placement) serializable;
                String str4 = (String) obj2;
                LocalTabContentQueries localTabContentQueries = (LocalTabContentQueries) transacterImpl;
                AndroidStatement androidStatement = (AndroidStatement) obj;
                Request$Priority$EnumUnboxingLocalUtility.m(androidStatement, 0, str3, 1, str2);
                androidStatement.bindBoolean(2, Boolean.valueOf(z));
                androidStatement.bindString(3, placement != null ? (String) ((EnumColumnAdapter) ((ComponentRegistry.Builder) localTabContentQueries.local_tab_contentAdapter).interceptors).encode(placement) : null);
                androidStatement.bindBytes(4, image != null ? (byte[]) ((WireAdapter) ((ComponentRegistry.Builder) localTabContentQueries.local_tab_contentAdapter).mappers).encode(image) : null);
                androidStatement.bindBytes(5, animation != null ? (byte[]) ((WireAdapter) ((ComponentRegistry.Builder) localTabContentQueries.local_tab_contentAdapter).lazyFetcherFactories).encode(animation) : null);
                androidStatement.bindString(6, str);
                androidStatement.bindString(7, str4);
                androidStatement.bindBytes(8, appMessageAction != null ? (byte[]) ((WireAdapter) ((ComponentRegistry.Builder) localTabContentQueries.local_tab_contentAdapter).keyers).encode(appMessageAction) : null);
                androidStatement.bindLong(9, instant != null ? Long.valueOf(((Number) ((AsyncTimeout.Companion) ((ComponentRegistry.Builder) localTabContentQueries.local_tab_contentAdapter).lazyDecoderFactories).encode(instant)).longValue()) : null);
                ((ComponentRegistry.Builder) localTabContentQueries.local_tab_contentAdapter).getClass();
                androidStatement.bindLong(10, Long.valueOf(i2));
                break;
            default:
                Image image2 = (Image) serializable;
                LocalTabContentQueries localTabContentQueries2 = (LocalTabContentQueries) transacterImpl;
                AndroidStatement androidStatement2 = (AndroidStatement) obj;
                Request$Priority$EnumUnboxingLocalUtility.m(androidStatement2, 0, str3, 1, str2);
                androidStatement2.bindBoolean(2, Boolean.valueOf(z));
                androidStatement2.bindLong(3, (Long) obj2);
                androidStatement2.bindString(4, str);
                androidStatement2.bindBytes(5, animation != null ? (byte[]) ((WireAdapter) ((ComponentRegistry.Builder) localTabContentQueries2.local_tab_contentAdapter).mappers).encode(animation) : null);
                androidStatement2.bindBytes(6, appMessageAction != null ? (byte[]) ((WireAdapter) ((ComponentRegistry.Builder) localTabContentQueries2.local_tab_contentAdapter).interceptors).encode(appMessageAction) : null);
                androidStatement2.bindBytes(7, image != null ? (byte[]) ((WireAdapter) ((ComponentRegistry.Builder) localTabContentQueries2.local_tab_contentAdapter).keyers).encode(image) : null);
                androidStatement2.bindBytes(8, image2 != null ? (byte[]) ((WireAdapter) ((ComponentRegistry.Builder) localTabContentQueries2.local_tab_contentAdapter).lazyFetcherFactories).encode(image2) : null);
                androidStatement2.bindLong(9, instant != null ? Long.valueOf(((Number) ((AsyncTimeout.Companion) ((ComponentRegistry.Builder) localTabContentQueries2.local_tab_contentAdapter).lazyDecoderFactories).encode(instant)).longValue()) : null);
                ((ComponentRegistry.Builder) localTabContentQueries2.local_tab_contentAdapter).getClass();
                androidStatement2.bindLong(10, Long.valueOf(i2));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ CardMessageQueries$$ExternalSyntheticLambda4(String str, String str2, boolean z, Long l, String str3, Animation animation, AppMessageAction appMessageAction, Image image, Image image2, Instant instant, LocalTabContentQueries localTabContentQueries, int i) {
        this.f$0 = str;
        this.f$1 = str2;
        this.f$2 = z;
        this.f$7 = l;
        this.f$6 = str3;
        this.f$5 = animation;
        this.f$8 = appMessageAction;
        this.f$4 = image;
        this.f$3 = image2;
        this.f$9 = instant;
        this.f$10 = localTabContentQueries;
        this.f$11 = i;
    }
}
