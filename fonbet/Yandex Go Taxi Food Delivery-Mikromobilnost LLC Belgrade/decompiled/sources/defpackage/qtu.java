package defpackage;

import com.adjust.sdk.Constants;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import okio.ByteString;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;

/* loaded from: classes9.dex */
public abstract class qtu {
    public static final y8u[] a;
    public static final Map b;

    static {
        y8u y8uVar = new y8u("", y8u.i);
        ByteString byteString = y8u.f;
        y8u y8uVar2 = new y8u("GET", byteString);
        y8u y8uVar3 = new y8u("POST", byteString);
        ByteString byteString2 = y8u.g;
        y8u y8uVar4 = new y8u("/", byteString2);
        y8u y8uVar5 = new y8u("/index.html", byteString2);
        ByteString byteString3 = y8u.h;
        y8u y8uVar6 = new y8u("http", byteString3);
        y8u y8uVar7 = new y8u(Constants.SCHEME, byteString3);
        ByteString byteString4 = y8u.e;
        y8u[] y8uVarArr = {y8uVar, y8uVar2, y8uVar3, y8uVar4, y8uVar5, y8uVar6, y8uVar7, new y8u("200", byteString4), new y8u("204", byteString4), new y8u("206", byteString4), new y8u("304", byteString4), new y8u("400", byteString4), new y8u("404", byteString4), new y8u("500", byteString4), new y8u("accept-charset", ""), new y8u("accept-encoding", "gzip, deflate"), new y8u("accept-language", ""), new y8u("accept-ranges", ""), new y8u("accept", ""), new y8u("access-control-allow-origin", ""), new y8u("age", ""), new y8u("allow", ""), new y8u("authorization", ""), new y8u("cache-control", ""), new y8u("content-disposition", ""), new y8u("content-encoding", ""), new y8u("content-language", ""), new y8u("content-length", ""), new y8u("content-location", ""), new y8u("content-range", ""), new y8u("content-type", ""), new y8u("cookie", ""), new y8u(MetaDataField.DATE_FIELD, ""), new y8u("etag", ""), new y8u("expect", ""), new y8u("expires", ""), new y8u("from", ""), new y8u(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST, ""), new y8u("if-match", ""), new y8u("if-modified-since", ""), new y8u("if-none-match", ""), new y8u("if-range", ""), new y8u("if-unmodified-since", ""), new y8u("last-modified", ""), new y8u("link", ""), new y8u("location", ""), new y8u("max-forwards", ""), new y8u("proxy-authenticate", ""), new y8u("proxy-authorization", ""), new y8u("range", ""), new y8u("referer", ""), new y8u("refresh", ""), new y8u("retry-after", ""), new y8u("server", ""), new y8u("set-cookie", ""), new y8u("strict-transport-security", ""), new y8u("transfer-encoding", ""), new y8u("user-agent", ""), new y8u("vary", ""), new y8u("via", ""), new y8u("www-authenticate", "")};
        a = y8uVarArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61, 1.0f);
        for (int i = 0; i < 61; i++) {
            if (!linkedHashMap.containsKey(y8uVarArr[i].a)) {
                linkedHashMap.put(y8uVarArr[i].a, Integer.valueOf(i));
            }
        }
        b = Collections.unmodifiableMap(linkedHashMap);
    }

    public static void a(ByteString byteString) {
        int h = byteString.h();
        for (int i = 0; i < h; i++) {
            byte m = byteString.m(i);
            if (65 <= m && m < 91) {
                ny61.v("PROTOCOL_ERROR response malformed: mixed case name: ".concat(byteString.w()));
                return;
            }
        }
    }
}
