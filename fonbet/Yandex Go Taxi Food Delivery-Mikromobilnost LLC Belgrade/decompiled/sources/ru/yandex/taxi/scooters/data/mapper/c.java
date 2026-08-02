package ru.yandex.taxi.scooters.data.mapper;

import com.yandex.go.scooters.misc.api.error_dialog.ScootersErrorDialogPresentation$RetryDialogButtonListenerType;
import defpackage.av90;
import defpackage.avj0;
import defpackage.b9o;
import defpackage.dv90;
import defpackage.e9o;
import defpackage.fv90;
import defpackage.h9o;
import defpackage.jst;
import defpackage.kyh0;
import defpackage.l9o;
import defpackage.lkn0;
import defpackage.mkn0;
import defpackage.nkn0;
import defpackage.ny61;
import defpackage.ojn0;
import defpackage.okn0;
import defpackage.pjn0;
import defpackage.pkn0;
import defpackage.s8o;
import defpackage.sjh;
import defpackage.su90;
import defpackage.tcc;
import defpackage.tee;
import defpackage.tje;
import defpackage.tls;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.vu90;
import defpackage.w511;
import defpackage.wnt;
import defpackage.y7o;
import defpackage.zuj0;
import defpackage.zzs;
import java.io.BufferedInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.scooters.data.model.ButtonAction;
import ru.yandex.taxi.scooters.data.model.ScootersErrorCode;

/* loaded from: classes6.dex */
public final class c {
    public final wnt a;
    public final tt2 b;
    public final zuj0 c;

