package ru.yandex.video.m3.ott.data.net.impl;

import defpackage.t4j0;
import java.util.Arrays;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\u001a\u0019\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0004\"\u0014\u0010\u0007\u001a\u00020\u00018\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\b\"\u0014\u0010\t\u001a\u00020\u00018\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\b\"\u0014\u0010\n\u001a\u00020\u00018\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Lt4j0;", "", "authToken", "addAuthHeader", "(Lt4j0;Ljava/lang/String;)Lt4j0;", "userAgent", "addUserAgent", "HEADER_USER_AGENT", "Ljava/lang/String;", "HEADER_AUTHORIZATION_KEY", "HEADER_AUTH_TOKEN_VALUE_TEMPLATE", "video-player_internalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ExtFunctionsKt {
    private static final String HEADER_AUTHORIZATION_KEY = "Authorization";
    private static final String HEADER_AUTH_TOKEN_VALUE_TEMPLATE = "OAuth %s";
    public static final String HEADER_USER_AGENT = "User-Agent";

    public static final t4j0 addAuthHeader(t4j0 t4j0Var, String str) {
        t4j0Var.a(HEADER_AUTHORIZATION_KEY, String.format(HEADER_AUTH_TOKEN_VALUE_TEMPLATE, Arrays.copyOf(new Object[]{str}, 1)));
        return t4j0Var;
    }

    public static final t4j0 addUserAgent(t4j0 t4j0Var, String str) {
        t4j0Var.a(HEADER_USER_AGENT, str);
        return t4j0Var;
    }
}
