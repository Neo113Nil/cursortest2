package defpackage;

import com.connectsdk.service.command.ServiceCommand;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.nio.ByteBuffer;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.StandardCharsets;
import java.util.TreeMap;

/* loaded from: classes5.dex */
public abstract class hma {
    public int a;
    public dsj b;

    public static String a(ByteBuffer byteBuffer) {
        ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
        byte b = 48;
        while (true) {
            if (!byteBuffer.hasRemaining()) {
                byteBuffer.position(byteBuffer.position() - allocate.position());
                allocate = null;
                break;
            }
            byte b2 = byteBuffer.get();
            allocate.put(b2);
            if (b == 13 && b2 == 10) {
                allocate.limit(allocate.position() - 2);
                allocate.position(0);
                break;
            }
            b = b2;
        }
        if (allocate == null) {
            return null;
        }
        byte[] array = allocate.array();
        int limit = allocate.limit();
        CodingErrorAction codingErrorAction = me4.a;
        return new String(array, 0, limit, StandardCharsets.US_ASCII);
    }

    public abstract void b();

    /* JADX WARN: Multi-variable type inference failed */
    public final p9 c(ByteBuffer byteBuffer) {
        isd isdVar;
        int i = this.a;
        String a = a(byteBuffer);
        if (a == null) {
            throw new kie(byteBuffer.capacity() + 128);
        }
        String[] split = a.split(StringUtil.SPACE, 3);
        if (split.length != 3) {
            throw new wxe(1002);
        }
        if (i == 1) {
            if (!"101".equals(split[1])) {
                throw new wxe(hrg.r("Invalid status code received: ", split[1], " Status line: ", a));
            }
            if (!"HTTP/1.1".equalsIgnoreCase(split[0])) {
                throw new wxe(hrg.r("Invalid status line received: ", split[0], " Status line: ", a));
            }
            jsd jsdVar = new jsd(7);
            Short.parseShort(split[1]);
            jsdVar.b = split[2];
            isdVar = jsdVar;
        } else {
            if (!ServiceCommand.TYPE_GET.equalsIgnoreCase(split[0])) {
                throw new wxe(hrg.r("Invalid request method received: ", split[0], " Status line: ", a));
            }
            if (!"HTTP/1.1".equalsIgnoreCase(split[2])) {
                throw new wxe(hrg.r("Invalid status line received: ", split[2], " Status line: ", a));
            }
            isd isdVar2 = new isd();
            String str = split[1];
            if (str == null) {
                xq0.x("http resource descriptor must not be null");
                return null;
            }
            isdVar2.b = str;
            isdVar = isdVar2;
        }
        String a2 = a(byteBuffer);
        while (a2 != null && a2.length() > 0) {
            String[] split2 = a2.split(StringUtils.PROCESS_POSTFIX_DELIMITER, 2);
            if (split2.length != 2) {
                throw new wxe("not an http header");
            }
            if (((TreeMap) isdVar.a).containsKey(split2[0])) {
                isdVar.D(split2[0], isdVar.t(split2[0]) + "; " + split2[1].replaceFirst("^ +", ""));
            } else {
                isdVar.D(split2[0], split2[1].replaceFirst("^ +", ""));
            }
            a2 = a(byteBuffer);
        }
        if (a2 != null) {
            return isdVar;
        }
        throw new kie();
    }

    public String toString() {
        return getClass().getSimpleName();
    }
}
