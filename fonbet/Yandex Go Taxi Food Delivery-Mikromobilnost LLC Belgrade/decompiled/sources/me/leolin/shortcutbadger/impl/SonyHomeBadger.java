package me.leolin.shortcutbadger.impl;

import android.content.AsyncQueryHandler;
import android.content.ContentResolver;
import android.net.Uri;

/* loaded from: classes7.dex */
public class SonyHomeBadger {

    /* renamed from: me.leolin.shortcutbadger.impl.SonyHomeBadger$1, reason: invalid class name */
    class AnonymousClass1 extends AsyncQueryHandler {
        public AnonymousClass1(ContentResolver contentResolver) {
            super(contentResolver);
        }
    }

    public SonyHomeBadger() {
        Uri.parse("content://com.sonymobile.home.resourceprovider/badge");
    }
}