    public c(tt2 tt2Var, wnt wntVar, zuj0 zuj0Var) {
        this.a = wntVar;
        this.b = tt2Var;
        this.c = zuj0Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(2:10|11)(2:45|46))(3:47|48|(1:50))|12|(4:14|(4:16|(6:19|(3:21|(2:23|(2:25|(2:27|28)(1:30))(2:31|32))(2:33|34)|29)|35|36|29|17)|37|38)(1:43)|39|40)|44))|55|6|7|(0)(0)|12|(0)|44|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ac, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ae, code lost:
    
        throw r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0046 A[Catch: all -> 0x00ab, CancellationException -> 0x00ac, TryCatch #2 {CancellationException -> 0x00ac, all -> 0x00ab, blocks: (B:11:0x0028, B:12:0x0040, B:14:0x0046, B:16:0x0054, B:17:0x0065, B:19:0x006b, B:21:0x007d, B:27:0x008d, B:29:0x009b, B:30:0x0090, B:31:0x0094, B:33:0x0097, B:39:0x00a5, B:48:0x0035), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Throwable th, ContinuationImpl continuationImpl) {
        ScootersErrorMapper$getContent$1 scootersErrorMapper$getContent$1;
        int i;
        tee teeVar;
        ArrayList arrayList;
        ScootersErrorDialogPresentation$RetryDialogButtonListenerType scootersErrorDialogPresentation$RetryDialogButtonListenerType;
        if (continuationImpl instanceof ScootersErrorMapper$getContent$1) {
            scootersErrorMapper$getContent$1 = (ScootersErrorMapper$getContent$1) continuationImpl;
            int i2 = scootersErrorMapper$getContent$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersErrorMapper$getContent$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersErrorMapper$getContent$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersErrorMapper$getContent$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    scootersErrorMapper$getContent$1.L$0 = null;
                    scootersErrorMapper$getContent$1.label = 1;
                    obj = f(th, scootersErrorMapper$getContent$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                teeVar = ((b9o) obj).d;
                if (teeVar != null) {
                    String str = teeVar.a;
                    FormattedText formattedText = teeVar.b;
                    FormattedText formattedText2 = teeVar.c;
                    FormattedText formattedText3 = teeVar.d;
                    String str2 = teeVar.e;
                    List list = teeVar.f;
                    if (list != null) {
                        List<tee.a> list2 = list;
                        ArrayList arrayList2 = new ArrayList(tcc.n(list2, 10));
                        for (tee.a aVar : list2) {
                            String str3 = aVar.a;
                            FormattedText formattedText4 = aVar.b;
                            String str4 = aVar.c;
                            ButtonAction buttonAction = aVar.d;
                            if (buttonAction != null) {
                                int i3 = lkn0.a[buttonAction.ordinal()];
                                if (i3 == 1) {
                                    scootersErrorDialogPresentation$RetryDialogButtonListenerType = ScootersErrorDialogPresentation$RetryDialogButtonListenerType.DEFAULT;
                                } else if (i3 == 2) {
                                    scootersErrorDialogPresentation$RetryDialogButtonListenerType = ScootersErrorDialogPresentation$RetryDialogButtonListenerType.OPEN_SUPPORT;
                                } else if (i3 == 3) {
                                    scootersErrorDialogPresentation$RetryDialogButtonListenerType = ScootersErrorDialogPresentation$RetryDialogButtonListenerType.OPEN_PAYMENT_METHODS;
                                } else {
                                    w511.b();
                                }
                                arrayList2.add(new ojn0(str3, formattedText4, str4, scootersErrorDialogPresentation$RetryDialogButtonListenerType));
                            }
                            scootersErrorDialogPresentation$RetryDialogButtonListenerType = null;
                            arrayList2.add(new ojn0(str3, formattedText4, str4, scootersErrorDialogPresentation$RetryDialogButtonListenerType));
                        }
                        arrayList = arrayList2;
                    } else {
                        arrayList = null;
                    }
                    return new pjn0(str, formattedText, formattedText2, formattedText3, str2, arrayList);
                }
                return null;
            }
        }
        scootersErrorMapper$getContent$1 = new ScootersErrorMapper$getContent$1(this, continuationImpl);
        Object obj3 = scootersErrorMapper$getContent$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersErrorMapper$getContent$1.label;
        if (i != 0) {
        }
        teeVar = ((b9o) obj3).d;
        if (teeVar != null) {
        }
        return null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(2:10|11)(2:21|22))(3:23|24|(1:26))|12|(2:16|17)|20))|30|6|7|(0)(0)|12|(3:14|16|17)|20|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004e, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004f, code lost:
    
        throw r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Enum b(Throwable th, ContinuationImpl continuationImpl) {
        ScootersErrorMapper$getErrorCode$1 scootersErrorMapper$getErrorCode$1;
        int i;
        e9o e9oVar;
        h9o h9oVar;
        if (continuationImpl instanceof ScootersErrorMapper$getErrorCode$1) {
            scootersErrorMapper$getErrorCode$1 = (ScootersErrorMapper$getErrorCode$1) continuationImpl;
            int i2 = scootersErrorMapper$getErrorCode$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersErrorMapper$getErrorCode$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersErrorMapper$getErrorCode$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersErrorMapper$getErrorCode$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    scootersErrorMapper$getErrorCode$1.L$0 = null;
                    scootersErrorMapper$getErrorCode$1.label = 1;
                    obj = f(th, scootersErrorMapper$getErrorCode$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                e9oVar = ((b9o) obj).a;
                if (e9oVar != null && (h9oVar = e9oVar.c) != null) {
                    return h9oVar.a;
                }
                return null;
            }
        }
        scootersErrorMapper$getErrorCode$1 = new ScootersErrorMapper$getErrorCode$1(this, continuationImpl);
        Object obj2 = scootersErrorMapper$getErrorCode$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersErrorMapper$getErrorCode$1.label;
        if (i != 0) {
        }
        e9oVar = ((b9o) obj2).a;
        if (e9oVar != null) {
            return h9oVar.a;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0054 A[Catch: all -> 0x007d, CancellationException -> 0x0096, TryCatch #2 {CancellationException -> 0x0096, all -> 0x007d, blocks: (B:11:0x0028, B:12:0x0040, B:15:0x004a, B:20:0x0054, B:24:0x005c, B:26:0x0060, B:28:0x0067, B:30:0x006b, B:32:0x0072, B:34:0x0076, B:35:0x0078, B:46:0x0035), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0060 A[Catch: all -> 0x007d, CancellationException -> 0x0096, TryCatch #2 {CancellationException -> 0x0096, all -> 0x007d, blocks: (B:11:0x0028, B:12:0x0040, B:15:0x004a, B:20:0x0054, B:24:0x005c, B:26:0x0060, B:28:0x0067, B:30:0x006b, B:32:0x0072, B:34:0x0076, B:35:0x0078, B:46:0x0035), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0067 A[Catch: all -> 0x007d, CancellationException -> 0x0096, TryCatch #2 {CancellationException -> 0x0096, all -> 0x007d, blocks: (B:11:0x0028, B:12:0x0040, B:15:0x004a, B:20:0x0054, B:24:0x005c, B:26:0x0060, B:28:0x0067, B:30:0x006b, B:32:0x0072, B:34:0x0076, B:35:0x0078, B:46:0x0035), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0072 A[Catch: all -> 0x007d, CancellationException -> 0x0096, TryCatch #2 {CancellationException -> 0x0096, all -> 0x007d, blocks: (B:11:0x0028, B:12:0x0040, B:15:0x004a, B:20:0x0054, B:24:0x005c, B:26:0x0060, B:28:0x0067, B:30:0x006b, B:32:0x0072, B:34:0x0076, B:35:0x0078, B:46:0x0035), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Throwable th, ContinuationImpl continuationImpl) {
        ScootersErrorMapper$getErrorMessage$1 scootersErrorMapper$getErrorMessage$1;
        int i;
        e9o e9oVar;
        String str;
        String str2;
        h9o h9oVar;
        h9o h9oVar2;
        String str3;
        String str4;
        try {
            if (continuationImpl instanceof ScootersErrorMapper$getErrorMessage$1) {
                scootersErrorMapper$getErrorMessage$1 = (ScootersErrorMapper$getErrorMessage$1) continuationImpl;
                int i2 = scootersErrorMapper$getErrorMessage$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    scootersErrorMapper$getErrorMessage$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = scootersErrorMapper$getErrorMessage$1.result;
                    Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = scootersErrorMapper$getErrorMessage$1.label;
                    Boolean bool = null;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        scootersErrorMapper$getErrorMessage$1.L$0 = null;
                        scootersErrorMapper$getErrorMessage$1.label = 1;
                        obj = f(th, scootersErrorMapper$getErrorMessage$1);
                        if (obj == obj2) {
                            return obj2;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                    }
                    b9o b9oVar = (b9o) obj;
                    e9oVar = b9oVar.a;
                    if (e9oVar != null && (str4 = e9oVar.a) != null) {
                        str = str4;
                        if (e9oVar != null && (str3 = e9oVar.b) != null) {
                            str2 = str3;
                            l9o l9oVar = b9oVar.b;
                            zzs zzsVar = l9oVar == null ? l9oVar.a : null;
                            ScootersErrorCode scootersErrorCode = (e9oVar != null || (h9oVar2 = e9oVar.c) == null) ? null : h9oVar2.a;
                            if (e9oVar != null && (h9oVar = e9oVar.c) != null) {
                                bool = h9oVar.b;
                            }
                            return new y7o(str, str2, zzsVar, scootersErrorCode, bool);
                        }
                        str2 = "";
                        l9o l9oVar2 = b9oVar.b;
                        if (l9oVar2 == null) {
                        }
                        if (e9oVar != null) {
                        }
                        if (e9oVar != null) {
                            bool = h9oVar.b;
                        }
                        return new y7o(str, str2, zzsVar, scootersErrorCode, bool);
                    }
                    str = "";
                    if (e9oVar != null) {
                        str2 = str3;
                        l9o l9oVar22 = b9oVar.b;
                        if (l9oVar22 == null) {
                        }
                        if (e9oVar != null) {
                        }
                        if (e9oVar != null) {
                        }
                        return new y7o(str, str2, zzsVar, scootersErrorCode, bool);
                    }
                    str2 = "";
                    l9o l9oVar222 = b9oVar.b;
                    if (l9oVar222 == null) {
                    }
                    if (e9oVar != null) {
                    }
                    if (e9oVar != null) {
                    }
                    return new y7o(str, str2, zzsVar, scootersErrorCode, bool);
                }
            }
            if (i != 0) {
            }
            b9o b9oVar2 = (b9o) obj;
            e9oVar = b9oVar2.a;
            if (e9oVar != null) {
                str = str4;
                if (e9oVar != null) {
                }
                str2 = "";
                l9o l9oVar2222 = b9oVar2.b;
                if (l9oVar2222 == null) {
                }
                if (e9oVar != null) {
                }
                if (e9oVar != null) {
                }
                return new y7o(str, str2, zzsVar, scootersErrorCode, bool);
            }
            str = "";
            if (e9oVar != null) {
            }
            str2 = "";
            l9o l9oVar22222 = b9oVar2.b;
            if (l9oVar22222 == null) {
            }
            if (e9oVar != null) {
            }
            if (e9oVar != null) {
            }
            return new y7o(str, str2, zzsVar, scootersErrorCode, bool);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
            int i3 = kyh0.scooters_data_load_failed;
            avj0 avj0Var = (avj0) this.c;
            return new y7o(avj0Var.h(i3), avj0Var.h(kyh0.scooters_try_again), null, null, null);
        }
        scootersErrorMapper$getErrorMessage$1 = new ScootersErrorMapper$getErrorMessage$1(this, continuationImpl);
        Object obj3 = scootersErrorMapper$getErrorMessage$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersErrorMapper$getErrorMessage$1.label;
        Boolean bool2 = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(Throwable th, tls tlsVar, ContinuationImpl continuationImpl) {
        ScootersErrorMapper$getField$1 scootersErrorMapper$getField$1;
        int i;
        try {
            if (continuationImpl instanceof ScootersErrorMapper$getField$1) {
                scootersErrorMapper$getField$1 = (ScootersErrorMapper$getField$1) continuationImpl;
                int i2 = scootersErrorMapper$getField$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    scootersErrorMapper$getField$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = scootersErrorMapper$getField$1.result;
                    Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = scootersErrorMapper$getField$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        scootersErrorMapper$getField$1.L$0 = null;
                        scootersErrorMapper$getField$1.L$1 = null;
                        scootersErrorMapper$getField$1.L$2 = tlsVar;
                        scootersErrorMapper$getField$1.label = 1;
                        obj = f(th, scootersErrorMapper$getField$1);
                        if (obj == obj2) {
                            return obj2;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        tlsVar = (tls) scootersErrorMapper$getField$1.L$2;
                        kotlin.b.b(obj);
                    }
                    return tlsVar.invoke(obj);
                }
            }
            if (i != 0) {
            }
            return tlsVar.invoke(obj);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
            return null;
        }
        scootersErrorMapper$getField$1 = new ScootersErrorMapper$getField$1(this, continuationImpl);
        Object obj3 = scootersErrorMapper$getField$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersErrorMapper$getField$1.label;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(6:5|6|7|(1:(2:10|11)(2:34|35))(3:36|37|(1:39))|12|(2:14|15)(2:17|(2:19|20)(2:21|(2:23|24)(2:25|(2:27|28)(1:(2:30|31)(2:32|33)))))))|43|6|7|(0)(0)|12|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008b, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x008c, code lost:
    
        throw r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0048 A[Catch: all -> 0x008a, CancellationException -> 0x008b, TryCatch #2 {CancellationException -> 0x008b, all -> 0x008a, blocks: (B:11:0x0028, B:12:0x0040, B:14:0x0048, B:17:0x0052, B:19:0x0056, B:21:0x0060, B:23:0x0064, B:25:0x006e, B:27:0x0072, B:32:0x0084, B:33:0x0089, B:37:0x0035), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0052 A[Catch: all -> 0x008a, CancellationException -> 0x008b, TryCatch #2 {CancellationException -> 0x008b, all -> 0x008a, blocks: (B:11:0x0028, B:12:0x0040, B:14:0x0048, B:17:0x0052, B:19:0x0056, B:21:0x0060, B:23:0x0064, B:25:0x006e, B:27:0x0072, B:32:0x0084, B:33:0x0089, B:37:0x0035), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(Throwable th, ContinuationImpl continuationImpl) {
        ScootersErrorMapper$getPayload$1 scootersErrorMapper$getPayload$1;
        int i;
        fv90 fv90Var;
        if (continuationImpl instanceof ScootersErrorMapper$getPayload$1) {
            scootersErrorMapper$getPayload$1 = (ScootersErrorMapper$getPayload$1) continuationImpl;
            int i2 = scootersErrorMapper$getPayload$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersErrorMapper$getPayload$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersErrorMapper$getPayload$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersErrorMapper$getPayload$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    scootersErrorMapper$getPayload$1.L$0 = null;
                    scootersErrorMapper$getPayload$1.label = 1;
                    obj = f(th, scootersErrorMapper$getPayload$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                fv90Var = ((b9o) obj).c;
                if (!(fv90Var instanceof su90)) {
                    return new mkn0(((su90) fv90Var).a);
                }
                if (fv90Var instanceof av90) {
                    return new okn0(((av90) fv90Var).a);
                }
                if (fv90Var instanceof dv90) {
                    return new pkn0(((dv90) fv90Var).a);
                }
                if (fv90Var instanceof vu90) {
                    return new nkn0(((vu90) fv90Var).a, ((vu90) fv90Var).b);
                }
                if (fv90Var == null) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            }
        }
        scootersErrorMapper$getPayload$1 = new ScootersErrorMapper$getPayload$1(this, continuationImpl);
        Object obj3 = scootersErrorMapper$getPayload$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersErrorMapper$getPayload$1.label;
        if (i != 0) {
        }
        fv90Var = ((b9o) obj3).c;
        if (!(fv90Var instanceof su90)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0065 A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:11:0x002d, B:12:0x0061, B:14:0x0065, B:17:0x006d, B:19:0x0073, B:22:0x007b, B:24:0x007f, B:27:0x0084, B:28:0x008b, B:32:0x008d, B:33:0x0094, B:40:0x0048), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008d A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:11:0x002d, B:12:0x0061, B:14:0x0065, B:17:0x006d, B:19:0x0073, B:22:0x007b, B:24:0x007f, B:27:0x0084, B:28:0x008b, B:32:0x008d, B:33:0x0094, B:40:0x0048), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(Throwable th, ContinuationImpl continuationImpl) {
        ScootersErrorMapper$parseErrorResponse$1 scootersErrorMapper$parseErrorResponse$1;
        int i;
        b9o b9oVar;
        String str;
        h9o h9oVar;
        try {
            if (continuationImpl instanceof ScootersErrorMapper$parseErrorResponse$1) {
                scootersErrorMapper$parseErrorResponse$1 = (ScootersErrorMapper$parseErrorResponse$1) continuationImpl;
                int i2 = scootersErrorMapper$parseErrorResponse$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    scootersErrorMapper$parseErrorResponse$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = scootersErrorMapper$parseErrorResponse$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = scootersErrorMapper$parseErrorResponse$1.label;
                    ScootersErrorCode scootersErrorCode = null;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        if (!s8o.x(th)) {
                            throw th;
                        }
                        BufferedInputStream N = s8o.N(th);
                        if (N == null) {
                            throw th;
                        }
                        this.b.getClass();
                        sjh sjhVar = uyj.a;
                        ScootersErrorMapper$parseErrorResponse$errorResponse$1 scootersErrorMapper$parseErrorResponse$errorResponse$1 = new ScootersErrorMapper$parseErrorResponse$errorResponse$1(this, N, null);
                        scootersErrorMapper$parseErrorResponse$1.L$0 = th;
                        scootersErrorMapper$parseErrorResponse$1.L$1 = null;
                        scootersErrorMapper$parseErrorResponse$1.label = 1;
                        obj = tje.k0(sjhVar, scootersErrorMapper$parseErrorResponse$errorResponse$1, scootersErrorMapper$parseErrorResponse$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                    }
                    b9oVar = (b9o) obj;
                    if (b9oVar != null) {
                        throw new IllegalStateException("Error response is null");
                    }
                    e9o e9oVar = b9oVar.a;
                    if (b9oVar.c == null) {
                        if (e9oVar == null || (str = e9oVar.a) == null) {
                            str = "";
                        }
                        if (str.length() == 0) {
                            if (e9oVar != null && (h9oVar = e9oVar.c) != null) {
                                scootersErrorCode = h9oVar.a;
                            }
                            if (scootersErrorCode == null) {
                                throw new IllegalStateException("Error has empty title and no error code");
                            }
                        }
                    }
                    return b9oVar;
                }
            }
            if (i != 0) {
            }
            b9oVar = (b9o) obj;
            if (b9oVar != null) {
            }
        } catch (Throwable th2) {
            jst.e.k(th2, "Error occurred while parsing error message");
            throw th;
        }
        scootersErrorMapper$parseErrorResponse$1 = new ScootersErrorMapper$parseErrorResponse$1(this, continuationImpl);
        Object obj2 = scootersErrorMapper$parseErrorResponse$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersErrorMapper$parseErrorResponse$1.label;
        ScootersErrorCode scootersErrorCode2 = null;
    }
}
