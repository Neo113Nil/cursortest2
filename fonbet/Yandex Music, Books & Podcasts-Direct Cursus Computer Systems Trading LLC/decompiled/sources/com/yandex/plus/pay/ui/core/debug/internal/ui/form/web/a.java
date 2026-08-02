package com.yandex.plus.pay.ui.core.debug.internal.ui.form.web;

import android.content.Context;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import com.yandex.plus.webview.api.contract.b;
import com.yandex.plus.webview.api.contract.c;
import com.yandex.plus.webview.core.d;
import defpackage.hlr;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes5.dex */
public final class a extends b implements c, com.yandex.plus.webview.api.a {
    public List b;

    @Override // com.yandex.plus.webview.api.a
    public final void b(String str) {
        str.getClass();
        d w = w();
        if (w != null) {
            w.b("\n            document.documentElement.style.overflow = 'auto';\n            document.body.style.overflow = 'auto';\n            document.body.style.touchAction = 'pan-y';\n        ");
        }
        d w2 = w();
        if (w2 != null) {
            w2.b("\n            document.addEventListener('DOMContentLoaded', function() {\n                const style = document.createElement('style');\n                style.textContent = `\n                    html, body {\n                        background: transparent !important;\n                    }\n                    \n                    .g-root,\n                    .local_wrapper {\n                        background-color: transparent !important;\n                    }\n                    \n                    #root {\n                        background: transparent !important;\n                    }\n                `;\n                document.head.appendChild(style);\n            });\n        ");
        }
    }

    @Override // com.yandex.plus.webview.api.contract.c
    public final int e(Context context) {
        context.getClass();
        return 0;
    }

    @Override // com.yandex.plus.webview.api.a
    public final void s(String str) {
        str.getClass();
        d w = w();
        if (w != null) {
            List list = this.b;
            list.getClass();
            w.b(hlr.d("\n            window.addEventListener('message', function(event) {\n                if (event.data === 'ping') {\n                    " + CollectionsKt.X(list, StringUtil.LF, null, null, new com.yandex.plus.pay.ui.common.internal.error.content.b(5), 30) + "\n                }\n            });\n        "));
        }
    }
}
