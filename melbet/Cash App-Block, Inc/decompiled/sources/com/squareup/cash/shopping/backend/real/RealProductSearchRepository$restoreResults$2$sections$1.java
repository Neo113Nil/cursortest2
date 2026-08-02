package com.squareup.cash.shopping.backend.real;

import androidx.media3.extractor.text.CueEncoder;
import app.cash.directory.data.Directory$Section;
import app.cash.directory.data.DirectoryKt;
import app.cash.sqldelight.EnumColumnAdapter;
import app.cash.sqldelight.SimpleQuery;
import app.cash.sqldelight.db.SqlDriver;
import app.cash.sqldelight.driver.android.AndroidCursor;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.measurement.zzlj;
import com.squareup.cash.boost.db.RewardSlotQueries;
import com.squareup.cash.db.WireAdapter;
import com.squareup.cash.offers.db.OffersHomeQueries$ForIdQuery;
import com.squareup.cash.sheet.RealSheetState$$ExternalSyntheticLambda0;
import com.squareup.cash.shopping.db.ProductsResultsItem;
import com.squareup.cash.shopping.db.ProductsResultsPaginationToken;
import com.squareup.cash.shopping.db.ProductsResultsSection;
import com.squareup.cash.shopping.db.ShopProductsSearchQueries$itemsForSectionId$2;
import com.squareup.cash.shopping.db.ShopProductsSearchQueries$paginationToken$2;
import com.squareup.cash.shopping.db.ShopProductsSearchQueries$sections$2;
import com.squareup.protos.cash.customersearch.api.Metadata;
import com.squareup.protos.cash.customersearch.api.SearchCommonMessageSection;
import com.squareup.protos.cash.discover.api.app.v1.model.Button;
import com.squareup.protos.cash.discover.api.app.v1.model.Section;
import com.squareup.protos.cash.discover.api.app.v1.model.Text;
import com.squareup.protos.cash.ui.Image;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;
import retrofit2.Retrofit;

