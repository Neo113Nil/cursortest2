package ru.yandex.taxi.favorites.data.repo;

import com.yandex.go.address.dto.AddressDTO;
import com.yandex.go.address.models.Address;
import defpackage.dzm;
import defpackage.h73;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.q0t;
import defpackage.q6r;
import defpackage.u6r;
import defpackage.vpr;
import defpackage.wls;
import defpackage.wwb;
import defpackage.xw01;
import defpackage.yuu;
import defpackage.yw01;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.launch.c;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lcom/yandex/go/address/dto/AddressDTO;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.favorites.data.repo.FavoriteAddressesRepositoryImpl$modifyWithPorchAndComment$1", f = "FavoriteAddressesRepositoryImpl.kt", l = {141, 144, 169, 174}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class FavoriteAddressesRepositoryImpl$modifyWithPorchAndComment$1 extends SuspendLambda implements wls {
    final /* synthetic */ Address $address;
    final /* synthetic */ AddressDTO $addressDTO;
    final /* synthetic */ String $comment;
    final /* synthetic */ String $entrance;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FavoriteAddressesRepositoryImpl$modifyWithPorchAndComment$1(a aVar, Address address, String str, AddressDTO addressDTO, String str2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$address = address;
        this.$entrance = str;
        this.$addressDTO = addressDTO;
        this.$comment = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        FavoriteAddressesRepositoryImpl$modifyWithPorchAndComment$1 favoriteAddressesRepositoryImpl$modifyWithPorchAndComment$1 = new FavoriteAddressesRepositoryImpl$modifyWithPorchAndComment$1(this.this$0, this.$address, this.$entrance, this.$addressDTO, this.$comment, continuation);
        favoriteAddressesRepositoryImpl$modifyWithPorchAndComment$1.L$0 = obj;
        return favoriteAddressesRepositoryImpl$modifyWithPorchAndComment$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FavoriteAddressesRepositoryImpl$modifyWithPorchAndComment$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:2|(1:(1:(1:(1:(3:8|9|10)(2:12|13))(8:14|15|16|17|(3:20|(2:22|23)(1:24)|18)|25|9|10))(9:31|32|33|34|35|36|(5:38|39|17|(1:18)|25)|9|10))(1:44))(1:52)|45|46|47|(6:49|35|36|(0)|9|10)|23) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0170, code lost:
    
        if (r1.emit(r3, r34) == r2) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x012c, code lost:
    
        r19 = r9;
        r16 = r10;
        r23 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x008f, code lost:
    
        if (r3.c(r34) == r2) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0102 A[Catch: all -> 0x0051, CancellationException -> 0x0176, TRY_LEAVE, TryCatch #0 {all -> 0x0051, blocks: (B:16:0x004c, B:18:0x00fc, B:20:0x0102), top: B:15:0x004c }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d6 A[Catch: all -> 0x0125, CancellationException -> 0x0176, TRY_LEAVE, TryCatch #1 {all -> 0x0125, blocks: (B:36:0x00d0, B:38:0x00d6), top: B:35:0x00d0 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        a aVar;
        String str;
        AddressDTO addressDTO;
        String str2;
        String str3;
        AddressDTO addressDTO2;
        String str4;
        Object c;
        String str5;
        List list;
        Iterator xw01Var;
        String str6;
        AddressDTO addressDTO3;
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                b.b(obj);
                c cVar = this.this$0.b;
                this.L$0 = vprVar;
                this.label = 1;
            } else {
                if (i != 1) {
                    if (i == 2) {
                        str5 = (String) this.L$5;
                        String str7 = (String) this.L$4;
                        addressDTO3 = (AddressDTO) this.L$3;
                        String str8 = (String) this.L$2;
                        aVar = (a) this.L$1;
                        try {
                            b.b(obj);
                            str2 = str8;
                            addressDTO = addressDTO3;
                            str = str7;
                            c = obj;
                            try {
                                list = ((u6r) c).c;
                                if (list != null) {
                                    xw01Var = new xw01(new yw01(new yw01(new h73(1, list), new dzm(18, aVar)), new wwb(str2, 28)));
                                    str6 = str;
                                    addressDTO3 = addressDTO;
                                    while (xw01Var.hasNext()) {
                                    }
                                }
                            } catch (Throwable unused) {
                                str4 = str5;
                                str3 = str;
                                addressDTO2 = addressDTO;
                                AddressDTO g = AddressDTO.g(addressDTO2, null, null, str3, null, null, null, str4, null, null, null, null, null, null, null, null, null, 33554299);
                                this.L$0 = null;
                                this.L$1 = null;
                                this.L$2 = null;
                                this.L$3 = null;
                                this.L$4 = null;
                                this.L$5 = null;
                                this.L$6 = null;
                                this.L$7 = null;
                                this.L$8 = null;
                                this.L$9 = null;
                                this.label = 4;
                            }
                        } catch (Throwable unused2) {
                            str3 = str7;
                            str4 = str5;
                            addressDTO2 = addressDTO3;
                            AddressDTO g2 = AddressDTO.g(addressDTO2, null, null, str3, null, null, null, str4, null, null, null, null, null, null, null, null, null, 33554299);
                            this.L$0 = null;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.L$4 = null;
                            this.L$5 = null;
                            this.L$6 = null;
                            this.L$7 = null;
                            this.L$8 = null;
                            this.L$9 = null;
                            this.label = 4;
                        }
                        return zy11.a;
                    }
                    if (i != 3) {
                        if (i != 4) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        b.b(obj);
                        return zy11.a;
                    }
                    xw01Var = (Iterator) this.L$7;
                    str5 = (String) this.L$3;
                    str6 = (String) this.L$2;
                    addressDTO3 = (AddressDTO) this.L$1;
                    try {
                        b.b(obj);
                    } catch (Throwable unused3) {
                        str4 = str5;
                        str3 = str6;
                        addressDTO2 = addressDTO3;
                        AddressDTO g22 = AddressDTO.g(addressDTO2, null, null, str3, null, null, null, str4, null, null, null, null, null, null, null, null, null, 33554299);
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = null;
                        this.L$5 = null;
                        this.L$6 = null;
                        this.L$7 = null;
                        this.L$8 = null;
                        this.L$9 = null;
                        this.label = 4;
                    }
                    while (xw01Var.hasNext()) {
                        AddressDTO addressDTO4 = (AddressDTO) xw01Var.next();
                        this.L$0 = vprVar;
                        this.L$1 = addressDTO3;
                        this.L$2 = str6;
                        this.L$3 = str5;
                        this.L$4 = null;
                        this.L$5 = null;
                        this.L$6 = null;
                        this.L$7 = xw01Var;
                        this.L$8 = null;
                        this.L$9 = null;
                        this.label = 3;
                        if (vprVar.emit(addressDTO4, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return zy11.a;
                }
                b.b(obj);
            }
            aVar = this.this$0;
            Address address = this.$address;
            str = this.$entrance;
            addressDTO = this.$addressDTO;
            str2 = this.$comment;
            ru.yandex.taxi.persuggest.api.a aVar2 = aVar.a;
            String a = yuu.a(aVar.d.c());
            q6r a2 = a.a(aVar, address, str, addressDTO, aVar.e.a());
            q0t q0tVar = new q0t(0);
            this.L$0 = vprVar;
            this.L$1 = aVar;
            this.L$2 = str2;
            this.L$3 = addressDTO;
            this.L$4 = str;
            this.L$5 = str2;
            this.label = 2;
            c = aVar2.c(a, a2, q0tVar, this);
            if (c != coroutineSingletons) {
                str5 = str2;
                list = ((u6r) c).c;
                if (list != null) {
                }
                return zy11.a;
            }
            return coroutineSingletons;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
