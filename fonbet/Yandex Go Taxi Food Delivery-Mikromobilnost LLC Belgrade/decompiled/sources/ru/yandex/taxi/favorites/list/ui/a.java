package ru.yandex.taxi.favorites.list.ui;

import com.yandex.go.slot.dto.SlotItemDto;
import defpackage.chp;
import defpackage.crk0;
import defpackage.evu0;
import defpackage.grk0;
import defpackage.jrk0;
import defpackage.khp;
import defpackage.krk0;
import defpackage.nhp;
import defpackage.ny61;
import defpackage.ohp;
import defpackage.php;
import defpackage.qhp;
import defpackage.shp;
import defpackage.xss0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes5.dex */
public final class a {
    public final ru.yandex.taxi.widget.utils.e a;
    public final com.yandex.go.slot.mapper.a b;
    public final chp c;

    public a(ru.yandex.taxi.widget.utils.e eVar, com.yandex.go.slot.mapper.a aVar, chp chpVar) {
        this.a = eVar;
        this.b = aVar;
        this.c = chpVar;
    }

    public final Object a(SlotItemDto slotItemDto, Continuation continuation) {
        if (slotItemDto == null) {
            return null;
        }
        return this.b.e(slotItemDto, this.c, false, false, null, (ContinuationImpl) continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0075, code lost:
    
        if (r9 == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0080 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(khp.a aVar, ContinuationImpl continuationImpl) {
        FavoriteUiStateInteractor$mapHeader$1 favoriteUiStateInteractor$mapHeader$1;
        int i;
        String str;
        CharSequence charSequence;
        CharSequence charSequence2;
        String str2;
        if (continuationImpl instanceof FavoriteUiStateInteractor$mapHeader$1) {
            favoriteUiStateInteractor$mapHeader$1 = (FavoriteUiStateInteractor$mapHeader$1) continuationImpl;
            int i2 = favoriteUiStateInteractor$mapHeader$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                favoriteUiStateInteractor$mapHeader$1.label = i2 - Integer.MIN_VALUE;
                Object obj = favoriteUiStateInteractor$mapHeader$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = favoriteUiStateInteractor$mapHeader$1.label;
                ru.yandex.taxi.widget.utils.e eVar = this.a;
                CharSequence charSequence3 = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    khp.a.C0099a c0099a = aVar.a;
                    khp.a.C0099a.C0100a c0100a = c0099a.b;
                    str = c0100a != null ? c0100a.a : null;
                    FormattedText formattedText = c0099a.a;
                    favoriteUiStateInteractor$mapHeader$1.L$0 = aVar;
                    favoriteUiStateInteractor$mapHeader$1.L$1 = null;
                    favoriteUiStateInteractor$mapHeader$1.L$2 = str;
                    favoriteUiStateInteractor$mapHeader$1.label = 1;
                    obj = eVar.t(formattedText, favoriteUiStateInteractor$mapHeader$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        charSequence2 = (CharSequence) favoriteUiStateInteractor$mapHeader$1.L$3;
                        str2 = (String) favoriteUiStateInteractor$mapHeader$1.L$2;
                        kotlin.b.b(obj);
                        charSequence3 = (CharSequence) obj;
                        charSequence = charSequence2;
                        str = str2;
                        return new nhp(charSequence, charSequence3, str);
                    }
                    String str3 = (String) favoriteUiStateInteractor$mapHeader$1.L$2;
                    khp.a aVar2 = (khp.a) favoriteUiStateInteractor$mapHeader$1.L$0;
                    kotlin.b.b(obj);
                    str = str3;
                    aVar = aVar2;
                }
                charSequence = (CharSequence) obj;
                if (!evu0.J(charSequence)) {
                    return null;
                }
                FormattedText formattedText2 = aVar.b;
                if (formattedText2 != null) {
                    favoriteUiStateInteractor$mapHeader$1.L$0 = null;
                    favoriteUiStateInteractor$mapHeader$1.L$1 = null;
                    favoriteUiStateInteractor$mapHeader$1.L$2 = str;
                    favoriteUiStateInteractor$mapHeader$1.L$3 = charSequence;
                    favoriteUiStateInteractor$mapHeader$1.L$4 = null;
                    favoriteUiStateInteractor$mapHeader$1.label = 2;
                    Object t = eVar.t(formattedText2, favoriteUiStateInteractor$mapHeader$1);
                    if (t != coroutineSingletons) {
                        obj = t;
                        charSequence2 = charSequence;
                        str2 = str;
                        charSequence3 = (CharSequence) obj;
                        charSequence = charSequence2;
                        str = str2;
                    }
                    return coroutineSingletons;
                }
                return new nhp(charSequence, charSequence3, str);
            }
        }
        favoriteUiStateInteractor$mapHeader$1 = new FavoriteUiStateInteractor$mapHeader$1(this, continuationImpl);
        Object obj2 = favoriteUiStateInteractor$mapHeader$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = favoriteUiStateInteractor$mapHeader$1.label;
        ru.yandex.taxi.widget.utils.e eVar2 = this.a;
        CharSequence charSequence32 = null;
        if (i != 0) {
        }
        charSequence = (CharSequence) obj2;
        if (!evu0.J(charSequence)) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0143, code lost:
    
        if (r12 == r1) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0125 -> B:14:0x014a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x0143 -> B:12:0x0146). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(List list, ContinuationImpl continuationImpl) {
        FavoriteUiStateInteractor$mapItems$1 favoriteUiStateInteractor$mapItems$1;
        int i;
        Iterator it;
        Collection collection;
        krk0 krk0Var;
        Collection collection2;
        Iterator it2;
        xss0 xss0Var;
        Object qhpVar;
        krk0 krk0Var2;
        xss0 xss0Var2;
        if (continuationImpl instanceof FavoriteUiStateInteractor$mapItems$1) {
            favoriteUiStateInteractor$mapItems$1 = (FavoriteUiStateInteractor$mapItems$1) continuationImpl;
            int i2 = favoriteUiStateInteractor$mapItems$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                favoriteUiStateInteractor$mapItems$1.label = i2 - Integer.MIN_VALUE;
                Object obj = favoriteUiStateInteractor$mapItems$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = favoriteUiStateInteractor$mapItems$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ArrayList arrayList = new ArrayList();
                    it = list.iterator();
                    collection = arrayList;
                    if (it.hasNext()) {
                    }
                } else if (i == 1) {
                    krk0Var2 = (krk0) favoriteUiStateInteractor$mapItems$1.L$8;
                    it2 = (Iterator) favoriteUiStateInteractor$mapItems$1.L$5;
                    collection2 = (Collection) favoriteUiStateInteractor$mapItems$1.L$3;
                    kotlin.b.b(obj);
                    xss0Var2 = (xss0) obj;
                    if (xss0Var2 != null) {
                    }
                    it = it2;
                    qhpVar = null;
                    collection = collection2;
                    if (qhpVar != null) {
                    }
                    if (it.hasNext()) {
                    }
                } else if (i == 2) {
                    krk0Var = (krk0) favoriteUiStateInteractor$mapItems$1.L$8;
                    it2 = (Iterator) favoriteUiStateInteractor$mapItems$1.L$5;
                    collection2 = (Collection) favoriteUiStateInteractor$mapItems$1.L$3;
                    kotlin.b.b(obj);
                    xss0Var = (xss0) obj;
                    if (xss0Var != null) {
                    }
                    it = it2;
                    qhpVar = null;
                    collection = collection2;
                    if (qhpVar != null) {
                    }
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    it = (Iterator) favoriteUiStateInteractor$mapItems$1.L$5;
                    collection = (Collection) favoriteUiStateInteractor$mapItems$1.L$3;
                    kotlin.b.b(obj);
                    xss0 xss0Var3 = (xss0) obj;
                    if (xss0Var3 != null) {
                        qhpVar = new ohp(xss0Var3);
                        if (qhpVar != null) {
                            collection.add(qhpVar);
                        }
                        if (it.hasNext()) {
                            krk0 krk0Var3 = (krk0) it.next();
                            if (krk0Var3 instanceof grk0) {
                                SlotItemDto slotItemDto = ((grk0) krk0Var3).b;
                                favoriteUiStateInteractor$mapItems$1.L$0 = null;
                                favoriteUiStateInteractor$mapItems$1.L$1 = null;
                                favoriteUiStateInteractor$mapItems$1.L$2 = null;
                                favoriteUiStateInteractor$mapItems$1.L$3 = collection;
                                favoriteUiStateInteractor$mapItems$1.L$4 = null;
                                favoriteUiStateInteractor$mapItems$1.L$5 = it;
                                favoriteUiStateInteractor$mapItems$1.L$6 = null;
                                favoriteUiStateInteractor$mapItems$1.L$7 = null;
                                favoriteUiStateInteractor$mapItems$1.L$8 = krk0Var3;
                                favoriteUiStateInteractor$mapItems$1.label = 1;
                                Object a = a(slotItemDto, favoriteUiStateInteractor$mapItems$1);
                                if (a != obj2) {
                                    Collection collection3 = collection;
                                    it2 = it;
                                    krk0Var2 = krk0Var3;
                                    obj = a;
                                    collection2 = collection3;
                                    xss0Var2 = (xss0) obj;
                                    if (xss0Var2 != null) {
                                        qhpVar = new php(((grk0) krk0Var2).a, xss0Var2);
                                        it = it2;
                                        collection = collection2;
                                        if (qhpVar != null) {
                                        }
                                        if (it.hasNext()) {
                                        }
                                    }
                                    it = it2;
                                    qhpVar = null;
                                    collection = collection2;
                                    if (qhpVar != null) {
                                    }
                                    if (it.hasNext()) {
                                    }
                                }
                            } else if (krk0Var3 instanceof jrk0) {
                                SlotItemDto slotItemDto2 = ((jrk0) krk0Var3).b;
                                favoriteUiStateInteractor$mapItems$1.L$0 = null;
                                favoriteUiStateInteractor$mapItems$1.L$1 = null;
                                favoriteUiStateInteractor$mapItems$1.L$2 = null;
                                favoriteUiStateInteractor$mapItems$1.L$3 = collection;
                                favoriteUiStateInteractor$mapItems$1.L$4 = null;
                                favoriteUiStateInteractor$mapItems$1.L$5 = it;
                                favoriteUiStateInteractor$mapItems$1.L$6 = null;
                                favoriteUiStateInteractor$mapItems$1.L$7 = null;
                                favoriteUiStateInteractor$mapItems$1.L$8 = krk0Var3;
                                favoriteUiStateInteractor$mapItems$1.label = 2;
                                Object a2 = a(slotItemDto2, favoriteUiStateInteractor$mapItems$1);
                                if (a2 != obj2) {
                                    Collection collection4 = collection;
                                    it2 = it;
                                    krk0Var = krk0Var3;
                                    obj = a2;
                                    collection2 = collection4;
                                    xss0Var = (xss0) obj;
                                    if (xss0Var != null) {
                                        qhpVar = new qhp(((jrk0) krk0Var).a, xss0Var);
                                        it = it2;
                                        collection = collection2;
                                        if (qhpVar != null) {
                                        }
                                        if (it.hasNext()) {
                                            return (List) collection;
                                        }
                                    }
                                    it = it2;
                                    qhpVar = null;
                                    collection = collection2;
                                    if (qhpVar != null) {
                                    }
                                    if (it.hasNext()) {
                                    }
                                }
                            } else if (krk0Var3 instanceof crk0) {
                                SlotItemDto slotItemDto3 = ((crk0) krk0Var3).a;
                                favoriteUiStateInteractor$mapItems$1.L$0 = null;
                                favoriteUiStateInteractor$mapItems$1.L$1 = null;
                                favoriteUiStateInteractor$mapItems$1.L$2 = null;
                                favoriteUiStateInteractor$mapItems$1.L$3 = collection;
                                favoriteUiStateInteractor$mapItems$1.L$4 = null;
                                favoriteUiStateInteractor$mapItems$1.L$5 = it;
                                favoriteUiStateInteractor$mapItems$1.L$6 = null;
                                favoriteUiStateInteractor$mapItems$1.L$7 = null;
                                favoriteUiStateInteractor$mapItems$1.L$8 = null;
                                favoriteUiStateInteractor$mapItems$1.label = 3;
                                obj = a(slotItemDto3, favoriteUiStateInteractor$mapItems$1);
                            }
                            return obj2;
                        }
                    }
                    qhpVar = null;
                    if (qhpVar != null) {
                    }
                    if (it.hasNext()) {
                    }
                }
            }
        }
        favoriteUiStateInteractor$mapItems$1 = new FavoriteUiStateInteractor$mapItems$1(this, continuationImpl);
        Object obj3 = favoriteUiStateInteractor$mapItems$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = favoriteUiStateInteractor$mapItems$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004c, code lost:
    