/* loaded from: classes7.dex */
public final class RealProductSearchRepository$restoreResults$2$sections$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ RealProductSearchRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealProductSearchRepository$restoreResults$2$sections$1(RealProductSearchRepository realProductSearchRepository, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = realProductSearchRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        RealProductSearchRepository realProductSearchRepository = this.this$0;
        switch (i) {
            case 0:
                return new RealProductSearchRepository$restoreResults$2$sections$1(realProductSearchRepository, continuation, 0);
            default:
                return new RealProductSearchRepository$restoreResults$2$sections$1(realProductSearchRepository, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((RealProductSearchRepository$restoreResults$2$sections$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        RealProductSearchRepository realProductSearchRepository = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                final RewardSlotQueries rewardSlotQueries = realProductSearchRepository.productsSearchQueries;
                rewardSlotQueries.getClass();
                ShopProductsSearchQueries$sections$2 shopProductsSearchQueries$sections$2 = ShopProductsSearchQueries$sections$2.INSTANCE;
                SqlDriver sqlDriver = rewardSlotQueries.driver;
                final int i2 = 1;
                Function1 function1 = new Function1(rewardSlotQueries, i2) { // from class: com.squareup.cash.shopping.db.ShopProductsSearchQueries$$ExternalSyntheticLambda0
                    public final /* synthetic */ int $r8$classId;
                    public final /* synthetic */ RewardSlotQueries f$1;

                    {
                        this.$r8$classId = i2;
                        switch (i2) {
                            case 1:
                                ShopProductsSearchQueries$sections$2 shopProductsSearchQueries$sections$22 = ShopProductsSearchQueries$sections$2.INSTANCE;
                                break;
                            default:
                                ShopProductsSearchQueries$itemsForSectionId$2 shopProductsSearchQueries$itemsForSectionId$2 = ShopProductsSearchQueries$itemsForSectionId$2.INSTANCE;
                                break;
                        }
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r1v4, types: [byte[], java.io.Serializable] */
                    /* JADX WARN: Type inference failed for: r1v7, types: [byte[], java.io.Serializable] */
                    /* JADX WARN: Type inference failed for: r2v1, types: [byte[], java.io.Serializable] */
                    /* JADX WARN: Type inference failed for: r2v4, types: [byte[], java.io.Serializable] */
                    /* JADX WARN: Type inference failed for: r3v1, types: [byte[], java.io.Serializable] */
                    /* JADX WARN: Type inference failed for: r3v12, types: [byte[], java.io.Serializable] */
                    /* JADX WARN: Type inference failed for: r4v1, types: [byte[], java.io.Serializable] */
                    /* JADX WARN: Type inference failed for: r5v1, types: [byte[], java.io.Serializable] */
                    /* JADX WARN: Type inference failed for: r5v8, types: [byte[], java.io.Serializable] */
                    /* JADX WARN: Type inference failed for: r6v3, types: [byte[], java.io.Serializable] */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        int i3 = this.$r8$classId;
                        RewardSlotQueries rewardSlotQueries2 = this.f$1;
                        switch (i3) {
                            case 0:
                                ShopProductsSearchQueries$itemsForSectionId$2 shopProductsSearchQueries$itemsForSectionId$2 = ShopProductsSearchQueries$itemsForSectionId$2.INSTANCE;
                                AndroidCursor androidCursor = (AndroidCursor) obj2;
                                Long m = re$$ExternalSyntheticOutline0.m(androidCursor, 0);
                                Long l = androidCursor.getLong(1);
                                Long m2 = re$$ExternalSyntheticOutline0.m(l, androidCursor, 2);
                                ?? bytes = androidCursor.getBytes(3);
                                Text text = bytes != 0 ? (Text) ((WireAdapter) ((zzlj) rewardSlotQueries2.rewardSlotAdapter).zza).decode(bytes) : null;
                                ?? bytes2 = androidCursor.getBytes(4);
                                Text text2 = bytes2 != 0 ? (Text) ((WireAdapter) ((zzlj) rewardSlotQueries2.rewardSlotAdapter).zzb).decode(bytes2) : null;
                                ?? bytes3 = androidCursor.getBytes(5);
                                Text text3 = bytes3 != 0 ? (Text) ((WireAdapter) ((zzlj) rewardSlotQueries2.rewardSlotAdapter).zzc).decode(bytes3) : null;
                                ?? bytes4 = androidCursor.getBytes(6);
                                Text text4 = bytes4 != 0 ? (Text) ((WireAdapter) ((zzlj) rewardSlotQueries2.rewardSlotAdapter).zze).decode(bytes4) : null;
                                String string2 = androidCursor.getString(7);
                                ?? bytes5 = androidCursor.getBytes(8);
                                Image image = bytes5 != 0 ? (Image) ((WireAdapter) ((zzlj) rewardSlotQueries2.rewardSlotAdapter).zzd).decode(bytes5) : null;
                                ?? bytes6 = androidCursor.getBytes(9);
                                return new ProductsResultsItem(m.longValue(), l.longValue(), m2.longValue(), text, text2, text3, text4, string2, image, bytes6 != 0 ? (Metadata) ((WireAdapter) ((zzlj) rewardSlotQueries2.rewardSlotAdapter).zzf).decode(bytes6) : null);
                            default:
                                ShopProductsSearchQueries$sections$2 shopProductsSearchQueries$sections$22 = ShopProductsSearchQueries$sections$2.INSTANCE;
                                AndroidCursor androidCursor2 = (AndroidCursor) obj2;
                                Long m3 = re$$ExternalSyntheticOutline0.m(androidCursor2, 0);
                                String string3 = androidCursor2.getString(1);
                                string3.getClass();
                                ?? bytes7 = androidCursor2.getBytes(2);
                                Text text5 = bytes7 != 0 ? (Text) ((WireAdapter) ((Retrofit.Builder) rewardSlotQueries2.rewardAdapter).callFactory).decode(bytes7) : null;
                                ?? bytes8 = androidCursor2.getBytes(3);
                                Text text6 = bytes8 != 0 ? (Text) ((WireAdapter) ((Retrofit.Builder) rewardSlotQueries2.rewardAdapter).baseUrl).decode(bytes8) : null;
                                String string4 = androidCursor2.getString(4);
                                Section.Layout layout = string4 != null ? (Section.Layout) ((EnumColumnAdapter) ((Retrofit.Builder) rewardSlotQueries2.rewardAdapter).converterFactories).decode(string4) : null;
                                ?? bytes9 = androidCursor2.getBytes(5);
                                SearchCommonMessageSection searchCommonMessageSection = bytes9 != 0 ? (SearchCommonMessageSection) ((WireAdapter) ((Retrofit.Builder) rewardSlotQueries2.rewardAdapter).callAdapterFactories).decode(bytes9) : null;
                                ?? bytes10 = androidCursor2.getBytes(6);
                                return shopProductsSearchQueries$sections$22.invoke(m3, string3, text5, text6, layout, searchCommonMessageSection, bytes10 != 0 ? (Button) ((WireAdapter) ((Retrofit.Builder) rewardSlotQueries2.rewardAdapter).callbackExecutor).decode(bytes10) : null);
                        }
                    }
                };
                sqlDriver.getClass();
                List<ProductsResultsSection> executeAsList = new SimpleQuery(122820646, new String[]{"productsResultsSection"}, sqlDriver, "ShopProductsSearch.sq", "sections", "SELECT productsResultsSection.id, productsResultsSection.type, productsResultsSection.title, productsResultsSection.subtitle, productsResultsSection.layout, productsResultsSection.message, productsResultsSection.footerButton FROM productsResultsSection", function1).executeAsList();
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(executeAsList, 10));
                for (ProductsResultsSection productsResultsSection : executeAsList) {
                    long j = productsResultsSection.id;
                    rewardSlotQueries.getClass();
                    ShopProductsSearchQueries$itemsForSectionId$2 shopProductsSearchQueries$itemsForSectionId$2 = ShopProductsSearchQueries$itemsForSectionId$2.INSTANCE;
                    final int i3 = 0;
                    List executeAsList2 = new OffersHomeQueries$ForIdQuery(rewardSlotQueries, j, new Function1(rewardSlotQueries, i3) { // from class: com.squareup.cash.shopping.db.ShopProductsSearchQueries$$ExternalSyntheticLambda0
                        public final /* synthetic */ int $r8$classId;
                        public final /* synthetic */ RewardSlotQueries f$1;

                        {
                            this.$r8$classId = i3;
                            switch (i3) {
                                case 1:
                                    ShopProductsSearchQueries$sections$2 shopProductsSearchQueries$sections$22 = ShopProductsSearchQueries$sections$2.INSTANCE;
                                    break;
                                default:
                                    ShopProductsSearchQueries$itemsForSectionId$2 shopProductsSearchQueries$itemsForSectionId$22 = ShopProductsSearchQueries$itemsForSectionId$2.INSTANCE;
                                    break;
                            }
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r1v4, types: [byte[], java.io.Serializable] */
                        /* JADX WARN: Type inference failed for: r1v7, types: [byte[], java.io.Serializable] */
                        /* JADX WARN: Type inference failed for: r2v1, types: [byte[], java.io.Serializable] */
                        /* JADX WARN: Type inference failed for: r2v4, types: [byte[], java.io.Serializable] */
                        /* JADX WARN: Type inference failed for: r3v1, types: [byte[], java.io.Serializable] */
                        /* JADX WARN: Type inference failed for: r3v12, types: [byte[], java.io.Serializable] */
                        /* JADX WARN: Type inference failed for: r4v1, types: [byte[], java.io.Serializable] */
                        /* JADX WARN: Type inference failed for: r5v1, types: [byte[], java.io.Serializable] */
                        /* JADX WARN: Type inference failed for: r5v8, types: [byte[], java.io.Serializable] */
                        /* JADX WARN: Type inference failed for: r6v3, types: [byte[], java.io.Serializable] */
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            int i32 = this.$r8$classId;
                            RewardSlotQueries rewardSlotQueries2 = this.f$1;
                            switch (i32) {
                                case 0:
                                    ShopProductsSearchQueries$itemsForSectionId$2 shopProductsSearchQueries$itemsForSectionId$22 = ShopProductsSearchQueries$itemsForSectionId$2.INSTANCE;
                                    AndroidCursor androidCursor = (AndroidCursor) obj2;
                                    Long m = re$$ExternalSyntheticOutline0.m(androidCursor, 0);
                                    Long l = androidCursor.getLong(1);
                                    Long m2 = re$$ExternalSyntheticOutline0.m(l, androidCursor, 2);
                                    ?? bytes = androidCursor.getBytes(3);
                                    Text text = bytes != 0 ? (Text) ((WireAdapter) ((zzlj) rewardSlotQueries2.rewardSlotAdapter).zza).decode(bytes) : null;
                                    ?? bytes2 = androidCursor.getBytes(4);
                                    Text text2 = bytes2 != 0 ? (Text) ((WireAdapter) ((zzlj) rewardSlotQueries2.rewardSlotAdapter).zzb).decode(bytes2) : null;
                                    ?? bytes3 = androidCursor.getBytes(5);
                                    Text text3 = bytes3 != 0 ? (Text) ((WireAdapter) ((zzlj) rewardSlotQueries2.rewardSlotAdapter).zzc).decode(bytes3) : null;
                                    ?? bytes4 = androidCursor.getBytes(6);
                                    Text text4 = bytes4 != 0 ? (Text) ((WireAdapter) ((zzlj) rewardSlotQueries2.rewardSlotAdapter).zze).decode(bytes4) : null;
                                    String string2 = androidCursor.getString(7);
                                    ?? bytes5 = androidCursor.getBytes(8);
                                    Image image = bytes5 != 0 ? (Image) ((WireAdapter) ((zzlj) rewardSlotQueries2.rewardSlotAdapter).zzd).decode(bytes5) : null;
                                    ?? bytes6 = androidCursor.getBytes(9);
                                    return new ProductsResultsItem(m.longValue(), l.longValue(), m2.longValue(), text, text2, text3, text4, string2, image, bytes6 != 0 ? (Metadata) ((WireAdapter) ((zzlj) rewardSlotQueries2.rewardSlotAdapter).zzf).decode(bytes6) : null);
                                default:
                                    ShopProductsSearchQueries$sections$2 shopProductsSearchQueries$sections$22 = ShopProductsSearchQueries$sections$2.INSTANCE;
                                    AndroidCursor androidCursor2 = (AndroidCursor) obj2;
                                    Long m3 = re$$ExternalSyntheticOutline0.m(androidCursor2, 0);
                                    String string3 = androidCursor2.getString(1);
                                    string3.getClass();
                                    ?? bytes7 = androidCursor2.getBytes(2);
                                    Text text5 = bytes7 != 0 ? (Text) ((WireAdapter) ((Retrofit.Builder) rewardSlotQueries2.rewardAdapter).callFactory).decode(bytes7) : null;
                                    ?? bytes8 = androidCursor2.getBytes(3);
                                    Text text6 = bytes8 != 0 ? (Text) ((WireAdapter) ((Retrofit.Builder) rewardSlotQueries2.rewardAdapter).baseUrl).decode(bytes8) : null;
                                    String string4 = androidCursor2.getString(4);
                                    Section.Layout layout = string4 != null ? (Section.Layout) ((EnumColumnAdapter) ((Retrofit.Builder) rewardSlotQueries2.rewardAdapter).converterFactories).decode(string4) : null;
                                    ?? bytes9 = androidCursor2.getBytes(5);
                                    SearchCommonMessageSection searchCommonMessageSection = bytes9 != 0 ? (SearchCommonMessageSection) ((WireAdapter) ((Retrofit.Builder) rewardSlotQueries2.rewardAdapter).callAdapterFactories).decode(bytes9) : null;
                                    ?? bytes10 = androidCursor2.getBytes(6);
                                    return shopProductsSearchQueries$sections$22.invoke(m3, string3, text5, text6, layout, searchCommonMessageSection, bytes10 != 0 ? (Button) ((WireAdapter) ((Retrofit.Builder) rewardSlotQueries2.rewardAdapter).callbackExecutor).decode(bytes10) : null);
                            }
                        }
                    }, 7).executeAsList();
                    ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(executeAsList2, 10));
                    Iterator it = executeAsList2.iterator();
                    while (true) {
                        Object obj2 = null;
                        if (it.hasNext()) {
                            ProductsResultsItem productsResultsItem = (ProductsResultsItem) it.next();
                            productsResultsItem.getClass();
                            Text text = productsResultsItem.title;
                            Directory$Section.Item.SimpleItem.ItemText itemText = text != null ? DirectoryKt.toItemText(text) : null;
                            Text text2 = productsResultsItem.subtitle;
                            Directory$Section.Item.SimpleItem.ItemText itemText2 = text2 != null ? DirectoryKt.toItemText(text2) : null;
                            Text text3 = productsResultsItem.captionLeft;
                            Directory$Section.Item.SimpleItem.ItemText itemText3 = text3 != null ? DirectoryKt.toItemText(text3) : null;
                            Text text4 = productsResultsItem.captionRight;
                            if (text4 != null) {
                                obj2 = DirectoryKt.toItemText(text4);
                            }
                            arrayList2.add(new Directory$Section.Item.CardItem(itemText, itemText2, itemText3, obj2, productsResultsItem.metadata, productsResultsItem.picture, productsResultsItem.actionUrl));
                        } else {
                            Text text5 = productsResultsSection.title;
                            Text text6 = productsResultsSection.subtitle;
                            CueEncoder cueEncoder = Directory$Section.Type.Companion;
                            String str = productsResultsSection.f1204type;
                            cueEncoder.getClass();
                            str.getClass();
                            Iterator it2 = Directory$Section.Type.$ENTRIES.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    Object next = it2.next();
                                    if (Intrinsics.areEqual(((Directory$Section.Type) next).name(), str)) {
                                        obj2 = next;
                                    }
                                }
                            }
                            Directory$Section.Type type2 = (Directory$Section.Type) obj2;
                            if (type2 == null) {
                                type2 = Directory$Section.Type.AVATAR;
                            }
                            arrayList.add(new Directory$Section(text5, text6, arrayList2, type2, null, null, productsResultsSection.footerButton, null, productsResultsSection.message, null, productsResultsSection.layout, 3898246));
                        }
                    }
                }
                return arrayList;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                RewardSlotQueries rewardSlotQueries2 = realProductSearchRepository.productsSearchQueries;
                rewardSlotQueries2.getClass();
                ShopProductsSearchQueries$paginationToken$2 shopProductsSearchQueries$paginationToken$2 = ShopProductsSearchQueries$paginationToken$2.INSTANCE;
                SqlDriver sqlDriver2 = rewardSlotQueries2.driver;
                RealSheetState$$ExternalSyntheticLambda0 realSheetState$$ExternalSyntheticLambda0 = new RealSheetState$$ExternalSyntheticLambda0(10);
                sqlDriver2.getClass();
                return ((ProductsResultsPaginationToken) new SimpleQuery(2014241159, new String[]{"productsResultsPaginationToken"}, sqlDriver2, "ShopProductsSearch.sq", "paginationToken", "SELECT token\nFROM productsResultsPaginationToken\nLIMIT 1", realSheetState$$ExternalSyntheticLambda0).executeAsOne()).token;
        }
    }
}
