package ru.yandex.taxi.summary.promotions.repository;

import com.yandex.go.image.domain.requests.g;
import defpackage.fnv0;
import defpackage.k7x0;
import defpackage.l051;
import defpackage.m051;
import defpackage.m7x0;
import defpackage.ny61;
import defpackage.o051;
import defpackage.p051;
import defpackage.pav;
import defpackage.r051;
import defpackage.s051;
import defpackage.u051;
import defpackage.v051;
import defpackage.w511;
import defpackage.z051;
import defpackage.zy11;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.common_models.net.o;
import ru.yandex.taxi.communications.model.CommunicationItem;
import ru.yandex.taxi.summary.promotions.models.SummaryPromotionsResponse;

/* loaded from: classes10.dex */
public final class a {
    public final pav a;
    public final k7x0 b;
    public final ru.yandex.taxi.summary.promotions.models.a c;

    public a(pav pavVar, k7x0 k7x0Var, ru.yandex.taxi.summary.promotions.models.a aVar) {
        this.a = pavVar;
        this.b = k7x0Var;
        this.c = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Set set, String str, ContinuationImpl continuationImpl) {
        SummaryPromotionsPreloadRepository$loadImageIfNeed$1 summaryPromotionsPreloadRepository$loadImageIfNeed$1;
        int i;
        if (continuationImpl instanceof SummaryPromotionsPreloadRepository$loadImageIfNeed$1) {
            summaryPromotionsPreloadRepository$loadImageIfNeed$1 = (SummaryPromotionsPreloadRepository$loadImageIfNeed$1) continuationImpl;
            int i2 = summaryPromotionsPreloadRepository$loadImageIfNeed$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                summaryPromotionsPreloadRepository$loadImageIfNeed$1.label = i2 - Integer.MIN_VALUE;
                Object obj = summaryPromotionsPreloadRepository$loadImageIfNeed$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = summaryPromotionsPreloadRepository$loadImageIfNeed$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (!set.contains(str)) {
                        g gVar = (g) this.a.e();
                        gVar.c(str);
                        summaryPromotionsPreloadRepository$loadImageIfNeed$1.L$0 = set;
                        summaryPromotionsPreloadRepository$loadImageIfNeed$1.L$1 = str;
                        summaryPromotionsPreloadRepository$loadImageIfNeed$1.label = 1;
                        if (ru.yandex.taxi.utils.a.e(gVar, summaryPromotionsPreloadRepository$loadImageIfNeed$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return zy11.a;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = (String) summaryPromotionsPreloadRepository$loadImageIfNeed$1.L$1;
                set = (Set) summaryPromotionsPreloadRepository$loadImageIfNeed$1.L$0;
                kotlin.b.b(obj);
                ((Result) obj).getClass();
                set.add(str);
                return zy11.a;
            }
        }
        summaryPromotionsPreloadRepository$loadImageIfNeed$1 = new SummaryPromotionsPreloadRepository$loadImageIfNeed$1(this, continuationImpl);
        Object obj2 = summaryPromotionsPreloadRepository$loadImageIfNeed$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = summaryPromotionsPreloadRepository$loadImageIfNeed$1.label;
        if (i != 0) {
        }
        set.add(str);
        return zy11.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00e9, code lost:
    
        if (a(r8, r12, r0) == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0138, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0104, code lost:
    
        if (d(r8, r12, r0) != r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x011f, code lost:
    
        if (d(r8, r12, r0) == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0136, code lost:
    
        if (c(r8, r11, r0) == r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0136 -> B:13:0x00bd). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(SummaryPromotionsResponse summaryPromotionsResponse, ContinuationImpl continuationImpl) {
        SummaryPromotionsPreloadRepository$preloadMediaInfo$1 summaryPromotionsPreloadRepository$preloadMediaInfo$1;
        int i;
        Iterator it;
        Set set;
        SummaryPromotionsResponse.a aVar;
        if (continuationImpl instanceof SummaryPromotionsPreloadRepository$preloadMediaInfo$1) {
            summaryPromotionsPreloadRepository$preloadMediaInfo$1 = (SummaryPromotionsPreloadRepository$preloadMediaInfo$1) continuationImpl;
            int i2 = summaryPromotionsPreloadRepository$preloadMediaInfo$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                summaryPromotionsPreloadRepository$preloadMediaInfo$1.label = i2 - Integer.MIN_VALUE;
                Object obj = summaryPromotionsPreloadRepository$preloadMediaInfo$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = summaryPromotionsPreloadRepository$preloadMediaInfo$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Set linkedHashSet = new LinkedHashSet();
                    it = summaryPromotionsResponse.a.a.a.iterator();
                    set = linkedHashSet;
                } else if (i == 1) {
                    aVar = (SummaryPromotionsResponse.a) summaryPromotionsPreloadRepository$preloadMediaInfo$1.L$5;
                    it = (Iterator) summaryPromotionsPreloadRepository$preloadMediaInfo$1.L$3;
                    set = (Set) summaryPromotionsPreloadRepository$preloadMediaInfo$1.L$1;
                    kotlin.b.b(obj);
                    FormattedText c = aVar.getC();
                    summaryPromotionsPreloadRepository$preloadMediaInfo$1.L$0 = null;
                    summaryPromotionsPreloadRepository$preloadMediaInfo$1.L$1 = set;
                    summaryPromotionsPreloadRepository$preloadMediaInfo$1.L$2 = null;
                    summaryPromotionsPreloadRepository$preloadMediaInfo$1.L$3 = it;
                    summaryPromotionsPreloadRepository$preloadMediaInfo$1.L$4 = null;
                    summaryPromotionsPreloadRepository$preloadMediaInfo$1.L$5 = aVar;
                    summaryPromotionsPreloadRepository$preloadMediaInfo$1.L$6 = null;
                    summaryPromotionsPreloadRepository$preloadMediaInfo$1.label = 2;
                } else if (i == 2) {
                    aVar = (SummaryPromotionsResponse.a) summaryPromotionsPreloadRepository$preloadMediaInfo$1.L$5;
                    it = (Iterator) summaryPromotionsPreloadRepository$preloadMediaInfo$1.L$3;
                    set = (Set) summaryPromotionsPreloadRepository$preloadMediaInfo$1.L$1;
                    kotlin.b.b(obj);
                    FormattedText d = aVar.getD();
                    summaryPromotionsPreloadRepository$preloadMediaInfo$1.L$0 = null;
                    summaryPromotionsPreloadRepository$preloadMediaInfo$1.L$1 = set;
                    summaryPromotionsPreloadRepository$preloadMediaInfo$1.L$2 = null;
                    summaryPromotionsPreloadRepository$preloadMediaInfo$1.L$3 = it;
                    summaryPromotionsPreloadRepository$preloadMediaInfo$1.L$4 = null;
                    summaryPromotionsPreloadRepository$preloadMediaInfo$1.L$5 = aVar;
                    summaryPromotionsPreloadRepository$preloadMediaInfo$1.L$6 = null;
                    summaryPromotionsPreloadRepository$preloadMediaInfo$1.label = 3;
                } else if (i == 3) {
                    aVar = (SummaryPromotionsResponse.a) summaryPromotionsPreloadRepository$preloadMediaInfo$1.L$5;
                    it = (Iterator) summaryPromotionsPreloadRepository$preloadMediaInfo$1.L$3;
                    set = (Set) summaryPromotionsPreloadRepository$preloadMediaInfo$1.L$1;
                    kotlin.b.b(obj);
                    summaryPromotionsPreloadRepository$preloadMediaInfo$1.L$0 = null;
                    summaryPromotionsPreloadRepository$preloadMediaInfo$1.L$1 = set;
                    summaryPromotionsPreloadRepository$preloadMediaInfo$1.L$2 = null;
                    summaryPromotionsPreloadRepository$preloadMediaInfo$1.L$3 = it;
                    summaryPromotionsPreloadRepository$preloadMediaInfo$1.L$4 = null;
                    summaryPromotionsPreloadRepository$preloadMediaInfo$1.L$5 = null;
                    summaryPromotionsPreloadRepository$preloadMediaInfo$1.L$6 = null;
                    summaryPromotionsPreloadRepository$preloadMediaInfo$1.label = 4;
                } else {
                    if (i != 4) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Iterator it2 = (Iterator) summaryPromotionsPreloadRepository$preloadMediaInfo$1.L$3;
                    Set set2 = (Set) summaryPromotionsPreloadRepository$preloadMediaInfo$1.L$1;
                    kotlin.b.b(obj);
                    set = set2;
                    it = it2;
                }
                if (it.hasNext()) {
                    return zy11.a;
                }
                aVar = (SummaryPromotionsResponse.a) it.next();
                String a = this.c.a(aVar.getE());
                if (a != null) {
                    summaryPromotionsPreloadRepository$preloadMediaInfo$1.L$0 = null;
                    summaryPromotionsPreloadRepository$preloadMediaInfo$1.L$1 = set;
                    summaryPromotionsPreloadRepository$preloadMediaInfo$1.L$2 = null;
                    summaryPromotionsPreloadRepository$preloadMediaInfo$1.L$3 = it;
                    summaryPromotionsPreloadRepository$preloadMediaInfo$1.L$4 = null;
                    summaryPromotionsPreloadRepository$preloadMediaInfo$1.L$5 = aVar;
                    summaryPromotionsPreloadRepository$preloadMediaInfo$1.L$6 = null;
                    summaryPromotionsPreloadRepository$preloadMediaInfo$1.label = 1;
                }
                FormattedText c2 = aVar.getC();
                summaryPromotionsPreloadRepository$preloadMediaInfo$1.L$0 = null;
                summaryPromotionsPreloadRepository$preloadMediaInfo$1.L$1 = set;
                summaryPromotionsPreloadRepository$preloadMediaInfo$1.L$2 = null;
                summaryPromotionsPreloadRepository$preloadMediaInfo$1.L$3 = it;
                summaryPromotionsPreloadRepository$preloadMediaInfo$1.L$4 = null;
                summaryPromotionsPreloadRepository$preloadMediaInfo$1.L$5 = aVar;
                summaryPromotionsPreloadRepository$preloadMediaInfo$1.L$6 = null;
                summaryPromotionsPreloadRepository$preloadMediaInfo$1.label = 2;
            }
        }
        summaryPromotionsPreloadRepository$preloadMediaInfo$1 = new SummaryPromotionsPreloadRepository$preloadMediaInfo$1(this, continuationImpl);
        Object obj3 = summaryPromotionsPreloadRepository$preloadMediaInfo$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = summaryPromotionsPreloadRepository$preloadMediaInfo$1.label;
        if (i != 0) {
        }
        if (it.hasNext()) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0146, code lost:
    
        if (d(r7, r8, r0) != r1) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0108, code lost:
    
        if (d(r6, r8, r0) == r1) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Set set, SummaryPromotionsResponse.a aVar, ContinuationImpl continuationImpl) {
        SummaryPromotionsPreloadRepository$preloadWidgetInfo$1 summaryPromotionsPreloadRepository$preloadWidgetInfo$1;
        z051 b;
        Set set2;
        z051 z051Var;
        if (continuationImpl instanceof SummaryPromotionsPreloadRepository$preloadWidgetInfo$1) {
            summaryPromotionsPreloadRepository$preloadWidgetInfo$1 = (SummaryPromotionsPreloadRepository$preloadWidgetInfo$1) continuationImpl;
            int i = summaryPromotionsPreloadRepository$preloadWidgetInfo$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                summaryPromotionsPreloadRepository$preloadWidgetInfo$1.label = i - Integer.MIN_VALUE;
                Object obj = summaryPromotionsPreloadRepository$preloadWidgetInfo$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                switch (summaryPromotionsPreloadRepository$preloadWidgetInfo$1.label) {
                    case 0:
                        kotlin.b.b(obj);
                        CommunicationItem.a f = aVar.getF();
                        this.c.getClass();
                        b = ru.yandex.taxi.summary.promotions.models.a.b(f);
                        if (b instanceof l051) {
                            FormattedText formattedText = (FormattedText) ((l051) b).a().d.getValue();
                            summaryPromotionsPreloadRepository$preloadWidgetInfo$1.L$0 = null;
                            summaryPromotionsPreloadRepository$preloadWidgetInfo$1.L$1 = null;
                            summaryPromotionsPreloadRepository$preloadWidgetInfo$1.L$2 = null;
                            summaryPromotionsPreloadRepository$preloadWidgetInfo$1.label = 1;
                            Object d = d(set, formattedText, summaryPromotionsPreloadRepository$preloadWidgetInfo$1);
                            if (d != obj2) {
                                return d;
                            }
                        } else if (b instanceof p051) {
                            FormattedText formattedText2 = (FormattedText) ((p051) b).a().d.getValue();
                            summaryPromotionsPreloadRepository$preloadWidgetInfo$1.L$0 = null;
                            summaryPromotionsPreloadRepository$preloadWidgetInfo$1.L$1 = null;
                            summaryPromotionsPreloadRepository$preloadWidgetInfo$1.L$2 = null;
                            summaryPromotionsPreloadRepository$preloadWidgetInfo$1.label = 2;
                            Object d2 = d(set, formattedText2, summaryPromotionsPreloadRepository$preloadWidgetInfo$1);
                            if (d2 != obj2) {
                                return d2;
                            }
                        } else if (b instanceof r051) {
                            FormattedText formattedText3 = (FormattedText) ((r051) b).a().d.getValue();
                            summaryPromotionsPreloadRepository$preloadWidgetInfo$1.L$0 = null;
                            summaryPromotionsPreloadRepository$preloadWidgetInfo$1.L$1 = null;
                            summaryPromotionsPreloadRepository$preloadWidgetInfo$1.L$2 = null;
                            summaryPromotionsPreloadRepository$preloadWidgetInfo$1.label = 3;
                            Object d3 = d(set, formattedText3, summaryPromotionsPreloadRepository$preloadWidgetInfo$1);
                            if (d3 != obj2) {
                                return d3;
                            }
                        } else if (b instanceof u051) {
                            FormattedText b2 = ((u051) b).a().b.getB();
                            summaryPromotionsPreloadRepository$preloadWidgetInfo$1.L$0 = set;
                            summaryPromotionsPreloadRepository$preloadWidgetInfo$1.L$1 = null;
                            summaryPromotionsPreloadRepository$preloadWidgetInfo$1.L$2 = b;
                            summaryPromotionsPreloadRepository$preloadWidgetInfo$1.label = 4;
                            break;
                        } else {
                            if (!(b instanceof v051)) {
                                if ((b instanceof m051) || (b instanceof o051) || b.equals(s051.a)) {
                                    return zy11.a;
                                }
                                w511.b();
                                return null;
                            }
                            FormattedText a = ((v051) b).a();
                            summaryPromotionsPreloadRepository$preloadWidgetInfo$1.L$0 = null;
                            summaryPromotionsPreloadRepository$preloadWidgetInfo$1.L$1 = null;
                            summaryPromotionsPreloadRepository$preloadWidgetInfo$1.L$2 = null;
                            summaryPromotionsPreloadRepository$preloadWidgetInfo$1.label = 8;
                            Object d4 = d(set, a, summaryPromotionsPreloadRepository$preloadWidgetInfo$1);
                            if (d4 != obj2) {
                                return d4;
                            }
                        }
                    case 1:
                    case 2:
                    case 3:
                    case 7:
                    case 8:
                        kotlin.b.b(obj);
                        return obj;
                    case 4:
                        z051 z051Var2 = (z051) summaryPromotionsPreloadRepository$preloadWidgetInfo$1.L$2;
                        Set set3 = (Set) summaryPromotionsPreloadRepository$preloadWidgetInfo$1.L$0;
                        kotlin.b.b(obj);
                        b = z051Var2;
                        set = set3;
                        FormattedText c = ((u051) b).a().b.getC();
                        summaryPromotionsPreloadRepository$preloadWidgetInfo$1.L$0 = set;
                        summaryPromotionsPreloadRepository$preloadWidgetInfo$1.L$1 = null;
                        summaryPromotionsPreloadRepository$preloadWidgetInfo$1.L$2 = b;
                        summaryPromotionsPreloadRepository$preloadWidgetInfo$1.label = 5;
                        if (d(set, c, summaryPromotionsPreloadRepository$preloadWidgetInfo$1) != obj2) {
                            z051 z051Var3 = b;
                            set2 = set;
                            z051Var = z051Var3;
                            FormattedText b3 = ((u051) z051Var).a().c.getB();
                            summaryPromotionsPreloadRepository$preloadWidgetInfo$1.L$0 = set2;
                            summaryPromotionsPreloadRepository$preloadWidgetInfo$1.L$1 = null;
                            summaryPromotionsPreloadRepository$preloadWidgetInfo$1.L$2 = z051Var;
                            summaryPromotionsPreloadRepository$preloadWidgetInfo$1.label = 6;
                            break;
                        }
                    case 5:
                        z051Var = (z051) summaryPromotionsPreloadRepository$preloadWidgetInfo$1.L$2;
                        set2 = (Set) summaryPromotionsPreloadRepository$preloadWidgetInfo$1.L$0;
                        kotlin.b.b(obj);
                        FormattedText b32 = ((u051) z051Var).a().c.getB();
                        summaryPromotionsPreloadRepository$preloadWidgetInfo$1.L$0 = set2;
                        summaryPromotionsPreloadRepository$preloadWidgetInfo$1.L$1 = null;
                        summaryPromotionsPreloadRepository$preloadWidgetInfo$1.L$2 = z051Var;
                        summaryPromotionsPreloadRepository$preloadWidgetInfo$1.label = 6;
                        break;
                    case 6:
                        z051Var = (z051) summaryPromotionsPreloadRepository$preloadWidgetInfo$1.L$2;
                        set2 = (Set) summaryPromotionsPreloadRepository$preloadWidgetInfo$1.L$0;
                        kotlin.b.b(obj);
                        FormattedText c2 = ((u051) z051Var).a().c.getC();
                        summaryPromotionsPreloadRepository$preloadWidgetInfo$1.L$0 = null;
                        summaryPromotionsPreloadRepository$preloadWidgetInfo$1.L$1 = null;
                        summaryPromotionsPreloadRepository$preloadWidgetInfo$1.L$2 = null;
                        summaryPromotionsPreloadRepository$preloadWidgetInfo$1.label = 7;
                        Object d5 = d(set2, c2, summaryPromotionsPreloadRepository$preloadWidgetInfo$1);
                        return d5 == obj2 ? obj2 : d5;
                    default:
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        summaryPromotionsPreloadRepository$preloadWidgetInfo$1 = new SummaryPromotionsPreloadRepository$preloadWidgetInfo$1(this, continuationImpl);
        Object obj3 = summaryPromotionsPreloadRepository$preloadWidgetInfo$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        switch (summaryPromotionsPreloadRepository$preloadWidgetInfo$1.label) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(Set set, FormattedText formattedText, ContinuationImpl continuationImpl) {
        SummaryPromotionsPreloadRepository$processTextImages$1 summaryPromotionsPreloadRepository$processTextImages$1;
        int i;
        Set set2;
        Iterator it;
        String a;
        if (continuationImpl instanceof SummaryPromotionsPreloadRepository$processTextImages$1) {
            summaryPromotionsPreloadRepository$processTextImages$1 = (SummaryPromotionsPreloadRepository$processTextImages$1) continuationImpl;
            int i2 = summaryPromotionsPreloadRepository$processTextImages$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                summaryPromotionsPreloadRepository$processTextImages$1.label = i2 - Integer.MIN_VALUE;
                Object obj = summaryPromotionsPreloadRepository$processTextImages$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = summaryPromotionsPreloadRepository$processTextImages$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (formattedText != null) {
                        Iterator it2 = formattedText.a.iterator();
                        set2 = set;
                        it = it2;
                    }
                    return zy11.a;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                it = (Iterator) summaryPromotionsPreloadRepository$processTextImages$1.L$3;
                set2 = (Set) summaryPromotionsPreloadRepository$processTextImages$1.L$0;
                kotlin.b.b(obj);
                while (it.hasNext()) {
                    o oVar = (o) it.next();
                    switch (fnv0.a[oVar.d().ordinal()]) {
                        case 1:
                            a = ((m7x0) this.b).a(((FormattedText.d) oVar).a);
                            break;
                        case 2:
                            a = ((FormattedText.e) oVar).a;
                            break;
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            a = null;
                            break;
                        default:
                            w511.b();
                            return null;
                    }
                    if (a != null) {
                        summaryPromotionsPreloadRepository$processTextImages$1.L$0 = set2;
                        summaryPromotionsPreloadRepository$processTextImages$1.L$1 = null;
                        summaryPromotionsPreloadRepository$processTextImages$1.L$2 = null;
                        summaryPromotionsPreloadRepository$processTextImages$1.L$3 = it;
                        summaryPromotionsPreloadRepository$processTextImages$1.L$4 = null;
                        summaryPromotionsPreloadRepository$processTextImages$1.L$5 = null;
                        summaryPromotionsPreloadRepository$processTextImages$1.L$6 = null;
                        summaryPromotionsPreloadRepository$processTextImages$1.label = 1;
                        if (a(set2, a, summaryPromotionsPreloadRepository$processTextImages$1) == obj2) {
                            return obj2;
                        }
                    }
                }
                return zy11.a;
            }
        }
        summaryPromotionsPreloadRepository$processTextImages$1 = new SummaryPromotionsPreloadRepository$processTextImages$1(this, continuationImpl);
        Object obj3 = summaryPromotionsPreloadRepository$processTextImages$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = summaryPromotionsPreloadRepository$processTextImages$1.label;
        if (i != 0) {
        }
        while (it.hasNext()) {
        }
        return zy11.a;
    }
}
