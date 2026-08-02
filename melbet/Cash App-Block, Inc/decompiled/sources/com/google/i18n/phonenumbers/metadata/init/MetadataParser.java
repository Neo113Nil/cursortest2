package com.google.i18n.phonenumbers.metadata.init;

import com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class MetadataParser {
    public static final Logger logger = Logger.getLogger(MetadataParser.class.getName());

    /* JADX WARN: Removed duplicated region for block: B:32:0x0066 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static List parse(InputStream inputStream) {
        Throwable th;
        IOException e;
        Logger logger2 = logger;
        if (inputStream == null) {
            return Collections.EMPTY_LIST;
        }
        InputStream inputStream2 = null;
        try {
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
                try {
                    ArrayList arrayList = new ArrayList();
                    int readInt = objectInputStream.readInt();
                    for (int i = 0; i < readInt; i++) {
                        Phonemetadata$PhoneMetadata phonemetadata$PhoneMetadata = new Phonemetadata$PhoneMetadata();
                        phonemetadata$PhoneMetadata.readExternal(objectInputStream);
                        arrayList.add(phonemetadata$PhoneMetadata);
                    }
                    if (arrayList.isEmpty()) {
                        throw new IllegalStateException("Empty metadata");
                    }
                    try {
                        objectInputStream.close();
                        return arrayList;
                    } catch (IOException e2) {
                        logger2.log(Level.WARNING, "Error closing input stream (ignored)", (Throwable) e2);
                        return arrayList;
                    }
                } catch (IOException e3) {
                    e = e3;
                    throw new IllegalStateException("Unable to parse metadata file", e);
                }
            } catch (Throwable th2) {
                th = th2;
                if (0 == 0) {
                    try {
                        inputStream2.close();
                    } catch (IOException e4) {
                        logger2.log(Level.WARNING, "Error closing input stream (ignored)", (Throwable) e4);
                    }
                } else {
                    try {
                        inputStream.close();
                    } catch (IOException e5) {
                        logger2.log(Level.WARNING, "Error closing input stream (ignored)", (Throwable) e5);
                    }
                }
                throw th;
            }
        } catch (IOException e6) {
            e = e6;
        } catch (Throwable th3) {
            th = th3;
            if (0 == 0) {
            }
            throw th;
        }
    }
}
