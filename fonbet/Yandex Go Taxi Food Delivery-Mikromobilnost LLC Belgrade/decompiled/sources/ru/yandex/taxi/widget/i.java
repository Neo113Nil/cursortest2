package ru.yandex.taxi.widget;

import defpackage.cvu0;
import defpackage.ny61;
import defpackage.xby;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes10.dex */
public final class i {
    public static final i a = new i();

    public static String a(String str, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            str = cvu0.v(str, (String) entry.getKey(), (String) entry.getValue(), false);
        }
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(c cVar, FormattedText formattedText, Map map, ContinuationImpl continuationImpl) {
        TextTemplatesReplacer$replaceFormattedText$1 textTemplatesReplacer$replaceFormattedText$1;
        int i;
        Throwable th;
        try {
            if (continuationImpl instanceof TextTemplatesReplacer$replaceFormattedText$1) {
                textTemplatesReplacer$replaceFormattedText$1 = (TextTemplatesReplacer$replaceFormattedText$1) continuationImpl;
                int i2 = textTemplatesReplacer$replaceFormattedText$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    textTemplatesReplacer$replaceFormattedText$1.label = i2 - Integer.MIN_VALUE;
                    TextTemplatesReplacer$replaceFormattedText$1 textTemplatesReplacer$replaceFormattedText$12 = textTemplatesReplacer$replaceFormattedText$1;
                    Object obj = textTemplatesReplacer$replaceFormattedText$12.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = textTemplatesReplacer$replaceFormattedText$12.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        if (formattedText == null || formattedText.a.isEmpty()) {
                            return "";
                        }
                        try {
                            textTemplatesReplacer$replaceFormattedText$12.L$0 = cVar;
                            textTemplatesReplacer$replaceFormattedText$12.L$1 = formattedText;
                            textTemplatesReplacer$replaceFormattedText$12.L$2 = map;
                            textTemplatesReplacer$replaceFormattedText$12.label = 1;
                        } catch (Throwable th2) {
                            th = th2;
                            th = th;
                            xby.d.k(th, "Failed to cenvert formatted text with template");
                            return c.f(cVar, formattedText, false, map, 6);
                        }
                        try {
                            obj = c.e(cVar, formattedText, map, false, textTemplatesReplacer$replaceFormattedText$12, 28);
                            if (obj == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            cVar = cVar;
                            formattedText = formattedText;
                            map = map;
                        } catch (Throwable th3) {
                            th = th3;
                            cVar = cVar;
                            formattedText = formattedText;
                            map = map;
                            xby.d.k(th, "Failed to cenvert formatted text with template");
                            return c.f(cVar, formattedText, false, map, 6);
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        map = (Map) textTemplatesReplacer$replaceFormattedText$12.L$2;
                        formattedText = (FormattedText) textTemplatesReplacer$replaceFormattedText$12.L$1;
                        cVar = (c) textTemplatesReplacer$replaceFormattedText$12.L$0;
                        try {
                            kotlin.b.b(obj);
                        } catch (Throwable th4) {
                            th = th4;
                            th = th;
                            xby.d.k(th, "Failed to cenvert formatted text with template");
                            return c.f(cVar, formattedText, false, map, 6);
                        }
                    }
                    return (CharSequence) obj;
                }
            }
            if (i != 0) {
            }
            return (CharSequence) obj;
        } catch (CancellationException e) {
            throw e;
        }
        textTemplatesReplacer$replaceFormattedText$1 = new TextTemplatesReplacer$replaceFormattedText$1(this, continuationImpl);
        TextTemplatesReplacer$replaceFormattedText$1 textTemplatesReplacer$replaceFormattedText$122 = textTemplatesReplacer$replaceFormattedText$1;
        Object obj2 = textTemplatesReplacer$replaceFormattedText$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = textTemplatesReplacer$replaceFormattedText$122.label;
    }
}
