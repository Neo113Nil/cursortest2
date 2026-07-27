package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.UriMatcher;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Build;
import android.os.ext.SdkExtensions;
import android.provider.ContactsContract;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import t1.AbstractC5064a;

/* loaded from: classes.dex */
public final class m extends l {

    /* renamed from: x, reason: collision with root package name */
    public static final UriMatcher f23599x;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f23599x = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "contacts/#/display_photo", 4);
        uriMatcher.addURI("com.android.contacts", "phone_lookup/*", 5);
    }

    @Override // com.bumptech.glide.load.data.d
    public final Class a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.l
    public final void d(Object obj) {
        ((InputStream) obj).close();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006f  */
    @Override // com.bumptech.glide.load.data.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(ContentResolver contentResolver, Uri uri) {
        InputStream openContactPhotoInputStream;
        int extensionVersion;
        int match = f23599x.match(uri);
        if (match != 1) {
            if (match == 3) {
                openContactPhotoInputStream = ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri, true);
            } else if (match != 5) {
                if (this.f23595n && AbstractC5064a.a(uri) && Build.VERSION.SDK_INT >= 30) {
                    extensionVersion = SdkExtensions.getExtensionVersion(30);
                    if (extensionVersion >= 17) {
                        AssetFileDescriptor b9 = AbstractC5064a.b(contentResolver, uri);
                        if (b9 == null) {
                            throw new FileNotFoundException("FileDescriptor is null for: " + uri);
                        }
                        try {
                            openContactPhotoInputStream = b9.createInputStream();
                        } catch (IOException e6) {
                            try {
                                b9.close();
                            } catch (Exception unused) {
                            }
                            throw ((FileNotFoundException) new FileNotFoundException("Unable to create stream").initCause(e6));
                        }
                    }
                }
                openContactPhotoInputStream = contentResolver.openInputStream(uri);
            }
            if (openContactPhotoInputStream == null) {
                return openContactPhotoInputStream;
            }
            throw new FileNotFoundException("InputStream is null for " + uri);
        }
        Uri lookupContact = ContactsContract.Contacts.lookupContact(contentResolver, uri);
        if (lookupContact == null) {
            throw new FileNotFoundException("Contact cannot be found");
        }
        openContactPhotoInputStream = ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, lookupContact, true);
        if (openContactPhotoInputStream == null) {
        }
    }
}
