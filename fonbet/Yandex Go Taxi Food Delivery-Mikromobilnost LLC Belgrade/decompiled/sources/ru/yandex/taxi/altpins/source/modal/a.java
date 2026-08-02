package ru.yandex.taxi.altpins.source.modal;

import com.yandex.go.slot.dto.SlotButtonDto;
import com.yandex.go.slot.dto.SlotItemActionDto$ConfirmAltOption;
import com.yandex.go.slot.dto.SlotItemDto;
import com.yandex.go.slot.dto.b2;
import defpackage.bdc;
import defpackage.css0;
import defpackage.irs0;
import defpackage.kdc;
import defpackage.lz1;
import defpackage.nx1;
import defpackage.ny61;
import defpackage.pdc;
import defpackage.qrs0;
import defpackage.qx1;
import defpackage.rx1;
import defpackage.sx1;
import defpackage.tcc;
import defpackage.ufu;
import defpackage.wqs0;
import defpackage.xng0;
import defpackage.xss0;
import defpackage.zrs0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes5.dex */
public final class a {
    public final nx1 a;
    public final irs0 b;
    public final pdc c;
    public final ru.yandex.taxi.widget.c d;

    public a(nx1 nx1Var, irs0 irs0Var, pdc pdcVar, ru.yandex.taxi.widget.c cVar) {
        this.a = nx1Var;
        this.b = irs0Var;
        this.c = pdcVar;
        this.d = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(SlotButtonDto slotButtonDto, ContinuationImpl continuationImpl) {
        AlternativeSourceCardItemsMapper$mapButton$1 alternativeSourceCardItemsMapper$mapButton$1;
        int i;
        kdc b;
        if (continuationImpl instanceof AlternativeSourceCardItemsMapper$mapButton$1) {
            alternativeSourceCardItemsMapper$mapButton$1 = (AlternativeSourceCardItemsMapper$mapButton$1) continuationImpl;
            int i2 = alternativeSourceCardItemsMapper$mapButton$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                alternativeSourceCardItemsMapper$mapButton$1.label = i2 - Integer.MIN_VALUE;
                Object obj = alternativeSourceCardItemsMapper$mapButton$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = alternativeSourceCardItemsMapper$mapButton$1.label;
                irs0 irs0Var = this.b;
                if (i != 0) {
                    kotlin.b.b(obj);
                    SlotItemDto slotItemDto = slotButtonDto.g;
                    if (slotItemDto == null) {
                        return null;
                    }
                    alternativeSourceCardItemsMapper$mapButton$1.L$0 = slotButtonDto;
                    alternativeSourceCardItemsMapper$mapButton$1.L$1 = null;
                    alternativeSourceCardItemsMapper$mapButton$1.label = 1;
                    obj = ((com.yandex.go.slot.mapper.a) irs0Var).e(slotItemDto, this.a, false, false, null, alternativeSourceCardItemsMapper$mapButton$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    slotButtonDto = (SlotButtonDto) alternativeSourceCardItemsMapper$mapButton$1.L$0;
                    kotlin.b.b(obj);
                }
                xss0 xss0Var = (xss0) obj;
                wqs0 n = ((com.yandex.go.slot.mapper.a) irs0Var).n(slotButtonDto.f);
                b = ((ufu) this.c).b(slotButtonDto.f.d);
                if (b == null) {
                    b = new bdc(xng0.controlMinor);
                }
                return new qx1(xss0Var, n, b, true, false);
            }
        }
        alternativeSourceCardItemsMapper$mapButton$1 = new AlternativeSourceCardItemsMapper$mapButton$1(this, continuationImpl);
        Object obj2 = alternativeSourceCardItemsMapper$mapButton$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = alternativeSourceCardItemsMapper$mapButton$1.label;
        irs0 irs0Var2 = this.b;
        if (i != 0) {
        }
        xss0 xss0Var2 = (xss0) obj2;
        wqs0 n2 = ((com.yandex.go.slot.mapper.a) irs0Var2).n(slotButtonDto.f);
        b = ((ufu) this.c).b(slotButtonDto.f.d);
        if (b == null) {
        }
        return new qx1(xss0Var2, n2, b, true, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(SlotButtonDto slotButtonDto, ContinuationImpl continuationImpl) {
        AlternativeSourceCardItemsMapper$mapButtonLoading$1 alternativeSourceCardItemsMapper$mapButtonLoading$1;
        int i;
        irs0 irs0Var;
        SlotItemDto slotItemDto;
        Object e;
        SlotButtonDto slotButtonDto2;
        String str;
        xss0 xss0Var;
        SlotButtonDto slotButtonDto3;
        CharSequence charSequence;
        kdc b;
        if (continuationImpl instanceof AlternativeSourceCardItemsMapper$mapButtonLoading$1) {
            alternativeSourceCardItemsMapper$mapButtonLoading$1 = (AlternativeSourceCardItemsMapper$mapButtonLoading$1) continuationImpl;
            int i2 = alternativeSourceCardItemsMapper$mapButtonLoading$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                alternativeSourceCardItemsMapper$mapButtonLoading$1.label = i2 - Integer.MIN_VALUE;
                Object obj = alternativeSourceCardItemsMapper$mapButtonLoading$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = alternativeSourceCardItemsMapper$mapButtonLoading$1.label;
                nx1 nx1Var = this.a;
                irs0Var = this.b;
                if (i != 0) {
                    kotlin.b.b(obj);
                    slotItemDto = slotButtonDto.g;
                    if (slotItemDto == null) {
                        return null;
                    }
                    b2 b2Var = slotItemDto.a;
                    SlotItemActionDto$ConfirmAltOption slotItemActionDto$ConfirmAltOption = b2Var instanceof SlotItemActionDto$ConfirmAltOption ? (SlotItemActionDto$ConfirmAltOption) b2Var : null;
                    String str2 = slotItemActionDto$ConfirmAltOption != null ? slotItemActionDto$ConfirmAltOption.a : null;
                    alternativeSourceCardItemsMapper$mapButtonLoading$1.L$0 = slotButtonDto;
                    alternativeSourceCardItemsMapper$mapButtonLoading$1.L$1 = slotItemDto;
                    alternativeSourceCardItemsMapper$mapButtonLoading$1.L$2 = str2;
                    alternativeSourceCardItemsMapper$mapButtonLoading$1.label = 1;
                    e = ((com.yandex.go.slot.mapper.a) irs0Var).e(slotItemDto, nx1Var, false, false, null, alternativeSourceCardItemsMapper$mapButtonLoading$1);
                    if (e != coroutineSingletons) {
                        slotButtonDto2 = slotButtonDto;
                        str = str2;
                        obj = e;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    slotButtonDto3 = (SlotButtonDto) alternativeSourceCardItemsMapper$mapButtonLoading$1.L$0;
                    kotlin.b.b(obj);
                    xss0Var = (xss0) obj;
                    xss0 xss0Var2 = xss0Var;
                    b = ((ufu) this.c).b(slotButtonDto3.f.d);
                    if (b == null) {
                        b = new bdc(xng0.controlMinor);
                    }
                    return new qx1(xss0Var2, ((com.yandex.go.slot.mapper.a) irs0Var).n(slotButtonDto3.f), b, false, true);
                }
                str = (String) alternativeSourceCardItemsMapper$mapButtonLoading$1.L$2;
                slotItemDto = (SlotItemDto) alternativeSourceCardItemsMapper$mapButtonLoading$1.L$1;
                slotButtonDto2 = (SlotButtonDto) alternativeSourceCardItemsMapper$mapButtonLoading$1.L$0;
                kotlin.b.b(obj);
                xss0Var = (xss0) obj;
                css0 css0Var = xss0Var.b;
                zrs0 zrs0Var = !(css0Var instanceof zrs0) ? (zrs0) css0Var : null;
                String obj2 = (zrs0Var != null || (charSequence = zrs0Var.a.a) == null) ? null : charSequence.toString();
                if (str != null || obj2 == null) {
                    slotButtonDto3 = slotButtonDto2;
                    xss0 xss0Var22 = xss0Var;
                    b = ((ufu) this.c).b(slotButtonDto3.f.d);
                    if (b == null) {
                    }
                    return new qx1(xss0Var22, ((com.yandex.go.slot.mapper.a) irs0Var).n(slotButtonDto3.f), b, false, true);
                }
                SlotItemDto a = SlotItemDto.a(slotItemDto, qrs0.b(obj2, str, slotItemDto.d));
                alternativeSourceCardItemsMapper$mapButtonLoading$1.L$0 = slotButtonDto2;
                alternativeSourceCardItemsMapper$mapButtonLoading$1.L$1 = null;
                alternativeSourceCardItemsMapper$mapButtonLoading$1.L$2 = null;
                alternativeSourceCardItemsMapper$mapButtonLoading$1.L$3 = null;
                alternativeSourceCardItemsMapper$mapButtonLoading$1.L$4 = null;
                alternativeSourceCardItemsMapper$mapButtonLoading$1.label = 2;
                obj = ((com.yandex.go.slot.mapper.a) irs0Var).e(a, nx1Var, false, false, null, alternativeSourceCardItemsMapper$mapButtonLoading$1);
                if (obj != coroutineSingletons) {
                    slotButtonDto3 = slotButtonDto2;
                    xss0Var = (xss0) obj;
                    xss0 xss0Var222 = xss0Var;
                    b = ((ufu) this.c).b(slotButtonDto3.f.d);
                    if (b == null) {
                    }
                    return new qx1(xss0Var222, ((com.yandex.go.slot.mapper.a) irs0Var).n(slotButtonDto3.f), b, false, true);
                }
                return coroutineSingletons;
            }
        }
        alternativeSourceCardItemsMapper$mapButtonLoading$1 = new AlternativeSourceCardItemsMapper$mapButtonLoading$1(this, continuationImpl);
        Object obj3 = alternativeSourceCardItemsMapper$mapButtonLoading$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = alternativeSourceCardItemsMapper$mapButtonLoading$1.label;
        nx1 nx1Var2 = this.a;
        irs0Var = this.b;
        if (i != 0) {
        }
        xss0Var = (xss0) obj3;
        css0 css0Var2 = xss0Var.b;
        if (!(css0Var2 instanceof zrs0)) {
        }
        if (zrs0Var != null) {
        }
        if (str != null) {
        }
        slotButtonDto3 = slotButtonDto2;
        xss0 xss0Var2222 = xss0Var;
        b = ((ufu) this.c).b(slotButtonDto3.f.d);
        if (b == null) {
        }
        return new qx1(xss0Var2222, ((com.yandex.go.slot.mapper.a) irs0Var).n(slotButtonDto3.f), b, false, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0087 -> B:10:0x0088). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ArrayList arrayList, ContinuationImpl continuationImpl) {
        AlternativeSourceCardItemsMapper$mapItems$1 alternativeSourceCardItemsMapper$mapItems$1;
        int i;
        Iterator it;
        Collection collection;
        if (continuationImpl instanceof AlternativeSourceCardItemsMapper$mapItems$1) {
            alternativeSourceCardItemsMapper$mapItems$1 = (AlternativeSourceCardItemsMapper$mapItems$1) continuationImpl;
            int i2 = alternativeSourceCardItemsMapper$mapItems$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                alternativeSourceCardItemsMapper$mapItems$1.label = i2 - Integer.MIN_VALUE;
                Object obj = alternativeSourceCardItemsMapper$mapItems$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = alternativeSourceCardItemsMapper$mapItems$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
                    it = arrayList.iterator();
                    collection = arrayList2;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    collection = (Collection) alternativeSourceCardItemsMapper$mapItems$1.L$7;
                    it = (Iterator) alternativeSourceCardItemsMapper$mapItems$1.L$4;
                    Collection collection2 = (Collection) alternativeSourceCardItemsMapper$mapItems$1.L$3;
                    kotlin.b.b(obj);
                    collection.add(new rx1((xss0) obj));
                    collection = collection2;
                    if (it.hasNext()) {
                        SlotItemDto slotItemDto = (SlotItemDto) it.next();
                        alternativeSourceCardItemsMapper$mapItems$1.L$0 = null;
                        alternativeSourceCardItemsMapper$mapItems$1.L$1 = null;
                        alternativeSourceCardItemsMapper$mapItems$1.L$2 = null;
                        alternativeSourceCardItemsMapper$mapItems$1.L$3 = collection;
                        alternativeSourceCardItemsMapper$mapItems$1.L$4 = it;
                        alternativeSourceCardItemsMapper$mapItems$1.L$5 = null;
                        alternativeSourceCardItemsMapper$mapItems$1.L$6 = null;
                        alternativeSourceCardItemsMapper$mapItems$1.L$7 = collection;
                        alternativeSourceCardItemsMapper$mapItems$1.label = 1;
                        obj = ((com.yandex.go.slot.mapper.a) this.b).e(slotItemDto, this.a, false, false, null, alternativeSourceCardItemsMapper$mapItems$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        collection2 = collection;
                        collection.add(new rx1((xss0) obj));
                        collection = collection2;
                        if (it.hasNext()) {
                            return (List) collection;
                        }
                    }
                }
            }
        }
        alternativeSourceCardItemsMapper$mapItems$1 = new AlternativeSourceCardItemsMapper$mapItems$1(this, continuationImpl);
        Object obj2 = alternativeSourceCardItemsMapper$mapItems$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = alternativeSourceCardItemsMapper$mapItems$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0089, code lost:
    
        if (r2 == r3) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(lz1 lz1Var, ContinuationImpl continuationImpl) {
        AlternativeSourceCardItemsMapper$mapToLoadingUiState$1 alternativeSourceCardItemsMapper$mapToLoadingUiState$1;
        Object obj;
        int i;
        Object c;
        lz1 lz1Var2;
        CharSequence charSequence;
        Object a;
        CharSequence charSequence2;
        List list;
        qx1 qx1Var;
        CharSequence charSequence3;
        qx1 qx1Var2;
        qx1 qx1Var3;
        lz1 lz1Var3 = lz1Var;
        if (continuationImpl instanceof AlternativeSourceCardItemsMapper$mapToLoadingUiState$1) {
            alternativeSourceCardItemsMapper$mapToLoadingUiState$1 = (AlternativeSourceCardItemsMapper$mapToLoadingUiState$1) continuationImpl;
            int i2 = alternativeSourceCardItemsMapper$mapToLoadingUiState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                alternativeSourceCardItemsMapper$mapToLoadingUiState$1.label = i2 - Integer.MIN_VALUE;
                AlternativeSourceCardItemsMapper$mapToLoadingUiState$1 alternativeSourceCardItemsMapper$mapToLoadingUiState$12 = alternativeSourceCardItemsMapper$mapToLoadingUiState$1;
                Object obj2 = alternativeSourceCardItemsMapper$mapToLoadingUiState$12.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = alternativeSourceCardItemsMapper$mapToLoadingUiState$12.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    FormattedText formattedText = lz1Var3.a;
                    alternativeSourceCardItemsMapper$mapToLoadingUiState$12.L$0 = lz1Var3;
                    alternativeSourceCardItemsMapper$mapToLoadingUiState$12.label = 1;
                    obj2 = ru.yandex.taxi.widget.c.e(this.d, formattedText, null, false, alternativeSourceCardItemsMapper$mapToLoadingUiState$12, 30);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            charSequence = (CharSequence) alternativeSourceCardItemsMapper$mapToLoadingUiState$12.L$1;
                            lz1 lz1Var4 = (lz1) alternativeSourceCardItemsMapper$mapToLoadingUiState$12.L$0;
                            kotlin.b.b(obj2);
                            lz1Var2 = lz1Var4;
                            List list2 = (List) obj2;
                            SlotButtonDto slotButtonDto = lz1Var2.c;
                            alternativeSourceCardItemsMapper$mapToLoadingUiState$12.L$0 = lz1Var2;
                            alternativeSourceCardItemsMapper$mapToLoadingUiState$12.L$1 = charSequence;
                            alternativeSourceCardItemsMapper$mapToLoadingUiState$12.L$2 = list2;
                            alternativeSourceCardItemsMapper$mapToLoadingUiState$12.label = 3;
                            a = a(slotButtonDto, alternativeSourceCardItemsMapper$mapToLoadingUiState$12);
                            if (a != obj) {
                                charSequence2 = charSequence;
                                list = list2;
                                obj2 = a;
                                qx1Var = (qx1) obj2;
                                if (qx1Var != null) {
                                }
                                return null;
                            }
                            return obj;
                        }
                        if (i != 3) {
                            if (i != 4) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qx1Var2 = (qx1) alternativeSourceCardItemsMapper$mapToLoadingUiState$12.L$3;
                            list = (List) alternativeSourceCardItemsMapper$mapToLoadingUiState$12.L$2;
                            charSequence3 = (CharSequence) alternativeSourceCardItemsMapper$mapToLoadingUiState$12.L$1;
                            kotlin.b.b(obj2);
                            qx1Var3 = (qx1) obj2;
                            if (qx1Var3 != null) {
                                return new sx1(charSequence3, list, qx1Var2, qx1Var3);
                            }
                            return null;
                        }
                        list = (List) alternativeSourceCardItemsMapper$mapToLoadingUiState$12.L$2;
                        charSequence2 = (CharSequence) alternativeSourceCardItemsMapper$mapToLoadingUiState$12.L$1;
                        lz1Var2 = (lz1) alternativeSourceCardItemsMapper$mapToLoadingUiState$12.L$0;
                        kotlin.b.b(obj2);
                        qx1Var = (qx1) obj2;
                        if (qx1Var != null) {
                            qx1 qx1Var4 = new qx1(qx1Var.a, qx1Var.b, qx1Var.c, false, qx1Var.e);
                            SlotButtonDto slotButtonDto2 = lz1Var2.d;
                            alternativeSourceCardItemsMapper$mapToLoadingUiState$12.L$0 = null;
                            alternativeSourceCardItemsMapper$mapToLoadingUiState$12.L$1 = charSequence2;
                            alternativeSourceCardItemsMapper$mapToLoadingUiState$12.L$2 = list;
                            alternativeSourceCardItemsMapper$mapToLoadingUiState$12.L$3 = qx1Var4;
                            alternativeSourceCardItemsMapper$mapToLoadingUiState$12.label = 4;
                            obj2 = b(slotButtonDto2, alternativeSourceCardItemsMapper$mapToLoadingUiState$12);
                            if (obj2 != obj) {
                                charSequence3 = charSequence2;
                                qx1Var2 = qx1Var4;
                                qx1Var3 = (qx1) obj2;
                                if (qx1Var3 != null) {
                                }
                            }
                            return obj;
                        }
                        return null;
                    }
                    lz1Var3 = (lz1) alternativeSourceCardItemsMapper$mapToLoadingUiState$12.L$0;
                    kotlin.b.b(obj2);
                }
                CharSequence charSequence4 = (CharSequence) obj2;
                ArrayList arrayList = lz1Var3.b;
                alternativeSourceCardItemsMapper$mapToLoadingUiState$12.L$0 = lz1Var3;
                alternativeSourceCardItemsMapper$mapToLoadingUiState$12.L$1 = charSequence4;
                alternativeSourceCardItemsMapper$mapToLoadingUiState$12.label = 2;
                c = c(arrayList, alternativeSourceCardItemsMapper$mapToLoadingUiState$12);
                if (c != obj) {
                    lz1Var2 = lz1Var3;
                    charSequence = charSequence4;
                    obj2 = c;
                    List list22 = (List) obj2;
                    SlotButtonDto slotButtonDto3 = lz1Var2.c;
                    alternativeSourceCardItemsMapper$mapToLoadingUiState$12.L$0 = lz1Var2;
                    alternativeSourceCardItemsMapper$mapToLoadingUiState$12.L$1 = charSequence;
                    alternativeSourceCardItemsMapper$mapToLoadingUiState$12.L$2 = list22;
                    alternativeSourceCardItemsMapper$mapToLoadingUiState$12.label = 3;
                    a = a(slotButtonDto3, alternativeSourceCardItemsMapper$mapToLoadingUiState$12);
                    if (a != obj) {
                    }
                }
                return obj;
            }
        }
        alternativeSourceCardItemsMapper$mapToLoadingUiState$1 = new AlternativeSourceCardItemsMapper$mapToLoadingUiState$1(this, continuationImpl);
        AlternativeSourceCardItemsMapper$mapToLoadingUiState$1 alternativeSourceCardItemsMapper$mapToLoadingUiState$122 = alternativeSourceCardItemsMapper$mapToLoadingUiState$1;
        Object obj22 = alternativeSourceCardItemsMapper$mapToLoadingUiState$122.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = alternativeSourceCardItemsMapper$mapToLoadingUiState$122.label;
        if (i != 0) {
        }
        CharSequence charSequence42 = (CharSequence) obj22;
        ArrayList arrayList2 = lz1Var3.b;
        alternativeSourceCardItemsMapper$mapToLoadingUiState$122.L$0 = lz1Var3;
        alternativeSourceCardItemsMapper$mapToLoadingUiState$122.L$1 = charSequence42;
        alternativeSourceCardItemsMapper$mapToLoadingUiState$122.label = 2;
        c = c(arrayList2, alternativeSourceCardItemsMapper$mapToLoadingUiState$122);
        if (c != obj) {
        }
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0083, code lost:
    