        if (r9 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0053 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(khp.a aVar, ContinuationImpl continuationImpl) {
        FavoriteUiStateInteractor$mapRidesToUiState$1 favoriteUiStateInteractor$mapRidesToUiState$1;
        int i;
        nhp nhpVar;
        nhp nhpVar2;
        if (continuationImpl instanceof FavoriteUiStateInteractor$mapRidesToUiState$1) {
            favoriteUiStateInteractor$mapRidesToUiState$1 = (FavoriteUiStateInteractor$mapRidesToUiState$1) continuationImpl;
            int i2 = favoriteUiStateInteractor$mapRidesToUiState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                favoriteUiStateInteractor$mapRidesToUiState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = favoriteUiStateInteractor$mapRidesToUiState$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = favoriteUiStateInteractor$mapRidesToUiState$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    favoriteUiStateInteractor$mapRidesToUiState$1.L$0 = aVar;
                    favoriteUiStateInteractor$mapRidesToUiState$1.label = 1;
                    obj = b(aVar, favoriteUiStateInteractor$mapRidesToUiState$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        nhpVar2 = (nhp) favoriteUiStateInteractor$mapRidesToUiState$1.L$1;
                        kotlin.b.b(obj);
                        return new shp(nhpVar2, (List) obj);
                    }
                    aVar = (khp.a) favoriteUiStateInteractor$mapRidesToUiState$1.L$0;
                    kotlin.b.b(obj);
                }
                nhpVar = (nhp) obj;
                if (nhpVar != null) {
                    return null;
                }
                List list = aVar.c;
                favoriteUiStateInteractor$mapRidesToUiState$1.L$0 = null;
                favoriteUiStateInteractor$mapRidesToUiState$1.L$1 = nhpVar;
                favoriteUiStateInteractor$mapRidesToUiState$1.label = 2;
                Object c = c(list, favoriteUiStateInteractor$mapRidesToUiState$1);
                if (c != obj2) {
                    obj = c;
                    nhpVar2 = nhpVar;
                    return new shp(nhpVar2, (List) obj);
                }
                return obj2;
            }
        }
        favoriteUiStateInteractor$mapRidesToUiState$1 = new FavoriteUiStateInteractor$mapRidesToUiState$1(this, continuationImpl);
        Object obj3 = favoriteUiStateInteractor$mapRidesToUiState$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = favoriteUiStateInteractor$mapRidesToUiState$1.label;
        if (i != 0) {
        }
        nhpVar = (nhp) obj3;
        if (nhpVar != null) {
        }
    }
}
