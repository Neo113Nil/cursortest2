package com.squareup.cash.contacts.photo;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import android.util.LruCache;
import com.squareup.cash.permissions.PermissionChecker;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.text.StringsKt__StringsKt;
import okio.Utf8;

/* loaded from: classes.dex */
public final class ContactPhotoResolver {
    public final Context context;
    public final PermissionChecker permissionChecker;
    public final LruCache uriCache = new LruCache(512);

    public ContactPhotoResolver(Context context, PermissionChecker permissionChecker) {
        this.context = context;
        this.permissionChecker = permissionChecker;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0134, code lost:
    
        bo.app.a$$ExternalSyntheticBUOutline0.m$3(androidx.camera.video.Recorder$$ExternalSyntheticOutline2.m("Invalid query key: ", r6[0]));
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x013f, code lost:
    
        return null;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x012f A[LOOP:1: B:11:0x0048->B:36:0x012f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0133 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0106 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Uri getPhotoUri(String str) {
        List split$default;
        Collection collection;
        List split$default2;
        Collection collection2;
        Uri withAppendedPath;
        Cursor query;
        split$default = StringsKt__StringsKt.split$default(str, new String[]{"&"}, false, 0, 6, null);
        if (!split$default.isEmpty()) {
            ListIterator listIterator = split$default.listIterator(split$default.size());
            while (listIterator.hasPrevious()) {
                if (((String) listIterator.previous()).length() != 0) {
                    collection = CollectionsKt.take(split$default, listIterator.nextIndex() + 1);
                    break;
                }
            }
        }
        collection = EmptyList.INSTANCE;
        String[] strArr = (String[]) collection.toArray(new String[0]);
        int length = strArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            split$default2 = StringsKt__StringsKt.split$default(strArr[i], new String[]{"="}, false, 0, 6, null);
            if (!split$default2.isEmpty()) {
                ListIterator listIterator2 = split$default2.listIterator(split$default2.size());
                while (listIterator2.hasPrevious()) {
                    if (((String) listIterator2.previous()).length() != 0) {
                        collection2 = CollectionsKt.take(split$default2, listIterator2.nextIndex() + 1);
                        break;
                    }
                }
            }
            collection2 = EmptyList.INSTANCE;
            String[] strArr2 = (String[]) collection2.toArray(new String[0]);
            String str2 = strArr2[0];
            int hashCode = str2.hashCode();
            if (hashCode == 114009) {
                if (!str2.equals("sms")) {
                    break;
                }
                withAppendedPath = Uri.withAppendedPath(ContactsContract.CommonDataKinds.Phone.CONTENT_FILTER_URI, Uri.encode(strArr2[1]));
                withAppendedPath.getClass();
                query = this.context.getContentResolver().query(withAppendedPath, new String[]{"photo_uri"}, null, null, null);
                if (query != null) {
                }
                Utf8.closeFinally(query, null);
                if (r5 == null) {
                }
            } else if (hashCode == 96619420) {
                if (!str2.equals("email")) {
                    break;
                }
                withAppendedPath = Uri.withAppendedPath(ContactsContract.CommonDataKinds.Email.CONTENT_LOOKUP_URI, Uri.encode(strArr2[1]));
                withAppendedPath.getClass();
                query = this.context.getContentResolver().query(withAppendedPath, new String[]{"photo_uri"}, null, null, null);
                if (query != null) {
                }
                Utf8.closeFinally(query, null);
                if (r5 == null) {
                }
            } else {
                if (hashCode != 1264459009 || !str2.equals("recipient_id")) {
                    break;
                }
                withAppendedPath = Uri.withAppendedPath(ContactsContract.Contacts.CONTENT_LOOKUP_URI, Uri.encode(strArr2[1]));
                withAppendedPath.getClass();
                query = this.context.getContentResolver().query(withAppendedPath, new String[]{"photo_uri"}, null, null, null);
                if (query != null) {
                    try {
                        if (query.moveToFirst()) {
                            int columnIndex = query.getColumnIndex("photo_uri");
                            if (columnIndex >= 0) {
                                String string2 = query.getString(columnIndex);
                                r5 = string2 != null ? Uri.parse(string2) : null;
                            }
                            query.close();
                            if (r5 == null) {
                                return r5;
                            }
                            i++;
                        }
                    } finally {
                    }
                }
                Utf8.closeFinally(query, null);
                if (r5 == null) {
                }
            }
        }
    }
}
