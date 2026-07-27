package com.anythink.core.common.n.b;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public interface q {

    /* renamed from: a, reason: collision with root package name */
    public static final q f15866a = new A(1);

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ List a(String str) {
        if (str == null) {
            throw new UnknownHostException("hostname == null");
        }
        try {
            return Arrays.asList(InetAddress.getAllByName(str));
        } catch (NullPointerException e6) {
            UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(str));
            unknownHostException.initCause(e6);
            throw unknownHostException;
        }
    }

    List<InetAddress> lookup(String str);
}