        if (r14 == r0) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(lz1 lz1Var, ContinuationImpl continuationImpl) {
        AlternativeSourceCardItemsMapper$mapToUiState$1 alternativeSourceCardItemsMapper$mapToUiState$1;
        Object obj;
        int i;
        Object c;
        lz1 lz1Var2;
        CharSequence charSequence;
        Object a;
        CharSequence charSequence2;
        List list;
        qx1 qx1Var;
        qx1 qx1Var2;
        CharSequence charSequence3;
        qx1 qx1Var3;
        if (continuationImpl instanceof AlternativeSourceCardItemsMapper$mapToUiState$1) {
            alternativeSourceCardItemsMapper$mapToUiState$1 = (AlternativeSourceCardItemsMapper$mapToUiState$1) continuationImpl;
            int i2 = alternativeSourceCardItemsMapper$mapToUiState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                alternativeSourceCardItemsMapper$mapToUiState$1.label = i2 - Integer.MIN_VALUE;
                AlternativeSourceCardItemsMapper$mapToUiState$1 alternativeSourceCardItemsMapper$mapToUiState$12 = alternativeSourceCardItemsMapper$mapToUiState$1;
                Object obj2 = alternativeSourceCardItemsMapper$mapToUiState$12.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = alternativeSourceCardItemsMapper$mapToUiState$12.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    FormattedText formattedText = lz1Var.a;
                    alternativeSourceCardItemsMapper$mapToUiState$12.L$0 = lz1Var;
                    alternativeSourceCardItemsMapper$mapToUiState$12.label = 1;
                    obj2 = ru.yandex.taxi.widget.c.e(this.d, formattedText, null, false, alternativeSourceCardItemsMapper$mapToUiState$12, 30);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            charSequence = (CharSequence) alternativeSourceCardItemsMapper$mapToUiState$12.L$1;
                            lz1 lz1Var3 = (lz1) alternativeSourceCardItemsMapper$mapToUiState$12.L$0;
                            kotlin.b.b(obj2);
                            lz1Var2 = lz1Var3;
                            List list2 = (List) obj2;
                            SlotButtonDto slotButtonDto = lz1Var2.c;
                            alternativeSourceCardItemsMapper$mapToUiState$12.L$0 = lz1Var2;
                            alternativeSourceCardItemsMapper$mapToUiState$12.L$1 = charSequence;
                            alternativeSourceCardItemsMapper$mapToUiState$12.L$2 = list2;
                            alternativeSourceCardItemsMapper$mapToUiState$12.label = 3;
                            a = a(slotButtonDto, alternativeSourceCardItemsMapper$mapToUiState$12);
                            if (a != obj) {
                                charSequence2 = charSequence;
                                list = list2;
                                obj2 = a;
                                qx1Var = (qx1) obj2;
                                if (qx1Var != null) {
                                }
                                return null;
                            }
                            return obj;
                        }
                        if (i != 3) {
                            if (i != 4) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qx1Var2 = (qx1) alternativeSourceCardItemsMapper$mapToUiState$12.L$3;
                            list = (List) alternativeSourceCardItemsMapper$mapToUiState$12.L$2;
                            charSequence3 = (CharSequence) alternativeSourceCardItemsMapper$mapToUiState$12.L$1;
                            kotlin.b.b(obj2);
                            qx1Var3 = (qx1) obj2;
                            if (qx1Var3 != null) {
                                return new sx1(charSequence3, list, qx1Var2, qx1Var3);
                            }
                            return null;
                        }
                        list = (List) alternativeSourceCardItemsMapper$mapToUiState$12.L$2;
                        charSequence2 = (CharSequence) alternativeSourceCardItemsMapper$mapToUiState$12.L$1;
                        lz1Var2 = (lz1) alternativeSourceCardItemsMapper$mapToUiState$12.L$0;
                        kotlin.b.b(obj2);
                        qx1Var = (qx1) obj2;
                        if (qx1Var != null) {
                            SlotButtonDto slotButtonDto2 = lz1Var2.d;
                            alternativeSourceCardItemsMapper$mapToUiState$12.L$0 = null;
                            alternativeSourceCardItemsMapper$mapToUiState$12.L$1 = charSequence2;
                            alternativeSourceCardItemsMapper$mapToUiState$12.L$2 = list;
                            alternativeSourceCardItemsMapper$mapToUiState$12.L$3 = qx1Var;
                            alternativeSourceCardItemsMapper$mapToUiState$12.label = 4;
                            Object a2 = a(slotButtonDto2, alternativeSourceCardItemsMapper$mapToUiState$12);
                            if (a2 != obj) {
                                obj2 = a2;
                                qx1Var2 = qx1Var;
                                charSequence3 = charSequence2;
                                qx1Var3 = (qx1) obj2;
                                if (qx1Var3 != null) {
                                }
                            }
                            return obj;
                        }
                        return null;
                    }
                    lz1Var = (lz1) alternativeSourceCardItemsMapper$mapToUiState$12.L$0;
                    kotlin.b.b(obj2);
                }
                CharSequence charSequence4 = (CharSequence) obj2;
                ArrayList arrayList = lz1Var.b;
                alternativeSourceCardItemsMapper$mapToUiState$12.L$0 = lz1Var;
                alternativeSourceCardItemsMapper$mapToUiState$12.L$1 = charSequence4;
                alternativeSourceCardItemsMapper$mapToUiState$12.label = 2;
                c = c(arrayList, alternativeSourceCardItemsMapper$mapToUiState$12);
                if (c != obj) {
                    lz1Var2 = lz1Var;
                    charSequence = charSequence4;
                    obj2 = c;
                    List list22 = (List) obj2;
                    SlotButtonDto slotButtonDto3 = lz1Var2.c;
                    alternativeSourceCardItemsMapper$mapToUiState$12.L$0 = lz1Var2;
                    alternativeSourceCardItemsMapper$mapToUiState$12.L$1 = charSequence;
                    alternativeSourceCardItemsMapper$mapToUiState$12.L$2 = list22;
                    alternativeSourceCardItemsMapper$mapToUiState$12.label = 3;
                    a = a(slotButtonDto3, alternativeSourceCardItemsMapper$mapToUiState$12);
                    if (a != obj) {
                    }
                }
                return obj;
            }
        }
        alternativeSourceCardItemsMapper$mapToUiState$1 = new AlternativeSourceCardItemsMapper$mapToUiState$1(this, continuationImpl);
        AlternativeSourceCardItemsMapper$mapToUiState$1 alternativeSourceCardItemsMapper$mapToUiState$122 = alternativeSourceCardItemsMapper$mapToUiState$1;
        Object obj22 = alternativeSourceCardItemsMapper$mapToUiState$122.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = alternativeSourceCardItemsMapper$mapToUiState$122.label;
        if (i != 0) {
        }
        CharSequence charSequence42 = (CharSequence) obj22;
        ArrayList arrayList2 = lz1Var.b;
        alternativeSourceCardItemsMapper$mapToUiState$122.L$0 = lz1Var;
        alternativeSourceCardItemsMapper$mapToUiState$122.L$1 = charSequence42;
        alternativeSourceCardItemsMapper$mapToUiState$122.label = 2;
        c = c(arrayList2, alternativeSourceCardItemsMapper$mapToUiState$122);
        if (c != obj) {
        }
        return obj;
    }
}
