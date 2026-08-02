package com.squareup.cash.db;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import okhttp3.ResponseBody;
import okio.Buffer;
import retrofit2.Converter;

/* loaded from: classes.dex */
public final class WireRepeatedAdapter implements Converter {
    public final ProtoAdapter adapter;

    public WireRepeatedAdapter(ProtoAdapter protoAdapter, int i) {
        switch (i) {
            case 1:
                this.adapter = protoAdapter;
                break;
            default:
                protoAdapter.getClass();
                this.adapter = protoAdapter;
                break;
        }
    }

    @Override // retrofit2.Converter
    public Object convert(Object obj) {
        ResponseBody responseBody = (ResponseBody) obj;
        try {
            return (Message) this.adapter.decode(responseBody.source());
        } finally {
            responseBody.close();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Object decode(Serializable serializable) {
        byte[] bArr = (byte[]) serializable;
        ArrayList arrayList = new ArrayList();
        Buffer buffer = new Buffer();
        buffer.write(bArr, 0, bArr.length);
        ProtoReader protoReader = new ProtoReader(buffer);
        protoReader.beginMessage();
        while (protoReader.nextTag() != -1) {
            arrayList.add(this.adapter.decode(protoReader));
        }
        return arrayList;
    }

    public Object encode(Object obj) {
        List list = (List) obj;
        list.getClass();
        Buffer buffer = new Buffer();
        ProtoWriter protoWriter = new ProtoWriter(buffer);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.adapter.encodeWithTag(protoWriter, 1, it.next());
        }
        return buffer.readByteArray(buffer.size);
    }
}
