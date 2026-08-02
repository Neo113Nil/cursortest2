package ru.CryptoPro.JCPxml.dsig.internal.dom;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

/* loaded from: classes4.dex */
public final class Utils {
    private Utils() {
    }

    public static void checkProvider(String str) throws Exception {
        if (str != null && !str.equalsIgnoreCase("JCP") && !str.equalsIgnoreCase("JCSP")) {
            throw new Exception("Invalid provider: ".concat(str));
        }
    }

    public static String parseIdFromSameDocumentURI(String str) {
        if (str.length() == 0) {
            return null;
        }
        String substring = str.substring(1);
        if (!substring.startsWith("xpointer(id(")) {
            return substring;
        }
        int indexOf = substring.indexOf(39) + 1;
        return substring.substring(indexOf, substring.indexOf(39, indexOf));
    }

    public static byte[] readBytesFromStream(InputStream inputStream) throws IOException {
        int read;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        do {
            read = inputStream.read(bArr);
            if (read == -1) {
                break;
            }
            byteArrayOutputStream.write(bArr, 0, read);
        } while (read >= 1024);
        return byteArrayOutputStream.toByteArray();
    }

    public static boolean sameDocumentURI(String str) {
        return str != null && (str.length() == 0 || str.charAt(0) == '#');
    }

    public static Set toNodeSet(Iterator it) {
        HashSet hashSet = new HashSet();
        while (it.hasNext()) {
            Node node = (Node) it.next();
            hashSet.add(node);
            if (node.getNodeType() == 1) {
                NamedNodeMap attributes = node.getAttributes();
                int length = attributes.getLength();
                for (int i = 0; i < length; i++) {
                    hashSet.add(attributes.item(i));
                }
            }
        }
        return hashSet;
    }
}
