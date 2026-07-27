package com.zennvvarroo.pealkkk.ui;

import android.app.Application;
import android.content.SharedPreferences;
import androidx.lifecycle.AndroidViewModel;
import com.zennvvarroo.pealkkk.data.model.AreaColor;
import com.zennvvarroo.pealkkk.data.model.ItemCategory;
import com.zennvvarroo.pealkkk.data.model.StorageArea;
import com.zennvvarroo.pealkkk.data.model.StorageShelf;
import com.zennvvarroo.pealkkk.data.model.StoredItem;
import com.zennvvarroo.pealkkk.ui.model.AppUiState;
import com.zennvvarroo.pealkkk.ui.model.ZenvaroTab;
import com.zennvvarroo.pealkkk.util.ParsersKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: MainViewModel.kt */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\"J>\u0010#\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001fJ\u001e\u0010+\u001a\u00020\u001d2\u0006\u0010,\u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001fJ\u0016\u0010-\u001a\u00020\u001d2\u0006\u0010.\u001a\u00020\u001f2\u0006\u0010/\u001a\u00020&J\u0010\u00100\u001a\u00020\u001d2\u0006\u0010.\u001a\u00020\u001fH\u0002J\u0010\u00101\u001a\u00020\u001d2\u0006\u0010.\u001a\u00020\u001fH\u0002J\u0010\u00102\u001a\u00020\u001d2\u0006\u0010.\u001a\u00020\u001fH\u0002J\b\u00103\u001a\u00020\u001dH\u0002J\u0006\u00104\u001a\u00020\u001dJ\u0006\u00105\u001a\u00020\u001dJ\u0006\u00106\u001a\u00020\u001dJ\u0006\u00107\u001a\u00020\u001dJ\u000e\u00108\u001a\u00020\u001d2\u0006\u00109\u001a\u00020:J\u0012\u0010;\u001a\u00020\u001d2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u001fJ\u0012\u0010<\u001a\u00020\u001d2\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u001fJ\u0012\u0010>\u001a\u00020\u001d2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u001fJ\b\u0010?\u001a\u00020\u001dH\u0002J\u000e\u0010@\u001a\u00020\u001d2\u0006\u0010,\u001a\u00020\u001fJ\u000e\u0010A\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020\u001fJ\u000e\u0010B\u001a\u00020\u001d2\u0006\u0010C\u001a\u00020DJ&\u0010E\u001a\u00020\u001d2\u0006\u0010.\u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\"JF\u0010F\u001a\u00020\u001d2\u0006\u0010.\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001fJ&\u0010G\u001a\u00020\u001d2\u0006\u0010.\u001a\u00020\u001f2\u0006\u0010,\u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001fR\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0016\u0010\u0015\u001a\n \u0017*\u0004\u0018\u00010\u00160\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00070\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012¨\u0006H"}, d2 = {"Lcom/zennvvarroo/pealkkk/ui/MainViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "_areas", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lcom/zennvvarroo/pealkkk/data/model/StorageArea;", "_items", "Lcom/zennvvarroo/pealkkk/data/model/StoredItem;", "_shelves", "Lcom/zennvvarroo/pealkkk/data/model/StorageShelf;", "_uiState", "Lcom/zennvvarroo/pealkkk/ui/model/AppUiState;", "areas", "Lkotlinx/coroutines/flow/StateFlow;", "getAreas", "()Lkotlinx/coroutines/flow/StateFlow;", "items", "getItems", "sharedPrefs", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "shelves", "getShelves", "uiState", "getUiState", "addArea", "", "title", "", "note", "color", "Lcom/zennvvarroo/pealkkk/data/model/AreaColor;", "addItem", "shelfId", "quantity", "", "minimumQuantity", "category", "Lcom/zennvvarroo/pealkkk/data/model/ItemCategory;", "container", "addShelf", "areaId", "changeQuantity", "id", "delta", "deleteArea", "deleteItem", "deleteShelf", "loadAll", "loadDemoData", "onConfirmDelete", "onDialogDismiss", "onDismissDelete", "onInitiateDelete", "entity", "", "onOpenAreaDialog", "onOpenItemDialog", "itemId", "onOpenShelfDialog", "saveAll", "selectArea", "selectShelf", "selectTab", "tab", "Lcom/zennvvarroo/pealkkk/ui/model/ZenvaroTab;", "updateArea", "updateItem", "updateShelf", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MainViewModel extends AndroidViewModel {
    public static final int $stable = 8;
    private final MutableStateFlow<List<StorageArea>> _areas;
    private final MutableStateFlow<List<StoredItem>> _items;
    private final MutableStateFlow<List<StorageShelf>> _shelves;
    private final MutableStateFlow<AppUiState> _uiState;
    private final StateFlow<List<StorageArea>> areas;
    private final StateFlow<List<StoredItem>> items;
    private final SharedPreferences sharedPrefs;
    private final StateFlow<List<StorageShelf>> shelves;
    private final StateFlow<AppUiState> uiState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainViewModel(Application application) {
        super(application);
        Intrinsics.checkNotNullParameter(application, "application");
        MutableStateFlow<List<StorageArea>> MutableStateFlow = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this._areas = MutableStateFlow;
        this.areas = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<List<StorageShelf>> MutableStateFlow2 = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this._shelves = MutableStateFlow2;
        this.shelves = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<List<StoredItem>> MutableStateFlow3 = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this._items = MutableStateFlow3;
        this.items = FlowKt.asStateFlow(MutableStateFlow3);
        MutableStateFlow<AppUiState> MutableStateFlow4 = StateFlowKt.MutableStateFlow(new AppUiState(null, null, null, false, false, false, null, null, null, null, null, null, 4095, null));
        this._uiState = MutableStateFlow4;
        this.uiState = FlowKt.asStateFlow(MutableStateFlow4);
        this.sharedPrefs = application.getSharedPreferences("zenvaro_peak_store", 0);
        loadAll();
    }

    public final StateFlow<List<StorageArea>> getAreas() {
        return this.areas;
    }

    public final StateFlow<List<StorageShelf>> getShelves() {
        return this.shelves;
    }

    public final StateFlow<List<StoredItem>> getItems() {
        return this.items;
    }

    public final StateFlow<AppUiState> getUiState() {
        return this.uiState;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x02f5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x020e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0101 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0066 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01d1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x013e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void loadAll() {
        ArrayList emptyList;
        ArrayList emptyList2;
        ArrayList emptyList3;
        Object m6239constructorimpl;
        String str;
        String str2;
        AppUiState value;
        AppUiState copy;
        String str3;
        StoredItem storedItem;
        Long longOrNull;
        Long longOrNull2;
        Integer intOrNull;
        Integer intOrNull2;
        String str4;
        StorageShelf storageShelf;
        Long longOrNull3;
        Long longOrNull4;
        StorageArea storageArea;
        Long longOrNull5;
        Long longOrNull6;
        try {
            String string = this.sharedPrefs.getString("zenvaro_areas", "");
            if (string == null) {
                string = "";
            }
            String string2 = this.sharedPrefs.getString("zenvaro_shelves", "");
            if (string2 == null) {
                string2 = "";
            }
            String string3 = this.sharedPrefs.getString("zenvaro_items", "");
            if (string3 == null) {
                string3 = "";
            }
            String string4 = this.sharedPrefs.getString("zenvaro_ui", "");
            if (string4 == null) {
                string4 = "";
            }
            if (string.length() > 0) {
                List<String> split$default = StringsKt.split$default((CharSequence) string, new String[]{"¶"}, false, 0, 6, (Object) null);
                ArrayList arrayList = new ArrayList();
                for (String str5 : split$default) {
                    if (!StringsKt.isBlank(str5)) {
                        List split$default2 = StringsKt.split$default((CharSequence) str5, new String[]{"§"}, false, 0, 6, (Object) null);
                        String str6 = (String) CollectionsKt.getOrNull(split$default2, 0);
                        if (str6 != null) {
                            String str7 = (String) CollectionsKt.getOrNull(split$default2, 1);
                            String str8 = str7 == null ? "" : str7;
                            String str9 = (String) CollectionsKt.getOrNull(split$default2, 2);
                            String str10 = str9 == null ? "" : str9;
                            String str11 = (String) CollectionsKt.getOrNull(split$default2, 3);
                            if (str11 == null) {
                                str11 = "CYAN";
                            }
                            AreaColor areaColorOf = ParsersKt.areaColorOf(str11);
                            String str12 = (String) CollectionsKt.getOrNull(split$default2, 4);
                            long currentTimeMillis = (str12 == null || (longOrNull6 = StringsKt.toLongOrNull(str12)) == null) ? System.currentTimeMillis() : longOrNull6.longValue();
                            String str13 = (String) CollectionsKt.getOrNull(split$default2, 5);
                            storageArea = new StorageArea(str6, str8, str10, areaColorOf, currentTimeMillis, (str13 == null || (longOrNull5 = StringsKt.toLongOrNull(str13)) == null) ? currentTimeMillis : longOrNull5.longValue());
                            if (storageArea == null) {
                                arrayList.add(storageArea);
                            }
                        }
                    }
                    storageArea = null;
                    if (storageArea == null) {
                    }
                }
                emptyList = arrayList;
            } else {
                emptyList = CollectionsKt.emptyList();
            }
            this._areas.setValue(emptyList);
            if (string2.length() > 0) {
                List<String> split$default3 = StringsKt.split$default((CharSequence) string2, new String[]{"¶"}, false, 0, 6, (Object) null);
                ArrayList arrayList2 = new ArrayList();
                for (String str14 : split$default3) {
                    if (!StringsKt.isBlank(str14)) {
                        List split$default4 = StringsKt.split$default((CharSequence) str14, new String[]{"§"}, false, 0, 6, (Object) null);
                        String str15 = (String) CollectionsKt.getOrNull(split$default4, 0);
                        if (str15 != null && (str4 = (String) CollectionsKt.getOrNull(split$default4, 1)) != null) {
                            String str16 = (String) CollectionsKt.getOrNull(split$default4, 2);
                            String str17 = str16 == null ? "" : str16;
                            String str18 = (String) CollectionsKt.getOrNull(split$default4, 3);
                            String str19 = str18 == null ? "" : str18;
                            String str20 = (String) CollectionsKt.getOrNull(split$default4, 4);
                            long currentTimeMillis2 = (str20 == null || (longOrNull4 = StringsKt.toLongOrNull(str20)) == null) ? System.currentTimeMillis() : longOrNull4.longValue();
                            String str21 = (String) CollectionsKt.getOrNull(split$default4, 5);
                            storageShelf = new StorageShelf(str15, str4, str17, str19, currentTimeMillis2, (str21 == null || (longOrNull3 = StringsKt.toLongOrNull(str21)) == null) ? currentTimeMillis2 : longOrNull3.longValue());
                            if (storageShelf == null) {
                                arrayList2.add(storageShelf);
                            }
                        }
                    }
                    storageShelf = null;
                    if (storageShelf == null) {
                    }
                }
                emptyList2 = arrayList2;
            } else {
                emptyList2 = CollectionsKt.emptyList();
            }
            this._shelves.setValue(emptyList2);
            if (string3.length() > 0) {
                List<String> split$default5 = StringsKt.split$default((CharSequence) string3, new String[]{"¶"}, false, 0, 6, (Object) null);
                ArrayList arrayList3 = new ArrayList();
                for (String str22 : split$default5) {
                    if (!StringsKt.isBlank(str22)) {
                        List split$default6 = StringsKt.split$default((CharSequence) str22, new String[]{"§"}, false, 0, 6, (Object) null);
                        String str23 = (String) CollectionsKt.getOrNull(split$default6, 0);
                        if (str23 != null && (str3 = (String) CollectionsKt.getOrNull(split$default6, 1)) != null) {
                            String str24 = (String) CollectionsKt.getOrNull(split$default6, 2);
                            String str25 = str24 == null ? "" : str24;
                            String str26 = (String) CollectionsKt.getOrNull(split$default6, 3);
                            int coerceIn = RangesKt.coerceIn((str26 == null || (intOrNull2 = StringsKt.toIntOrNull(str26)) == null) ? 0 : intOrNull2.intValue(), 0, 999999);
                            String str27 = (String) CollectionsKt.getOrNull(split$default6, 4);
                            int coerceIn2 = RangesKt.coerceIn((str27 == null || (intOrNull = StringsKt.toIntOrNull(str27)) == null) ? 0 : intOrNull.intValue(), 0, 999999);
                            String str28 = (String) CollectionsKt.getOrNull(split$default6, 5);
                            if (str28 == null) {
                                str28 = "OTHER";
                            }
                            ItemCategory categoryOf = ParsersKt.categoryOf(str28);
                            String str29 = (String) CollectionsKt.getOrNull(split$default6, 6);
                            String str30 = str29 == null ? "" : str29;
                            String str31 = (String) CollectionsKt.getOrNull(split$default6, 7);
                            String str32 = str31 == null ? "" : str31;
                            String str33 = (String) CollectionsKt.getOrNull(split$default6, 8);
                            long currentTimeMillis3 = (str33 == null || (longOrNull2 = StringsKt.toLongOrNull(str33)) == null) ? System.currentTimeMillis() : longOrNull2.longValue();
                            String str34 = (String) CollectionsKt.getOrNull(split$default6, 9);
                            storedItem = new StoredItem(str23, str3, str25, coerceIn, coerceIn2, categoryOf, str30, str32, currentTimeMillis3, (str34 == null || (longOrNull = StringsKt.toLongOrNull(str34)) == null) ? currentTimeMillis3 : longOrNull.longValue());
                            if (storedItem == null) {
                                arrayList3.add(storedItem);
                            }
                        }
                    }
                    storedItem = null;
                    if (storedItem == null) {
                    }
                }
                emptyList3 = arrayList3;
            } else {
                emptyList3 = CollectionsKt.emptyList();
            }
            this._items.setValue(emptyList3);
            if (string4.length() > 0) {
                List split$default7 = StringsKt.split$default((CharSequence) string4, new String[]{"§"}, false, 0, 6, (Object) null);
                try {
                    Result.Companion companion = Result.INSTANCE;
                    MainViewModel mainViewModel = this;
                    String str35 = (String) CollectionsKt.getOrNull(split$default7, 0);
                    if (str35 == null) {
                        str35 = "OVERVIEW";
                    }
                    m6239constructorimpl = Result.m6239constructorimpl(ZenvaroTab.valueOf(str35));
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    m6239constructorimpl = Result.m6239constructorimpl(ResultKt.createFailure(th));
                }
                ZenvaroTab zenvaroTab = ZenvaroTab.OVERVIEW;
                if (Result.m6245isFailureimpl(m6239constructorimpl)) {
                    m6239constructorimpl = zenvaroTab;
                }
                ZenvaroTab zenvaroTab2 = (ZenvaroTab) m6239constructorimpl;
                String str36 = (String) CollectionsKt.getOrNull(split$default7, 1);
                if (str36 != null) {
                    String str37 = str36;
                    if (StringsKt.isBlank(str37)) {
                        str37 = null;
                    }
                    str = str37;
                } else {
                    str = null;
                }
                String str38 = (String) CollectionsKt.getOrNull(split$default7, 2);
                if (str38 != null) {
                    String str39 = str38;
                    str2 = StringsKt.isBlank(str39) ? null : str39;
                } else {
                    str2 = null;
                }
                MutableStateFlow<AppUiState> mutableStateFlow = this._uiState;
                do {
                    value = mutableStateFlow.getValue();
                    copy = r17.copy((r26 & 1) != 0 ? r17.selectedTab : zenvaroTab2, (r26 & 2) != 0 ? r17.selectedAreaId : str, (r26 & 4) != 0 ? r17.selectedShelfId : str2, (r26 & 8) != 0 ? r17.showAreaDialog : false, (r26 & 16) != 0 ? r17.showShelfDialog : false, (r26 & 32) != 0 ? r17.showItemDialog : false, (r26 & 64) != 0 ? r17.editingAreaId : null, (r26 & 128) != 0 ? r17.editingShelfId : null, (r26 & 256) != 0 ? r17.editingItemId : null, (r26 & 512) != 0 ? r17.areaToDelete : null, (r26 & 1024) != 0 ? r17.shelfToDelete : null, (r26 & 2048) != 0 ? value.itemToDelete : null);
                } while (!mutableStateFlow.compareAndSet(value, copy));
            }
        } catch (Throwable unused) {
        }
    }

    private final void saveAll() {
        try {
            String joinToString$default = CollectionsKt.joinToString$default(this._areas.getValue(), "¶", null, null, 0, null, new Function1<StorageArea, CharSequence>() { // from class: com.zennvvarroo.pealkkk.ui.MainViewModel$saveAll$a$1
                @Override // kotlin.jvm.functions.Function1
                public final CharSequence invoke(StorageArea it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return CollectionsKt.joinToString$default(CollectionsKt.listOf(it.getId(), ParsersKt.sanitize(it.getTitle()), ParsersKt.sanitize(it.getNote()), it.getColor().name(), Long.valueOf(it.getCreatedAt()), Long.valueOf(it.getUpdatedAt())), "§", null, null, 0, null, null, 62, null);
                }
            }, 30, null);
            String joinToString$default2 = CollectionsKt.joinToString$default(this._shelves.getValue(), "¶", null, null, 0, null, new Function1<StorageShelf, CharSequence>() { // from class: com.zennvvarroo.pealkkk.ui.MainViewModel$saveAll$s$1
                @Override // kotlin.jvm.functions.Function1
                public final CharSequence invoke(StorageShelf it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return CollectionsKt.joinToString$default(CollectionsKt.listOf(it.getId(), it.getAreaId(), ParsersKt.sanitize(it.getTitle()), ParsersKt.sanitize(it.getNote()), Long.valueOf(it.getCreatedAt()), Long.valueOf(it.getUpdatedAt())), "§", null, null, 0, null, null, 62, null);
                }
            }, 30, null);
            String joinToString$default3 = CollectionsKt.joinToString$default(this._items.getValue(), "¶", null, null, 0, null, new Function1<StoredItem, CharSequence>() { // from class: com.zennvvarroo.pealkkk.ui.MainViewModel$saveAll$i$1
                @Override // kotlin.jvm.functions.Function1
                public final CharSequence invoke(StoredItem it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return CollectionsKt.joinToString$default(CollectionsKt.listOf(it.getId(), it.getShelfId(), ParsersKt.sanitize(it.getTitle()), Integer.valueOf(it.getQuantity()), Integer.valueOf(it.getMinimumQuantity()), it.getCategory().name(), ParsersKt.sanitize(it.getContainer()), ParsersKt.sanitize(it.getNote()), Long.valueOf(it.getCreatedAt()), Long.valueOf(it.getUpdatedAt())), "§", null, null, 0, null, null, 62, null);
                }
            }, 30, null);
            String[] strArr = new String[3];
            strArr[0] = this._uiState.getValue().getSelectedTab().name();
            String selectedAreaId = this._uiState.getValue().getSelectedAreaId();
            String str = "";
            if (selectedAreaId == null) {
                selectedAreaId = "";
            }
            strArr[1] = selectedAreaId;
            String selectedShelfId = this._uiState.getValue().getSelectedShelfId();
            if (selectedShelfId != null) {
                str = selectedShelfId;
            }
            strArr[2] = str;
            this.sharedPrefs.edit().putString("zenvaro_areas", joinToString$default).putString("zenvaro_shelves", joinToString$default2).putString("zenvaro_items", joinToString$default3).putString("zenvaro_ui", CollectionsKt.joinToString$default(CollectionsKt.listOf((Object[]) strArr), "§", null, null, 0, null, null, 62, null)).apply();
        } catch (Throwable unused) {
        }
    }

    public final void selectTab(ZenvaroTab tab) {
        AppUiState copy;
        Intrinsics.checkNotNullParameter(tab, "tab");
        MutableStateFlow<AppUiState> mutableStateFlow = this._uiState;
        while (true) {
            AppUiState value = mutableStateFlow.getValue();
            MutableStateFlow<AppUiState> mutableStateFlow2 = mutableStateFlow;
            copy = r1.copy((r26 & 1) != 0 ? r1.selectedTab : tab, (r26 & 2) != 0 ? r1.selectedAreaId : null, (r26 & 4) != 0 ? r1.selectedShelfId : null, (r26 & 8) != 0 ? r1.showAreaDialog : false, (r26 & 16) != 0 ? r1.showShelfDialog : false, (r26 & 32) != 0 ? r1.showItemDialog : false, (r26 & 64) != 0 ? r1.editingAreaId : null, (r26 & 128) != 0 ? r1.editingShelfId : null, (r26 & 256) != 0 ? r1.editingItemId : null, (r26 & 512) != 0 ? r1.areaToDelete : null, (r26 & 1024) != 0 ? r1.shelfToDelete : null, (r26 & 2048) != 0 ? value.itemToDelete : null);
            if (mutableStateFlow2.compareAndSet(value, copy)) {
                saveAll();
                return;
            }
            mutableStateFlow = mutableStateFlow2;
        }
    }

    public final void selectArea(String areaId) {
        AppUiState copy;
        Intrinsics.checkNotNullParameter(areaId, "areaId");
        MutableStateFlow<AppUiState> mutableStateFlow = this._uiState;
        while (true) {
            AppUiState value = mutableStateFlow.getValue();
            MutableStateFlow<AppUiState> mutableStateFlow2 = mutableStateFlow;
            copy = r1.copy((r26 & 1) != 0 ? r1.selectedTab : null, (r26 & 2) != 0 ? r1.selectedAreaId : areaId, (r26 & 4) != 0 ? r1.selectedShelfId : null, (r26 & 8) != 0 ? r1.showAreaDialog : false, (r26 & 16) != 0 ? r1.showShelfDialog : false, (r26 & 32) != 0 ? r1.showItemDialog : false, (r26 & 64) != 0 ? r1.editingAreaId : null, (r26 & 128) != 0 ? r1.editingShelfId : null, (r26 & 256) != 0 ? r1.editingItemId : null, (r26 & 512) != 0 ? r1.areaToDelete : null, (r26 & 1024) != 0 ? r1.shelfToDelete : null, (r26 & 2048) != 0 ? value.itemToDelete : null);
            if (mutableStateFlow2.compareAndSet(value, copy)) {
                saveAll();
                return;
            }
            mutableStateFlow = mutableStateFlow2;
        }
    }

    public final void selectShelf(String shelfId) {
        AppUiState copy;
        Intrinsics.checkNotNullParameter(shelfId, "shelfId");
        MutableStateFlow<AppUiState> mutableStateFlow = this._uiState;
        while (true) {
            AppUiState value = mutableStateFlow.getValue();
            MutableStateFlow<AppUiState> mutableStateFlow2 = mutableStateFlow;
            copy = r1.copy((r26 & 1) != 0 ? r1.selectedTab : null, (r26 & 2) != 0 ? r1.selectedAreaId : null, (r26 & 4) != 0 ? r1.selectedShelfId : shelfId, (r26 & 8) != 0 ? r1.showAreaDialog : false, (r26 & 16) != 0 ? r1.showShelfDialog : false, (r26 & 32) != 0 ? r1.showItemDialog : false, (r26 & 64) != 0 ? r1.editingAreaId : null, (r26 & 128) != 0 ? r1.editingShelfId : null, (r26 & 256) != 0 ? r1.editingItemId : null, (r26 & 512) != 0 ? r1.areaToDelete : null, (r26 & 1024) != 0 ? r1.shelfToDelete : null, (r26 & 2048) != 0 ? value.itemToDelete : null);
            if (mutableStateFlow2.compareAndSet(value, copy)) {
                saveAll();
                return;
            }
            mutableStateFlow = mutableStateFlow2;
        }
    }

    public static /* synthetic */ void onOpenAreaDialog$default(MainViewModel mainViewModel, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        mainViewModel.onOpenAreaDialog(str);
    }

    public final void onOpenAreaDialog(String areaId) {
        AppUiState value;
        AppUiState copy;
        MutableStateFlow<AppUiState> mutableStateFlow = this._uiState;
        do {
            value = mutableStateFlow.getValue();
            copy = r3.copy((r26 & 1) != 0 ? r3.selectedTab : null, (r26 & 2) != 0 ? r3.selectedAreaId : null, (r26 & 4) != 0 ? r3.selectedShelfId : null, (r26 & 8) != 0 ? r3.showAreaDialog : true, (r26 & 16) != 0 ? r3.showShelfDialog : false, (r26 & 32) != 0 ? r3.showItemDialog : false, (r26 & 64) != 0 ? r3.editingAreaId : areaId, (r26 & 128) != 0 ? r3.editingShelfId : null, (r26 & 256) != 0 ? r3.editingItemId : null, (r26 & 512) != 0 ? r3.areaToDelete : null, (r26 & 1024) != 0 ? r3.shelfToDelete : null, (r26 & 2048) != 0 ? value.itemToDelete : null);
        } while (!mutableStateFlow.compareAndSet(value, copy));
    }

    public static /* synthetic */ void onOpenShelfDialog$default(MainViewModel mainViewModel, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        mainViewModel.onOpenShelfDialog(str);
    }

    public final void onOpenShelfDialog(String shelfId) {
        AppUiState value;
        AppUiState copy;
        MutableStateFlow<AppUiState> mutableStateFlow = this._uiState;
        do {
            value = mutableStateFlow.getValue();
            copy = r3.copy((r26 & 1) != 0 ? r3.selectedTab : null, (r26 & 2) != 0 ? r3.selectedAreaId : null, (r26 & 4) != 0 ? r3.selectedShelfId : null, (r26 & 8) != 0 ? r3.showAreaDialog : false, (r26 & 16) != 0 ? r3.showShelfDialog : true, (r26 & 32) != 0 ? r3.showItemDialog : false, (r26 & 64) != 0 ? r3.editingAreaId : null, (r26 & 128) != 0 ? r3.editingShelfId : shelfId, (r26 & 256) != 0 ? r3.editingItemId : null, (r26 & 512) != 0 ? r3.areaToDelete : null, (r26 & 1024) != 0 ? r3.shelfToDelete : null, (r26 & 2048) != 0 ? value.itemToDelete : null);
        } while (!mutableStateFlow.compareAndSet(value, copy));
    }

    public static /* synthetic */ void onOpenItemDialog$default(MainViewModel mainViewModel, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        mainViewModel.onOpenItemDialog(str);
    }

    public final void onOpenItemDialog(String itemId) {
        AppUiState value;
        AppUiState copy;
        MutableStateFlow<AppUiState> mutableStateFlow = this._uiState;
        do {
            value = mutableStateFlow.getValue();
            copy = r3.copy((r26 & 1) != 0 ? r3.selectedTab : null, (r26 & 2) != 0 ? r3.selectedAreaId : null, (r26 & 4) != 0 ? r3.selectedShelfId : null, (r26 & 8) != 0 ? r3.showAreaDialog : false, (r26 & 16) != 0 ? r3.showShelfDialog : false, (r26 & 32) != 0 ? r3.showItemDialog : true, (r26 & 64) != 0 ? r3.editingAreaId : null, (r26 & 128) != 0 ? r3.editingShelfId : null, (r26 & 256) != 0 ? r3.editingItemId : itemId, (r26 & 512) != 0 ? r3.areaToDelete : null, (r26 & 1024) != 0 ? r3.shelfToDelete : null, (r26 & 2048) != 0 ? value.itemToDelete : null);
        } while (!mutableStateFlow.compareAndSet(value, copy));
    }

    public final void onDialogDismiss() {
        AppUiState value;
        AppUiState copy;
        MutableStateFlow<AppUiState> mutableStateFlow = this._uiState;
        do {
            value = mutableStateFlow.getValue();
            copy = r3.copy((r26 & 1) != 0 ? r3.selectedTab : null, (r26 & 2) != 0 ? r3.selectedAreaId : null, (r26 & 4) != 0 ? r3.selectedShelfId : null, (r26 & 8) != 0 ? r3.showAreaDialog : false, (r26 & 16) != 0 ? r3.showShelfDialog : false, (r26 & 32) != 0 ? r3.showItemDialog : false, (r26 & 64) != 0 ? r3.editingAreaId : null, (r26 & 128) != 0 ? r3.editingShelfId : null, (r26 & 256) != 0 ? r3.editingItemId : null, (r26 & 512) != 0 ? r3.areaToDelete : null, (r26 & 1024) != 0 ? r3.shelfToDelete : null, (r26 & 2048) != 0 ? value.itemToDelete : null);
        } while (!mutableStateFlow.compareAndSet(value, copy));
    }

    public final void addArea(String title, String note, AreaColor color) {
        List<StorageArea> value;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(note, "note");
        Intrinsics.checkNotNullParameter(color, "color");
        long currentTimeMillis = System.currentTimeMillis();
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
        String obj = StringsKt.trim((CharSequence) title).toString();
        if (StringsKt.isBlank(obj)) {
            obj = "Area";
        }
        StorageArea storageArea = new StorageArea(uuid, obj, StringsKt.trim((CharSequence) note).toString(), color, currentTimeMillis, currentTimeMillis);
        MutableStateFlow<List<StorageArea>> mutableStateFlow = this._areas;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, CollectionsKt.plus((Collection<? extends StorageArea>) value, storageArea)));
        saveAll();
    }

    public final void updateArea(String id, String title, String note, AreaColor color) {
        List<StorageArea> list;
        MutableStateFlow<List<StorageArea>> mutableStateFlow;
        ArrayList arrayList;
        String id2 = id;
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(note, "note");
        Intrinsics.checkNotNullParameter(color, "color");
        MutableStateFlow<List<StorageArea>> mutableStateFlow2 = this._areas;
        while (true) {
            List<StorageArea> value = mutableStateFlow2.getValue();
            List<StorageArea> list2 = value;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            for (StorageArea storageArea : list2) {
                if (Intrinsics.areEqual(storageArea.getId(), id2)) {
                    String obj = StringsKt.trim((CharSequence) title).toString();
                    if (StringsKt.isBlank(obj)) {
                        obj = "Area";
                    }
                    list = value;
                    mutableStateFlow = mutableStateFlow2;
                    storageArea = storageArea.copy((r18 & 1) != 0 ? storageArea.id : null, (r18 & 2) != 0 ? storageArea.title : obj, (r18 & 4) != 0 ? storageArea.note : StringsKt.trim((CharSequence) note).toString(), (r18 & 8) != 0 ? storageArea.color : color, (r18 & 16) != 0 ? storageArea.createdAt : 0L, (r18 & 32) != 0 ? storageArea.updatedAt : System.currentTimeMillis());
                    arrayList = arrayList2;
                } else {
                    list = value;
                    mutableStateFlow = mutableStateFlow2;
                    arrayList = arrayList2;
                }
                arrayList.add(storageArea);
                mutableStateFlow2 = mutableStateFlow;
                arrayList2 = arrayList;
                value = list;
                id2 = id;
            }
            MutableStateFlow<List<StorageArea>> mutableStateFlow3 = mutableStateFlow2;
            if (mutableStateFlow3.compareAndSet(value, arrayList2)) {
                saveAll();
                return;
            } else {
                mutableStateFlow2 = mutableStateFlow3;
                id2 = id;
            }
        }
    }

    private final void deleteArea(String id) {
        List<StoredItem> value;
        ArrayList arrayList;
        List<StorageShelf> value2;
        ArrayList arrayList2;
        List<StorageArea> value3;
        ArrayList arrayList3;
        AppUiState value4;
        AppUiState copy;
        AppUiState value5;
        AppUiState copy2;
        List<StorageShelf> value6 = this._shelves.getValue();
        ArrayList arrayList4 = new ArrayList();
        for (Object obj : value6) {
            if (Intrinsics.areEqual(((StorageShelf) obj).getAreaId(), id)) {
                arrayList4.add(obj);
            }
        }
        ArrayList arrayList5 = arrayList4;
        ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList5, 10));
        Iterator it = arrayList5.iterator();
        while (it.hasNext()) {
            arrayList6.add(((StorageShelf) it.next()).getId());
        }
        ArrayList arrayList7 = arrayList6;
        MutableStateFlow<List<StoredItem>> mutableStateFlow = this._items;
        do {
            value = mutableStateFlow.getValue();
            arrayList = new ArrayList();
            for (Object obj2 : value) {
                if (!arrayList7.contains(((StoredItem) obj2).getShelfId())) {
                    arrayList.add(obj2);
                }
            }
        } while (!mutableStateFlow.compareAndSet(value, arrayList));
        MutableStateFlow<List<StorageShelf>> mutableStateFlow2 = this._shelves;
        do {
            value2 = mutableStateFlow2.getValue();
            arrayList2 = new ArrayList();
            for (Object obj3 : value2) {
                if (!Intrinsics.areEqual(((StorageShelf) obj3).getAreaId(), id)) {
                    arrayList2.add(obj3);
                }
            }
        } while (!mutableStateFlow2.compareAndSet(value2, arrayList2));
        MutableStateFlow<List<StorageArea>> mutableStateFlow3 = this._areas;
        do {
            value3 = mutableStateFlow3.getValue();
            arrayList3 = new ArrayList();
            for (Object obj4 : value3) {
                if (!Intrinsics.areEqual(((StorageArea) obj4).getId(), id)) {
                    arrayList3.add(obj4);
                }
            }
        } while (!mutableStateFlow3.compareAndSet(value3, arrayList3));
        if (Intrinsics.areEqual(this._uiState.getValue().getSelectedAreaId(), id)) {
            MutableStateFlow<AppUiState> mutableStateFlow4 = this._uiState;
            do {
                value5 = mutableStateFlow4.getValue();
                copy2 = r3.copy((r26 & 1) != 0 ? r3.selectedTab : null, (r26 & 2) != 0 ? r3.selectedAreaId : null, (r26 & 4) != 0 ? r3.selectedShelfId : null, (r26 & 8) != 0 ? r3.showAreaDialog : false, (r26 & 16) != 0 ? r3.showShelfDialog : false, (r26 & 32) != 0 ? r3.showItemDialog : false, (r26 & 64) != 0 ? r3.editingAreaId : null, (r26 & 128) != 0 ? r3.editingShelfId : null, (r26 & 256) != 0 ? r3.editingItemId : null, (r26 & 512) != 0 ? r3.areaToDelete : null, (r26 & 1024) != 0 ? r3.shelfToDelete : null, (r26 & 2048) != 0 ? value5.itemToDelete : null);
            } while (!mutableStateFlow4.compareAndSet(value5, copy2));
        }
        List<StorageShelf> value7 = this._shelves.getValue();
        if (!(value7 instanceof Collection) || !value7.isEmpty()) {
            Iterator<T> it2 = value7.iterator();
            while (it2.hasNext()) {
                if (Intrinsics.areEqual(((StorageShelf) it2.next()).getId(), this._uiState.getValue().getSelectedShelfId())) {
                    break;
                }
            }
        }
        MutableStateFlow<AppUiState> mutableStateFlow5 = this._uiState;
        do {
            value4 = mutableStateFlow5.getValue();
            copy = r4.copy((r26 & 1) != 0 ? r4.selectedTab : null, (r26 & 2) != 0 ? r4.selectedAreaId : null, (r26 & 4) != 0 ? r4.selectedShelfId : null, (r26 & 8) != 0 ? r4.showAreaDialog : false, (r26 & 16) != 0 ? r4.showShelfDialog : false, (r26 & 32) != 0 ? r4.showItemDialog : false, (r26 & 64) != 0 ? r4.editingAreaId : null, (r26 & 128) != 0 ? r4.editingShelfId : null, (r26 & 256) != 0 ? r4.editingItemId : null, (r26 & 512) != 0 ? r4.areaToDelete : null, (r26 & 1024) != 0 ? r4.shelfToDelete : null, (r26 & 2048) != 0 ? value4.itemToDelete : null);
        } while (!mutableStateFlow5.compareAndSet(value4, copy));
        saveAll();
    }

    public final void addShelf(String areaId, String title, String note) {
        List<StorageShelf> value;
        Intrinsics.checkNotNullParameter(areaId, "areaId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(note, "note");
        long currentTimeMillis = System.currentTimeMillis();
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
        String obj = StringsKt.trim((CharSequence) title).toString();
        if (StringsKt.isBlank(obj)) {
            obj = "Shelf";
        }
        StorageShelf storageShelf = new StorageShelf(uuid, areaId, obj, StringsKt.trim((CharSequence) note).toString(), currentTimeMillis, currentTimeMillis);
        MutableStateFlow<List<StorageShelf>> mutableStateFlow = this._shelves;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, CollectionsKt.plus((Collection<? extends StorageShelf>) value, storageShelf)));
        saveAll();
    }

    public final void updateShelf(String id, String areaId, String title, String note) {
        List<StorageShelf> list;
        MutableStateFlow<List<StorageShelf>> mutableStateFlow;
        ArrayList arrayList;
        String id2 = id;
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(areaId, "areaId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(note, "note");
        MutableStateFlow<List<StorageShelf>> mutableStateFlow2 = this._shelves;
        while (true) {
            List<StorageShelf> value = mutableStateFlow2.getValue();
            List<StorageShelf> list2 = value;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            for (StorageShelf storageShelf : list2) {
                if (Intrinsics.areEqual(storageShelf.getId(), id2)) {
                    String obj = StringsKt.trim((CharSequence) title).toString();
                    if (StringsKt.isBlank(obj)) {
                        obj = "Shelf";
                    }
                    list = value;
                    mutableStateFlow = mutableStateFlow2;
                    storageShelf = storageShelf.copy((r18 & 1) != 0 ? storageShelf.id : null, (r18 & 2) != 0 ? storageShelf.areaId : areaId, (r18 & 4) != 0 ? storageShelf.title : obj, (r18 & 8) != 0 ? storageShelf.note : StringsKt.trim((CharSequence) note).toString(), (r18 & 16) != 0 ? storageShelf.createdAt : 0L, (r18 & 32) != 0 ? storageShelf.updatedAt : System.currentTimeMillis());
                    arrayList = arrayList2;
                } else {
                    list = value;
                    mutableStateFlow = mutableStateFlow2;
                    arrayList = arrayList2;
                }
                arrayList.add(storageShelf);
                mutableStateFlow2 = mutableStateFlow;
                arrayList2 = arrayList;
                value = list;
                id2 = id;
            }
            MutableStateFlow<List<StorageShelf>> mutableStateFlow3 = mutableStateFlow2;
            if (mutableStateFlow3.compareAndSet(value, arrayList2)) {
                saveAll();
                return;
            } else {
                mutableStateFlow2 = mutableStateFlow3;
                id2 = id;
            }
        }
    }

    private final void deleteShelf(String id) {
        List<StoredItem> value;
        ArrayList arrayList;
        List<StorageShelf> value2;
        ArrayList arrayList2;
        AppUiState value3;
        AppUiState copy;
        MutableStateFlow<List<StoredItem>> mutableStateFlow = this._items;
        do {
            value = mutableStateFlow.getValue();
            arrayList = new ArrayList();
            for (Object obj : value) {
                if (!Intrinsics.areEqual(((StoredItem) obj).getShelfId(), id)) {
                    arrayList.add(obj);
                }
            }
        } while (!mutableStateFlow.compareAndSet(value, arrayList));
        MutableStateFlow<List<StorageShelf>> mutableStateFlow2 = this._shelves;
        do {
            value2 = mutableStateFlow2.getValue();
            arrayList2 = new ArrayList();
            for (Object obj2 : value2) {
                if (!Intrinsics.areEqual(((StorageShelf) obj2).getId(), id)) {
                    arrayList2.add(obj2);
                }
            }
        } while (!mutableStateFlow2.compareAndSet(value2, arrayList2));
        if (Intrinsics.areEqual(this._uiState.getValue().getSelectedShelfId(), id)) {
            MutableStateFlow<AppUiState> mutableStateFlow3 = this._uiState;
            do {
                value3 = mutableStateFlow3.getValue();
                copy = r3.copy((r26 & 1) != 0 ? r3.selectedTab : null, (r26 & 2) != 0 ? r3.selectedAreaId : null, (r26 & 4) != 0 ? r3.selectedShelfId : null, (r26 & 8) != 0 ? r3.showAreaDialog : false, (r26 & 16) != 0 ? r3.showShelfDialog : false, (r26 & 32) != 0 ? r3.showItemDialog : false, (r26 & 64) != 0 ? r3.editingAreaId : null, (r26 & 128) != 0 ? r3.editingShelfId : null, (r26 & 256) != 0 ? r3.editingItemId : null, (r26 & 512) != 0 ? r3.areaToDelete : null, (r26 & 1024) != 0 ? r3.shelfToDelete : null, (r26 & 2048) != 0 ? value3.itemToDelete : null);
            } while (!mutableStateFlow3.compareAndSet(value3, copy));
        }
        saveAll();
    }

    public final void addItem(String shelfId, String title, int quantity, int minimumQuantity, ItemCategory category, String container, String note) {
        List<StoredItem> value;
        Intrinsics.checkNotNullParameter(shelfId, "shelfId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(note, "note");
        long currentTimeMillis = System.currentTimeMillis();
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
        String obj = StringsKt.trim((CharSequence) title).toString();
        if (StringsKt.isBlank(obj)) {
            obj = "Item";
        }
        StoredItem storedItem = new StoredItem(uuid, shelfId, obj, RangesKt.coerceIn(quantity, 0, 999999), RangesKt.coerceIn(minimumQuantity, 0, 999999), category, StringsKt.trim((CharSequence) container).toString(), StringsKt.trim((CharSequence) note).toString(), currentTimeMillis, currentTimeMillis);
        MutableStateFlow<List<StoredItem>> mutableStateFlow = this._items;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, CollectionsKt.plus((Collection<? extends StoredItem>) value, storedItem)));
        saveAll();
    }

    public final void updateItem(String id, String shelfId, String title, int quantity, int minimumQuantity, ItemCategory category, String container, String note) {
        List<StoredItem> list;
        MutableStateFlow<List<StoredItem>> mutableStateFlow;
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(shelfId, "shelfId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(note, "note");
        MutableStateFlow<List<StoredItem>> mutableStateFlow2 = this._items;
        while (true) {
            List<StoredItem> value = mutableStateFlow2.getValue();
            List<StoredItem> list2 = value;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            for (StoredItem storedItem : list2) {
                if (Intrinsics.areEqual(storedItem.getId(), id)) {
                    String obj = StringsKt.trim((CharSequence) title).toString();
                    if (StringsKt.isBlank(obj)) {
                        obj = "Item";
                    }
                    list = value;
                    mutableStateFlow = mutableStateFlow2;
                    storedItem = storedItem.copy((r27 & 1) != 0 ? storedItem.id : null, (r27 & 2) != 0 ? storedItem.shelfId : shelfId, (r27 & 4) != 0 ? storedItem.title : obj, (r27 & 8) != 0 ? storedItem.quantity : RangesKt.coerceIn(quantity, 0, 999999), (r27 & 16) != 0 ? storedItem.minimumQuantity : RangesKt.coerceIn(minimumQuantity, 0, 999999), (r27 & 32) != 0 ? storedItem.category : category, (r27 & 64) != 0 ? storedItem.container : StringsKt.trim((CharSequence) container).toString(), (r27 & 128) != 0 ? storedItem.note : StringsKt.trim((CharSequence) note).toString(), (r27 & 256) != 0 ? storedItem.createdAt : 0L, (r27 & 512) != 0 ? storedItem.updatedAt : System.currentTimeMillis());
                    arrayList = arrayList2;
                } else {
                    list = value;
                    mutableStateFlow = mutableStateFlow2;
                    arrayList = arrayList2;
                }
                arrayList.add(storedItem);
                arrayList2 = arrayList;
                value = list;
                mutableStateFlow2 = mutableStateFlow;
            }
            MutableStateFlow<List<StoredItem>> mutableStateFlow3 = mutableStateFlow2;
            if (mutableStateFlow3.compareAndSet(value, arrayList2)) {
                saveAll();
                return;
            }
            mutableStateFlow2 = mutableStateFlow3;
        }
    }

    private final void deleteItem(String id) {
        List<StoredItem> value;
        ArrayList arrayList;
        MutableStateFlow<List<StoredItem>> mutableStateFlow = this._items;
        do {
            value = mutableStateFlow.getValue();
            arrayList = new ArrayList();
            for (Object obj : value) {
                if (!Intrinsics.areEqual(((StoredItem) obj).getId(), id)) {
                    arrayList.add(obj);
                }
            }
        } while (!mutableStateFlow.compareAndSet(value, arrayList));
        saveAll();
    }

    public final void changeQuantity(String id, int delta) {
        List<StoredItem> value;
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(id, "id");
        MutableStateFlow<List<StoredItem>> mutableStateFlow = this._items;
        do {
            value = mutableStateFlow.getValue();
            List<StoredItem> list = value;
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (StoredItem storedItem : list) {
                if (Intrinsics.areEqual(storedItem.getId(), id)) {
                    storedItem = storedItem.copy((r27 & 1) != 0 ? storedItem.id : null, (r27 & 2) != 0 ? storedItem.shelfId : null, (r27 & 4) != 0 ? storedItem.title : null, (r27 & 8) != 0 ? storedItem.quantity : RangesKt.coerceIn(storedItem.getQuantity() + delta, 0, 999999), (r27 & 16) != 0 ? storedItem.minimumQuantity : 0, (r27 & 32) != 0 ? storedItem.category : null, (r27 & 64) != 0 ? storedItem.container : null, (r27 & 128) != 0 ? storedItem.note : null, (r27 & 256) != 0 ? storedItem.createdAt : 0L, (r27 & 512) != 0 ? storedItem.updatedAt : System.currentTimeMillis());
                }
                arrayList.add(storedItem);
            }
        } while (!mutableStateFlow.compareAndSet(value, arrayList));
        saveAll();
    }

    public final void onInitiateDelete(Object entity) {
        AppUiState value;
        AppUiState appUiState;
        Intrinsics.checkNotNullParameter(entity, "entity");
        MutableStateFlow<AppUiState> mutableStateFlow = this._uiState;
        do {
            value = mutableStateFlow.getValue();
            appUiState = value;
            if (entity instanceof StorageArea) {
                appUiState = appUiState.copy((r26 & 1) != 0 ? appUiState.selectedTab : null, (r26 & 2) != 0 ? appUiState.selectedAreaId : null, (r26 & 4) != 0 ? appUiState.selectedShelfId : null, (r26 & 8) != 0 ? appUiState.showAreaDialog : false, (r26 & 16) != 0 ? appUiState.showShelfDialog : false, (r26 & 32) != 0 ? appUiState.showItemDialog : false, (r26 & 64) != 0 ? appUiState.editingAreaId : null, (r26 & 128) != 0 ? appUiState.editingShelfId : null, (r26 & 256) != 0 ? appUiState.editingItemId : null, (r26 & 512) != 0 ? appUiState.areaToDelete : (StorageArea) entity, (r26 & 1024) != 0 ? appUiState.shelfToDelete : null, (r26 & 2048) != 0 ? appUiState.itemToDelete : null);
            } else if (entity instanceof StorageShelf) {
                appUiState = appUiState.copy((r26 & 1) != 0 ? appUiState.selectedTab : null, (r26 & 2) != 0 ? appUiState.selectedAreaId : null, (r26 & 4) != 0 ? appUiState.selectedShelfId : null, (r26 & 8) != 0 ? appUiState.showAreaDialog : false, (r26 & 16) != 0 ? appUiState.showShelfDialog : false, (r26 & 32) != 0 ? appUiState.showItemDialog : false, (r26 & 64) != 0 ? appUiState.editingAreaId : null, (r26 & 128) != 0 ? appUiState.editingShelfId : null, (r26 & 256) != 0 ? appUiState.editingItemId : null, (r26 & 512) != 0 ? appUiState.areaToDelete : null, (r26 & 1024) != 0 ? appUiState.shelfToDelete : (StorageShelf) entity, (r26 & 2048) != 0 ? appUiState.itemToDelete : null);
            } else if (entity instanceof StoredItem) {
                appUiState = appUiState.copy((r26 & 1) != 0 ? appUiState.selectedTab : null, (r26 & 2) != 0 ? appUiState.selectedAreaId : null, (r26 & 4) != 0 ? appUiState.selectedShelfId : null, (r26 & 8) != 0 ? appUiState.showAreaDialog : false, (r26 & 16) != 0 ? appUiState.showShelfDialog : false, (r26 & 32) != 0 ? appUiState.showItemDialog : false, (r26 & 64) != 0 ? appUiState.editingAreaId : null, (r26 & 128) != 0 ? appUiState.editingShelfId : null, (r26 & 256) != 0 ? appUiState.editingItemId : null, (r26 & 512) != 0 ? appUiState.areaToDelete : null, (r26 & 1024) != 0 ? appUiState.shelfToDelete : null, (r26 & 2048) != 0 ? appUiState.itemToDelete : (StoredItem) entity);
            }
        } while (!mutableStateFlow.compareAndSet(value, appUiState));
    }

    public final void onConfirmDelete() {
        AppUiState value = this._uiState.getValue();
        if (value.getAreaToDelete() != null) {
            deleteArea(value.getAreaToDelete().getId());
        } else if (value.getShelfToDelete() != null) {
            deleteShelf(value.getShelfToDelete().getId());
        } else if (value.getItemToDelete() != null) {
            deleteItem(value.getItemToDelete().getId());
        }
        onDismissDelete();
    }

    public final void onDismissDelete() {
        AppUiState value;
        AppUiState copy;
        MutableStateFlow<AppUiState> mutableStateFlow = this._uiState;
        do {
            value = mutableStateFlow.getValue();
            copy = r3.copy((r26 & 1) != 0 ? r3.selectedTab : null, (r26 & 2) != 0 ? r3.selectedAreaId : null, (r26 & 4) != 0 ? r3.selectedShelfId : null, (r26 & 8) != 0 ? r3.showAreaDialog : false, (r26 & 16) != 0 ? r3.showShelfDialog : false, (r26 & 32) != 0 ? r3.showItemDialog : false, (r26 & 64) != 0 ? r3.editingAreaId : null, (r26 & 128) != 0 ? r3.editingShelfId : null, (r26 & 256) != 0 ? r3.editingItemId : null, (r26 & 512) != 0 ? r3.areaToDelete : null, (r26 & 1024) != 0 ? r3.shelfToDelete : null, (r26 & 2048) != 0 ? value.itemToDelete : null);
        } while (!mutableStateFlow.compareAndSet(value, copy));
    }

    public final void loadDemoData() {
        AppUiState value;
        AppUiState copy;
        this._areas.setValue(CollectionsKt.emptyList());
        this._shelves.setValue(CollectionsKt.emptyList());
        this._items.setValue(CollectionsKt.emptyList());
        long currentTimeMillis = System.currentTimeMillis();
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
        StorageArea storageArea = new StorageArea(uuid, "Garage", "Tools and paint", AreaColor.ORANGE, currentTimeMillis, currentTimeMillis);
        String uuid2 = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid2, "toString(...)");
        StorageArea storageArea2 = new StorageArea(uuid2, "Kitchen", "Food and cleaning", AreaColor.GREEN, currentTimeMillis, currentTimeMillis);
        String uuid3 = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid3, "toString(...)");
        StorageArea storageArea3 = new StorageArea(uuid3, "Office", "Documents and cables", AreaColor.CYAN, currentTimeMillis, currentTimeMillis);
        this._areas.setValue(CollectionsKt.listOf((Object[]) new StorageArea[]{storageArea, storageArea2, storageArea3}));
        String uuid4 = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid4, "toString(...)");
        StorageShelf storageShelf = new StorageShelf(uuid4, storageArea.getId(), "Tool Shelf", "Hand tools", currentTimeMillis, currentTimeMillis);
        String uuid5 = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid5, "toString(...)");
        StorageShelf storageShelf2 = new StorageShelf(uuid5, storageArea.getId(), "Paint Shelf", "Paints and rollers", currentTimeMillis, currentTimeMillis);
        String uuid6 = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid6, "toString(...)");
        StorageShelf storageShelf3 = new StorageShelf(uuid6, storageArea2.getId(), "Pantry", "Dry food", currentTimeMillis, currentTimeMillis);
        String uuid7 = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid7, "toString(...)");
        StorageShelf storageShelf4 = new StorageShelf(uuid7, storageArea2.getId(), "Cleaning Cabinet", "Supplies", currentTimeMillis, currentTimeMillis);
        String uuid8 = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid8, "toString(...)");
        StorageShelf storageShelf5 = new StorageShelf(uuid8, storageArea3.getId(), "Document Shelf", "Papers", currentTimeMillis, currentTimeMillis);
        String uuid9 = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid9, "toString(...)");
        StorageShelf storageShelf6 = new StorageShelf(uuid9, storageArea3.getId(), "Electronics Drawer", "Cables", currentTimeMillis, currentTimeMillis);
        this._shelves.setValue(CollectionsKt.listOf((Object[]) new StorageShelf[]{storageShelf, storageShelf2, storageShelf3, storageShelf4, storageShelf5, storageShelf6}));
        ArrayList arrayList = new ArrayList();
        String uuid10 = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid10, "toString(...)");
        arrayList.add(new StoredItem(uuid10, storageShelf.getId(), "Hammer", 2, 1, ItemCategory.TOOLS, "Toolbox", "Steel head", currentTimeMillis, currentTimeMillis));
        String uuid11 = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid11, "toString(...)");
        arrayList.add(new StoredItem(uuid11, storageShelf.getId(), "Screwdriver Set", 1, 1, ItemCategory.TOOLS, "Case", "Phillips + flat", currentTimeMillis, currentTimeMillis));
        String uuid12 = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid12, "toString(...)");
        arrayList.add(new StoredItem(uuid12, storageShelf2.getId(), "Paint Rollers", 0, 2, ItemCategory.TOOLS, "Bag", "Need refill", currentTimeMillis, currentTimeMillis));
        String uuid13 = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid13, "toString(...)");
        arrayList.add(new StoredItem(uuid13, storageShelf6.getId(), "Extension Cable", 3, 1, ItemCategory.ELECTRONICS, "Drawer", "5m", currentTimeMillis, currentTimeMillis));
        String uuid14 = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid14, "toString(...)");
        arrayList.add(new StoredItem(uuid14, storageShelf3.getId(), "Rice Container", 4, 2, ItemCategory.FOOD, "Jar", "Basmati", currentTimeMillis, currentTimeMillis));
        String uuid15 = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid15, "toString(...)");
        arrayList.add(new StoredItem(uuid15, storageShelf3.getId(), "Coffee", 1, 2, ItemCategory.FOOD, "Bag", "Running low", currentTimeMillis, currentTimeMillis));
        String uuid16 = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid16, "toString(...)");
        arrayList.add(new StoredItem(uuid16, storageShelf4.getId(), "Cleaning Spray", 2, 1, ItemCategory.CLEANING, "Bottle", "Multi surface", currentTimeMillis, currentTimeMillis));
        String uuid17 = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid17, "toString(...)");
        arrayList.add(new StoredItem(uuid17, storageShelf5.getId(), "Printer Paper", 5, 2, ItemCategory.OFFICE, "Pack", "A4", currentTimeMillis, currentTimeMillis));
        String uuid18 = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid18, "toString(...)");
        arrayList.add(new StoredItem(uuid18, storageShelf6.getId(), "USB-C Cables", 6, 2, ItemCategory.ELECTRONICS, "Box", "1m each", currentTimeMillis, currentTimeMillis));
        String uuid19 = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid19, "toString(...)");
        arrayList.add(new StoredItem(uuid19, storageShelf5.getId(), "Archive Documents", 12, 0, ItemCategory.DOCUMENTS, "Binder", "2023", currentTimeMillis, currentTimeMillis));
        this._items.setValue(arrayList);
        MutableStateFlow<AppUiState> mutableStateFlow = this._uiState;
        do {
            value = mutableStateFlow.getValue();
            copy = r21.copy((r26 & 1) != 0 ? r21.selectedTab : ZenvaroTab.OVERVIEW, (r26 & 2) != 0 ? r21.selectedAreaId : storageArea.getId(), (r26 & 4) != 0 ? r21.selectedShelfId : storageShelf.getId(), (r26 & 8) != 0 ? r21.showAreaDialog : false, (r26 & 16) != 0 ? r21.showShelfDialog : false, (r26 & 32) != 0 ? r21.showItemDialog : false, (r26 & 64) != 0 ? r21.editingAreaId : null, (r26 & 128) != 0 ? r21.editingShelfId : null, (r26 & 256) != 0 ? r21.editingItemId : null, (r26 & 512) != 0 ? r21.areaToDelete : null, (r26 & 1024) != 0 ? r21.shelfToDelete : null, (r26 & 2048) != 0 ? value.itemToDelete : null);
        } while (!mutableStateFlow.compareAndSet(value, copy));
        saveAll();
    }
}
