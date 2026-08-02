package defpackage;

import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonParseException;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.lang.reflect.Type;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.text.Charsets;

/* loaded from: classes4.dex */
public final class izi extends aur implements Function2 {
    public /* synthetic */ Object j;
    public final /* synthetic */ long k;
    public final /* synthetic */ xdh l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Type n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public izi(long j, xdh xdhVar, Object obj, Type type, Continuation continuation) {
        super(2, continuation);
        this.k = j;
        this.l = xdhVar;
        this.m = obj;
        this.n = type;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        izi iziVar = new izi(this.k, this.l, this.m, this.n, continuation);
        iziVar.j = obj;
        return iziVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((izi) create((OutputStream) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        OutputStream outputStream = (OutputStream) this.j;
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        dataOutputStream.writeLong(this.k);
        dataOutputStream.flush();
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, Charsets.UTF_8), RemoteCameraConfig.Notification.ID);
        Object obj2 = this.m;
        Type type = this.n;
        xdh xdhVar = this.l;
        Gson gson = (Gson) xdhVar.a;
        coi coiVar = (coi) xdhVar.c;
        try {
            try {
                gson.l(obj2, type, gson.h(bufferedWriter));
            } catch (IOException e) {
                throw new JsonIOException(e);
            }
        } catch (Exception e2) {
            if (!(e2 instanceof IllegalStateException) && !(e2 instanceof JsonParseException) && !(e2 instanceof NumberFormatException) && !(e2 instanceof IOException)) {
                ssg.a(7, "runWithGsonErrorCatching", "Unexpected exception, converter don't should throw it", e2);
                throw e2;
            }
            coiVar.invoke(e2);
        }
        bufferedWriter.flush();
        return Unit.a;
    }
}
