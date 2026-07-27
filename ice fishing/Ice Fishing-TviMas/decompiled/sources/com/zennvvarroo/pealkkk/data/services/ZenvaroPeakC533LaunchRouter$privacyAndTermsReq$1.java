package com.zennvvarroo.pealkkk.data.services;

import android.os.Handler;
import android.util.Base64;
import androidx.core.app.NotificationCompat;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.json.JSONObject;

/* compiled from: ZenvaroPeakC533LaunchRouter.kt */
@Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"com/zennvvarroo/pealkkk/data/services/ZenvaroPeakC533LaunchRouter$privacyAndTermsReq$1", "Lokhttp3/Callback;", "onFailure", "", NotificationCompat.CATEGORY_CALL, "Lokhttp3/Call;", "e", "Ljava/io/IOException;", "onResponse", "response", "Lokhttp3/Response;", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ZenvaroPeakC533LaunchRouter$privacyAndTermsReq$1 implements Callback {
    final /* synthetic */ Function1<Result<String>, Unit> $completion;

    /* JADX WARN: Multi-variable type inference failed */
    ZenvaroPeakC533LaunchRouter$privacyAndTermsReq$1(Function1<? super Result<String>, Unit> function1) {
        this.$completion = function1;
    }

    @Override // okhttp3.Callback
    public void onFailure(Call call, final IOException e) {
        Handler handler;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(e, "e");
        handler = ZenvaroPeakC533LaunchRouter.mainHandler;
        final Function1<Result<String>, Unit> function1 = this.$completion;
        handler.post(new Runnable() { // from class: com.zennvvarroo.pealkkk.data.services.ZenvaroPeakC533LaunchRouter$privacyAndTermsReq$1$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                ZenvaroPeakC533LaunchRouter$privacyAndTermsReq$1.onFailure$lambda$0(Function1.this, e);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onFailure$lambda$0(Function1 completion, IOException e) {
        Intrinsics.checkNotNullParameter(completion, "$completion");
        Intrinsics.checkNotNullParameter(e, "$e");
        Result.Companion companion = Result.INSTANCE;
        completion.invoke(Result.m6238boximpl(Result.m6239constructorimpl(ResultKt.createFailure(e))));
    }

    @Override // okhttp3.Callback
    public void onResponse(Call call, Response response) {
        String extractBase64;
        Handler handler;
        ZenvaroPeakC533GatePayload zenvaroPeakC533GatePayload;
        ZenvaroPeakC533LocalVault zenvaroPeakC533LocalVault;
        ZenvaroPeakC533LocalVault zenvaroPeakC533LocalVault2;
        ZenvaroPeakC533LocalVault zenvaroPeakC533LocalVault3;
        ZenvaroPeakC533LocalVault zenvaroPeakC533LocalVault4;
        Handler handler2;
        ZenvaroPeakC533LocalVault zenvaroPeakC533LocalVault5;
        ZenvaroPeakC533LocalVault zenvaroPeakC533LocalVault6;
        Handler handler3;
        Handler handler4;
        Handler handler5;
        Handler handler6;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
        Response response2 = response;
        final Function1<Result<String>, Unit> function1 = this.$completion;
        try {
            final Response response3 = response2;
            if (!response3.isSuccessful()) {
                handler6 = ZenvaroPeakC533LaunchRouter.mainHandler;
                handler6.post(new Runnable() { // from class: com.zennvvarroo.pealkkk.data.services.ZenvaroPeakC533LaunchRouter$privacyAndTermsReq$1$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ZenvaroPeakC533LaunchRouter$privacyAndTermsReq$1.onResponse$lambda$7$lambda$1(Function1.this, response3);
                    }
                });
                CloseableKt.closeFinally(response2, null);
                return;
            }
            ResponseBody body = response3.body();
            String string = body != null ? body.string() : null;
            if (string == null) {
                string = "";
            }
            if (StringsKt.isBlank(string)) {
                handler5 = ZenvaroPeakC533LaunchRouter.mainHandler;
                handler5.post(new Runnable() { // from class: com.zennvvarroo.pealkkk.data.services.ZenvaroPeakC533LaunchRouter$privacyAndTermsReq$1$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        ZenvaroPeakC533LaunchRouter$privacyAndTermsReq$1.onResponse$lambda$7$lambda$2(Function1.this);
                    }
                });
                CloseableKt.closeFinally(response2, null);
                return;
            }
            extractBase64 = ZenvaroPeakC533LaunchRouter.INSTANCE.extractBase64(string);
            if (extractBase64 == null) {
                handler4 = ZenvaroPeakC533LaunchRouter.mainHandler;
                handler4.post(new Runnable() { // from class: com.zennvvarroo.pealkkk.data.services.ZenvaroPeakC533LaunchRouter$privacyAndTermsReq$1$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        ZenvaroPeakC533LaunchRouter$privacyAndTermsReq$1.onResponse$lambda$7$lambda$3(Function1.this);
                    }
                });
                CloseableKt.closeFinally(response2, null);
                return;
            }
            try {
                byte[] decode = Base64.decode(extractBase64, 0);
                Intrinsics.checkNotNull(decode);
                JSONObject jSONObject = new JSONObject(new String(decode, Charsets.UTF_8));
                String optString = jSONObject.optString("link", "");
                Intrinsics.checkNotNullExpressionValue(optString, "optString(...)");
                String optString2 = jSONObject.optString("naming", "");
                Intrinsics.checkNotNullExpressionValue(optString2, "optString(...)");
                zenvaroPeakC533GatePayload = new ZenvaroPeakC533GatePayload(optString, optString2, jSONObject.optBoolean("first_link", false));
            } catch (Exception e) {
                handler = ZenvaroPeakC533LaunchRouter.mainHandler;
                handler.post(new Runnable() { // from class: com.zennvvarroo.pealkkk.data.services.ZenvaroPeakC533LaunchRouter$privacyAndTermsReq$1$$ExternalSyntheticLambda5
                    @Override // java.lang.Runnable
                    public final void run() {
                        ZenvaroPeakC533LaunchRouter$privacyAndTermsReq$1.onResponse$lambda$7$lambda$6(Function1.this, e);
                    }
                });
            }
            if (StringsKt.isBlank(zenvaroPeakC533GatePayload.getLink())) {
                handler3 = ZenvaroPeakC533LaunchRouter.mainHandler;
                handler3.post(new Runnable() { // from class: com.zennvvarroo.pealkkk.data.services.ZenvaroPeakC533LaunchRouter$privacyAndTermsReq$1$$ExternalSyntheticLambda3
                    @Override // java.lang.Runnable
                    public final void run() {
                        ZenvaroPeakC533LaunchRouter$privacyAndTermsReq$1.onResponse$lambda$7$lambda$4(Function1.this);
                    }
                });
                CloseableKt.closeFinally(response2, null);
                return;
            }
            zenvaroPeakC533LocalVault = ZenvaroPeakC533LaunchRouter.prefs;
            if (zenvaroPeakC533LocalVault == null) {
                Intrinsics.throwUninitializedPropertyAccessException("prefs");
                zenvaroPeakC533LocalVault = null;
            }
            zenvaroPeakC533LocalVault.setStatus(zenvaroPeakC533GatePayload.getFirst_link());
            zenvaroPeakC533LocalVault2 = ZenvaroPeakC533LaunchRouter.prefs;
            if (zenvaroPeakC533LocalVault2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("prefs");
                zenvaroPeakC533LocalVault2 = null;
            }
            final String initial = zenvaroPeakC533LocalVault2.getInitial();
            zenvaroPeakC533LocalVault3 = ZenvaroPeakC533LaunchRouter.prefs;
            if (zenvaroPeakC533LocalVault3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("prefs");
                zenvaroPeakC533LocalVault3 = null;
            }
            String finalUrl = zenvaroPeakC533LocalVault3.getFinalUrl();
            if (zenvaroPeakC533GatePayload.getFirst_link()) {
                zenvaroPeakC533LocalVault5 = ZenvaroPeakC533LaunchRouter.prefs;
                if (zenvaroPeakC533LocalVault5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("prefs");
                    zenvaroPeakC533LocalVault5 = null;
                }
                zenvaroPeakC533LocalVault5.setFinalUrl(null);
                zenvaroPeakC533LocalVault6 = ZenvaroPeakC533LaunchRouter.prefs;
                if (zenvaroPeakC533LocalVault6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("prefs");
                    zenvaroPeakC533LocalVault6 = null;
                }
                zenvaroPeakC533LocalVault6.setInitial(zenvaroPeakC533GatePayload.getLink());
                initial = zenvaroPeakC533GatePayload.getLink();
            } else if (finalUrl != null) {
                initial = finalUrl;
            } else if (initial == null) {
                zenvaroPeakC533LocalVault4 = ZenvaroPeakC533LaunchRouter.prefs;
                if (zenvaroPeakC533LocalVault4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("prefs");
                    zenvaroPeakC533LocalVault4 = null;
                }
                zenvaroPeakC533LocalVault4.setInitial(zenvaroPeakC533GatePayload.getLink());
                initial = zenvaroPeakC533GatePayload.getLink();
            }
            handler2 = ZenvaroPeakC533LaunchRouter.mainHandler;
            handler2.post(new Runnable() { // from class: com.zennvvarroo.pealkkk.data.services.ZenvaroPeakC533LaunchRouter$privacyAndTermsReq$1$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    ZenvaroPeakC533LaunchRouter$privacyAndTermsReq$1.onResponse$lambda$7$lambda$5(Function1.this, initial);
                }
            });
            CloseableKt.closeFinally(response2, null);
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onResponse$lambda$7$lambda$1(Function1 completion, Response safeResponse) {
        Intrinsics.checkNotNullParameter(completion, "$completion");
        Intrinsics.checkNotNullParameter(safeResponse, "$safeResponse");
        Result.Companion companion = Result.INSTANCE;
        completion.invoke(Result.m6238boximpl(Result.m6239constructorimpl(ResultKt.createFailure(new IOException("HTTP error: " + safeResponse.code())))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onResponse$lambda$7$lambda$2(Function1 completion) {
        Intrinsics.checkNotNullParameter(completion, "$completion");
        Result.Companion companion = Result.INSTANCE;
        completion.invoke(Result.m6238boximpl(Result.m6239constructorimpl(ResultKt.createFailure(new Exception("Empty server response")))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onResponse$lambda$7$lambda$3(Function1 completion) {
        Intrinsics.checkNotNullParameter(completion, "$completion");
        Result.Companion companion = Result.INSTANCE;
        completion.invoke(Result.m6238boximpl(Result.m6239constructorimpl(ResultKt.createFailure(new Exception("Base64 not found")))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onResponse$lambda$7$lambda$4(Function1 completion) {
        Intrinsics.checkNotNullParameter(completion, "$completion");
        Result.Companion companion = Result.INSTANCE;
        completion.invoke(Result.m6238boximpl(Result.m6239constructorimpl(ResultKt.createFailure(new Exception("Decoded link is blank")))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onResponse$lambda$7$lambda$5(Function1 completion, String resultLink) {
        Intrinsics.checkNotNullParameter(completion, "$completion");
        Intrinsics.checkNotNullParameter(resultLink, "$resultLink");
        Result.Companion companion = Result.INSTANCE;
        completion.invoke(Result.m6238boximpl(Result.m6239constructorimpl(resultLink)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onResponse$lambda$7$lambda$6(Function1 completion, Exception e) {
        Intrinsics.checkNotNullParameter(completion, "$completion");
        Intrinsics.checkNotNullParameter(e, "$e");
        Result.Companion companion = Result.INSTANCE;
        completion.invoke(Result.m6238boximpl(Result.m6239constructorimpl(ResultKt.createFailure(e))));
    }
}
