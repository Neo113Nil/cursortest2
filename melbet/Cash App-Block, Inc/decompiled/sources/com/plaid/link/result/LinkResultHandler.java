package com.plaid.link.result;

import android.content.Intent;
import com.plaid.link.OpenPlaidLink;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B-\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\u0010\bJ \u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fR\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/plaid/link/result/LinkResultHandler;", "", "onSuccess", "Lkotlin/Function1;", "Lcom/plaid/link/result/LinkSuccess;", "", "onExit", "Lcom/plaid/link/result/LinkExit;", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "onActivityResult", "", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public class LinkResultHandler {
    private final Function1<LinkExit, Unit> onExit;
    private final Function1<LinkSuccess, Unit> onSuccess;

    /* JADX WARN: Multi-variable type inference failed */
    public LinkResultHandler(Function1<? super LinkSuccess, Unit> function1, Function1<? super LinkExit, Unit> function12) {
        function1.getClass();
        function12.getClass();
        this.onSuccess = function1;
        this.onExit = function12;
    }

    public final boolean onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode != 3364) {
            return false;
        }
        LinkResult parseResult = new OpenPlaidLink().parseResult(resultCode, data);
        if (parseResult instanceof LinkSuccess) {
            this.onSuccess.invoke(parseResult);
            return true;
        }
        if (!(parseResult instanceof LinkExit)) {
            return true;
        }
        this.onExit.invoke(parseResult);
        return true;
    }
}
