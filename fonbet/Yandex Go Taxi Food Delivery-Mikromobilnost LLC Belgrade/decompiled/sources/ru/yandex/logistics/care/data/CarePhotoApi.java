package ru.yandex.logistics.care.data;

import defpackage.m5j0;
import defpackage.mg90;
import defpackage.qg21;
import defpackage.s490;
import defpackage.uau;
import defpackage.xw40;
import defpackage.z8u;
import defpackage.zc21;
import defpackage.zw40;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001JX\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\u00052\b\b\u0001\u0010\t\u001a\u00020\b2\u0014\b\u0001\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\nH§@¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Lru/yandex/logistics/care/data/CarePhotoApi;", "", "", "url", "idempotencyToken", "Lm5j0;", "photoClass", "photoMimeType", "Lzw40;", "photoPart", "", "headers", "Lzc21;", "a", "(Ljava/lang/String;Ljava/lang/String;Lm5j0;Lm5j0;Lzw40;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sdk-care"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface CarePhotoApi {
    @s490
    @xw40
    Object a(@qg21 String str, @z8u("X-Idempotency-Token") String str2, @mg90("photo_class") m5j0 m5j0Var, @mg90("photo_mime_type") m5j0 m5j0Var2, @mg90 zw40 zw40Var, @uau Map<String, String> map, Continuation<? super zc21> continuation);
}
